package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_open
{	
	WebDriver driver;		
	@Test
	public void login2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
					"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}		
		
	
}
