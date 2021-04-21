package compatibility_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CTWithParralelTest 
{
	
	@Parameters("browserName")
	@Test
	public void CT(String browserNam) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver",
//			"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = null;
		if(browserNam.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			
		}
		else if(browserNam.equals("firefox"))
		{

			System.setProperty("webdriver.chrome.driver",
					"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
     		Thread.sleep(3000);
			
		}
		else if(browserNam.equals("IE"))
		{

			System.setProperty("webdriver.chrome.driver",
					"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();	
			driver.get("https://www.instagram.com/");
			Thread.sleep(5000);

		}
		
		
		driver.close();
		
	}
}
