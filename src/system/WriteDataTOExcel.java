package system;
/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataTOExcel
{

	public static void writeDataToExcel() throws EncryptedDocumentException, IOException
	{
		Scanner s1=new Scanner(System.in);
		FileInputStream fis=new FileInputStream("E:/UrbanLadder/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
		System.out.println("Enter the Test case");
		String test=s1.next();
		int row=sh.getLastRowNum();
		for (int i=0;i<=row;i++) 
		{
		     Row r = sh.getRow(i);
		     short c = r.getLastCellNum();
		     for(int j=0;j<c;j++)
		     {
		    	 Cell cell = r.getCell(j);
		    	 if(test.equals(cell.getStringCellValue()))
		    	 {
		    		 int index=i;
		    		 int col=j+1;
		    		 System.out.println(sh.getRow(index).getCell(col).getStringCellValue());
		    	 }
		     }
		}     
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 writeDataToExcel();
	}

}
*/
