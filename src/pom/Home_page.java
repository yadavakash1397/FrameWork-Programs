package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	//1
	@FindBy(xpath = "//span[@class='user-id']") private WebElement name_id;
	
	
	//2
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	
	void verify_name()
	{
		String Excpected="DV1510";
		String actual = name_id.getText();
		if(actual.equals(Excpected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	
	
	
	
	
	
}
