package practice;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_test extends Base_class
{
	Login_page lp;
	Dashboard_page dp;
	PinPage pp;
	Profile_page propg;
	int TCID;
		
	@BeforeClass
	public void browser() throws EncryptedDocumentException, IOException
	{
		browser_open();
		lp=new Login_page(driver);
		dp=new Dashboard_page(driver);
		pp=new PinPage(driver);
		propg=new Profile_page(driver);
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		lp.setLogin_pageusername(Utility_class.getValue_fromproperty("id"));
		lp.setLogin_pagepassword(Utility_class.getValue_fromproperty("password"));
		lp.clickLogin_pagelogin_butn();
		
		pp.setPinPagepin(Utility_class.getValue_fromproperty("pin"));
		pp.clickPinPagecont();
	}
	
	@Test
	public void verify_Id() throws IOException
	{	
		TCID=101;
		String exp=Utility_class.getExcelldata(3, 6);
		String act=dp.getDashboard_pageid();
		//Utility_class.capt_screenshot(driver, TCID);
		Assert.assertEquals(act, exp,"both result are diff");
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			Utility_class.capt_screenshot(driver, TCID);
		}
		dp.clickDashboard_pageid();
		propg.clickProfile_pagelogout();
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
