package pom_facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//disable notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new  ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com/");
		
		//login page actions
		Login_page lp=new Login_page(driver);
		lp.setLogin_pageemail();
		lp.setLogin_pagepassword();
		lp.clickLogin_pagelogin_btn();
		
		//home page actions
		Home_page hp=new Home_page(driver);
		hp.clickHome_pageaccount();
		
		//profile page
		profile_page pp=new profile_page(driver);
		pp.verifyprofile_pagename();
		pp.clickprofile_pagelogout();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
