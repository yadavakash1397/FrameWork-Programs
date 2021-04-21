package kite_pom_pagefactory_testNG_systematic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Kite_test 
{
	WebDriver driver;
	Login_page lp;
	Dashboard_page dp;
	PinPage pp;
	Profile_page propg;
	Sheet sheet1;
	
	@BeforeMethod
	public void browser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
					"D:\\All about Software testing\\Software For Testing\\selenium\\90_chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		lp=new Login_page(driver);
		dp=new Dashboard_page(driver);
		pp=new PinPage(driver);
		propg=new Profile_page(driver);
		
		FileInputStream file=new FileInputStream("D:\\All about Software testing\\selenium\\DATA\\Excel data\\Kite login data.xlsx");
		sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
	}
	
//	@BeforeMethod
//	public void login()
//	{
//		lp.setLogin_pageusername(sheet1.getRow(3).getCell(6).getStringCellValue());
//		lp.setLogin_pagepassword(sheet1.getRow(4).getCell(6).getStringCellValue());
//		lp.clickLogin_pagelogin_butn();
//		
//		pp.setPinPagepin(sheet1.getRow(6).getCell(6).getStringCellValue());
//		pp.clickPinPagecont();
//	}
	
	@DataProvider(name="logindata")
	Object[][] method_for_providing_data()
	{
		Object s[][] =new Object[4][2];
		 s[0][0]="akash1";
		 s[0][1]="akashpass1";
		 
		 s[1][0]="akash2";
		 s[1][1]="akashpass2";
		 
		 s[2][0]="akash3";
		 s[2][1]="akashpass3";
		 
		 s[3][0]="akash4";
		 s[3][1]="akashpass4";
		return s;
		
	}

	
	@Test(dataProvider = "logindata")
	public void verify_Id(String username,String Password)
	{
		
			lp.setLogin_pageusername(username);
			lp.setLogin_pagepassword(Password);
			lp.clickLogin_pagelogin_butn();
			driver.quit();
//			pp.setPinPagepin(sheet1.getRow(6).getCell(6).getStringCellValue());
//			pp.clickPinPagecont();
//		
//		String exp=sheet1.getRow(3).getCell(6).getStringCellValue();
//		String act=dp.getDashboard_pageid();
//		Assert.assertEquals(act, exp,"both result are diff");
		
	}
	
	@AfterMethod
	public void logout()
	{
//		dp.clickDashboard_pageid();
//		propg.clickProfile_pagelogout();
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
