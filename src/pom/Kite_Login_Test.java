package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Login_Test 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	
		//first page
		Login_1_page login1=new Login_1_page(driver);
		login1.Enter_username();
		login1.Enter_password();
		login1.Click_login();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//second page
		Pin_page login2=new Pin_page(driver);
		login2.Enter_pin();
		login2.Click_continue();
		
		//third page
		Home_page hm=new Home_page(driver);
		hm.verify_name();		
		

	}

}
