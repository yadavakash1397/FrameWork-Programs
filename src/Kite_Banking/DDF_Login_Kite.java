package Kite_Banking;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF_Login_Kite 
{

	public static void main(String[] args) throws  IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\Software For Testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit timeout
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//excel file open
		FileInputStream file=new FileInputStream("D:\\All about Software testing\\selenium\\DATA\\Excel data\\Kite login data.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//website open
		String URL = sheet1.getRow(2).getCell(6).getStringCellValue();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
		//enter username
		String username = sheet1.getRow(3).getCell(6).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);
		
		//enter password
		String password = sheet1.getRow(4).getCell(6).getStringCellValue();		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		//click on login
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//enter pin
		String pin = sheet1.getRow(6).getCell(6).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		//click continue
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//verify id
		String actual_name = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expected_name = sheet1.getRow(7).getCell(6).getStringCellValue();
		
		if(expected_name.equals(actual_name))
		{
			System.out.println(expected_name+" is verified.. Test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
		//log out
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		
	}

}
