package system;
/*
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//Thread.sleep(10);
		driver.get("https://www.irctc.co.in");
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//nav[@class='nav-bar hidden-xs text-right']/ul[@class='menu']/li[@class='menu-list header-icon-menu']/a[@aria-label='Menu Flight. Website will be opened in new tab']")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String pcids:ids)
		{
			driver.switchTo().window(pcids);
			
		}
	}

}
*/