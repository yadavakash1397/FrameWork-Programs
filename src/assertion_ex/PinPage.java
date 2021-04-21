package assertion_ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage
{
	//1
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	
	@FindBy(xpath = "//button[text()='Continue ']")private WebElement cont;
	
	//2
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	public void setPinPagepin(String pn)
	{
		pin.sendKeys(pn);
	}
	
	public void clickPinPagecont()
	{
		cont.click();
	}
	
}
