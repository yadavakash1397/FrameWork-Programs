package flipkart_automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_page 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\Software For Testing\\selenium\\90_chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/?ef_id=c61a9921fc6f1ebc4662f95e0f9c2066:G:s&s_kwcid=AL!739!10!76347481385536!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");

		//1
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//2
		String data = driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).getText();
		
		
		
		
		
	}

}
