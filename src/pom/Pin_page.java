package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page 
{
	//step1	Elements
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	
	@FindBy(xpath = "//button[text()='Continue ']")private WebElement continu;
	
	//step2 Constructor initialize data members
	public Pin_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3 methods
	public void Enter_pin()
	{
		pin.sendKeys("959594");
	}
	
	public void Click_continue()
	{
		continu.click();
	}
	
}
