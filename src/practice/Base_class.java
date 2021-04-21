package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_class 
{
	public static WebDriver driver;
	public static void browser_open() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Utility_class.getValue_fromproperty("Url"));
		//driver.get("https://kite.zerodha.com/");
		
		
		
	}

}
