package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class
{
	public static  void capt_screenshot(WebDriver driver, int TCID) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\91976\\eclipse-workspace\\FrameWork_Selenium\\ScrrenShot\\screenshot"+TCID+".jpg");
		FileHandler.copy(file, dest);
	}
	
	public static String getExcelldata(int rownum,int Colnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\test data\\Kite login data.xlsx");
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(rownum).getCell(Colnum).getStringCellValue();
		return data;	
	}

	public static String getValue_fromproperty(String key) throws IOException
	{
		Properties obj=new Properties();
		FileInputStream fileobj=new FileInputStream(System.getProperty("user.dir")+"\\practice.properties");
		//FileInputStream fileobj=new FileInputStream("C:\\Users\\91976\\eclipse-workspace\\FrameWork_Selenium\\practice.properties");
		obj.load(fileobj);
		
		return obj.getProperty(key);
	}
	
	
	
	
}
