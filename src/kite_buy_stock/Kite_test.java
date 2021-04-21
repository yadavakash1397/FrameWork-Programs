package kite_buy_stock;

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
import org.openqa.selenium.interactions.Actions;

public class Kite_test 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		//excel sheet import
		FileInputStream file=new FileInputStream("D:\\All about Software testing\\selenium\\DATA\\Excel data\\Kite login data.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//login page actions
		Login_page lp=new Login_page(driver);
		lp.setLogin_pageusername(sheet1.getRow(3).getCell(6).getStringCellValue());
		lp.setLogin_pagepassword(sheet1.getRow(4).getCell(6).getStringCellValue());
		lp.clickLogin_pagelogin_butn();
		
		
		//pin page actions
		PinPage pp=new PinPage(driver);
		pp.setPinPagepin(sheet1.getRow(6).getCell(6).getStringCellValue());
		pp.clickPinPagecont();
		
		//home page actions
		Dashboard_page dp=new Dashboard_page(driver);
		dp.verifyDashboard_pageid(sheet1.getRow(7).getCell(6).getStringCellValue());
//		dp.clickDashboard_pageid();
//		
//		//profile page actions
//		Profile_page prp=new Profile_page(driver);
//		prp.verifyProfile_pagename(sheet1.getRow(8).getCell(6).getStringCellValue());
//		prp.clickProfile_pagelogout();
		
		//serach box page actions
		Search_dashboard_page sdp=new Search_dashboard_page(driver);
		sdp.set_Search_dashboard_page_searchbox(sheet1.getRow(10).getCell(6).getStringCellValue());
		
		Actions act=new Actions(driver);
		//move to share
		sdp.move_Search_dashboard_page_tcsshare(act);
		
		//buy share tcs
		sdp.click_Search_dashboard_page_buytcsshare(act);
	
		//actions on popup for buying
		Kite_Buy_stock kbs=new Kite_Buy_stock(driver);
		kbs.set_Kite_Buy_stock_quantity(sheet1.getRow(11).getCell(6).getStringCellValue());
		kbs.set_Kite_Buy_stock_price(sheet1.getRow(12).getCell(6).getStringCellValue());
		kbs.click_Kite_Buy_stock_stoplossradio();
		kbs.set_Kite_Buy_stock_trigger_price(sheet1.getRow(13).getCell(6).getStringCellValue(),act);
		kbs.click_Kite_Buy_stock_buy();
		
		
		
		
		
		
		

	}

}
