package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Facebook_open 
{
	WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
					"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	
	}
	

}
