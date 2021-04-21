package Yogesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\All about Software testing\\Software For Testing\\selenium\\90_chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://itivity.net/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

}
}
