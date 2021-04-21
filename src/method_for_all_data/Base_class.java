package method_for_all_data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	public static WebDriver driver;
	
	public static void open_browser()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
	}
	
}
