package slide1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizntalSlideToEnd
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryui.com/slider/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		Dimension sliderSize = slider.getSize();
		int width = sliderSize.getWidth();
		int x=slider.getLocation().getX();
		Actions act=new Actions(driver);
		for(int i=1;i<=2;i++)
		{
			
			Thread.sleep(3000);
			act.clickAndHold(slider).moveByOffset(x,0).build().perform();
			x=x+width;
		}
		int y=slider.getLocation().getX();
		for(int i=2;i>=1;i--)
		{
			
			Thread.sleep(3000);
			act.clickAndHold(slider).moveByOffset(-y,0).build().perform();
			y=y+width;
		}

	}

}
