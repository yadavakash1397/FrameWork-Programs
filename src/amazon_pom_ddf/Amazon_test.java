package amazon_pom_ddf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon_test 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//disable notifications
		 ChromeOptions options=new ChromeOptions();
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 //open excel sheet
		 FileInputStream file=new FileInputStream("D:\\All about Software testing\\selenium\\DATA\\Excel data\\Amazon login data.xlsx");
		 Sheet sheet1 = WorkbookFactory.create(file).getSheet("credentials");
		 
		 //open website
		 driver.get(sheet1.getRow(2).getCell(1).getStringCellValue());
		 
		 //open signin page by clicking on sign
		 Home_page hp=new Home_page(driver);
		 hp.clickHome_pagesignIn();
		 
		 //enter credentials for username
		 SignIn_page_1 sp=new SignIn_page_1(driver);
		 sp.set_SignIn_page_phoneNo(sheet1.getRow(3).getCell(1).getStringCellValue());
		 sp.click_SignIn_page_cont();
		 
		 //enter credentials for password
		 SignIn_page_2 sp2=new SignIn_page_2(driver);
		 sp2.set_SignIn_page_2_password(sheet1.getRow(4).getCell(1).getStringCellValue());
		 sp2.click_SignIn_page_2_signbtn();
		 
		 //click on all option of home page
		 hp.clickHome_pageallmenu();
		 
		 //all page actions
		 Trending_page tp=new Trending_page(driver);
		 tp.verify_Trending_page_name(sheet1.getRow(5).getCell(1).getStringCellValue());
		 tp.click_Trending_page_mobile();
		
		 //mobile and tablet page actions
		 MobileandTablet_page mt=new MobileandTablet_page(driver);
		 mt.click_MobileandTablet_page_mobile();
		 Thread.sleep(3000);
		 
		 //again click on all on home page
		 hp.clickHome_pageallmenu();
		 Thread.sleep(5000);
		 
		 //logout
		 tp.click_Trending_page_signout();

	}

}
