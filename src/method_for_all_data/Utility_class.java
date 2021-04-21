package method_for_all_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class 
{
	public static void scrnshot(WebDriver driver, int TCID) throws EncryptedDocumentException, IOException
	{
		File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\91976\\eclipse-workspace\\FrameWork_Selenium\\ScrrenShot\\Screenshot_"+TCID+".jpg");
		FileHandler.copy(sfile, dest);		
	}
	
	public static String getExcelTD(int rowIndex,int colIndex) throws  IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\91976\\eclipse-workspace\\FrameWork_Selenium\\src\\method_for_all_data\\test data\\Kite login data.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("sheet1");
		String data = sheet1.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return(data);
	}

}
