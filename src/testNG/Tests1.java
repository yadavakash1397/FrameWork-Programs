package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tests1
{
	WebDriver driver;
	FileInputStream file;
	Sheet sheet1;
	
	@BeforeClass
	public void Validate_URL() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//disable notifications
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		 driver=new ChromeDriver(option);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//excel Sheet open
		file=new FileInputStream("D:\\All about Software testing\\selenium\\DATA\\Excel data\\Kite login data.xlsx");
		sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//open url
		driver.manage().window().maximize();
		driver.get(sheet1.getRow(2).getCell(6).getStringCellValue());		
		
		//System.out.println("this is test case 1");
		Reporter.log("this is test case 1",true);
	}
	
	@BeforeMethod
	public void Validate_Username() throws EncryptedDocumentException, IOException
	{
		
		Login1_page lp=new Login1_page(driver);	
		lp.set_Login1_page_username(sheet1.getRow(3).getCell(6).getStringCellValue());
		lp.set_Login1_page_password(sheet1.getRow(4).getCell(6).getStringCellValue());
		lp.click_Login1_page_loginbtn();
	}
	
	@Test
	public void validate_pin() 
	{
		Pin_page pp=new Pin_page(driver);
		pp.set_Pin_page_pin(sheet1.getRow(6).getCell(6).getStringCellValue());
		pp.click_Pin_page_cont();
		Reporter.log("test pssjdsdjo");
	}
	
	@AfterMethod 
	public void logout()
	{
		Dashboard_page dp=new Dashboard_page(driver);
		dp.clickDashboard_pageid();
		Profile_page prp=new Profile_page(driver);
//		prp.verifyProfile_pagename(sheet1.getRow(7).getCell(6).getStringCellValue());
//		
		prp.clickProfile_pagelogout();
	}
}
