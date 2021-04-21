package assertion_ex;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_method 
{
	WebDriver driver;
	FileInputStream file;
	Sheet sheet1;
	SoftAssert sa;
	
	@BeforeClass
	public void preconditions()
	{
		System.setProperty("webdriver.chrome.driver",
					"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");	
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		 file=new FileInputStream("D:\\All about Software testing\\selenium\\DATA\\Excel data\\Kite login data.xlsx");
		  sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		  Login_page lp=new Login_page(driver);
		  try
		  {
			  lp.setLogin_pageusername(sheet1.getRow(3).getCell(6).getStringCellValue());
		  }
		  catch(Exception ex)
		  {
			  
		  }
		 
		  lp.setLogin_pagepassword(sheet1.getRow(4).getCell(6).getStringCellValue());
		  lp.clickLogin_pagelogin_butn();
		  
		  PinPage pp=new PinPage(driver);
		  pp.setPinPagepin(sheet1.getRow(6).getCell(6).getStringCellValue());
		  pp.clickPinPagecont();
	}
	
	@Test(priority=1)
	public void verify_userid()
	{
		
		
		
		Dashboard_page dp =new Dashboard_page(driver);
		 sa=new SoftAssert();
		dp.verifyDashboard_pageid(sheet1.getRow(7).getCell(6).getStringCellValue(),sa);	
		
		dp.clickDashboard_pageid();
		sa.assertAll();
	}
	
	@Test(priority=2, dependsOnMethods = {"verify_userid"} )
	public void verify_name()
	{
		Dashboard_page dp=new Dashboard_page(driver);
		dp.clickDashboard_pageid();
		
		Profile_page pp=new Profile_page(driver);
		//SoftAssert sa=new SoftAssert();
		pp.verifyProfile_pagename(sheet1.getRow(8).getCell(6).getStringCellValue(),sa);
		sa.assertAll();
		
	}
	
	@AfterMethod
	public void logout()
	{
		Dashboard_page dp=new Dashboard_page(driver);
		//dp.clickDashboard_pageid();
		Profile_page pp=new Profile_page(driver);
		pp.clickProfile_pagelogout();
	}
	
	@AfterClass
	public void close_browser()
	{
		driver.quit();
	}

}
