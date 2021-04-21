package kite_buy_stock;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Buy_stock 
{
	@FindBy(xpath = "//input[@step='1']")private WebElement quantity;
	
	@FindBy(xpath = "//input[@label='Price']")private WebElement price;
	
	@FindBy(xpath = "//input[@label='Trigger price']")private WebElement trigger_price;
	
	@FindBy(xpath = "//label[text()='SL']")private WebElement stoploss_radio;
	
	@FindBy(xpath = "//button/span[text()='Buy']")private WebElement buy;
	
	Kite_Buy_stock(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	void set_Kite_Buy_stock_quantity(String qty)
	{
		quantity.clear();
		quantity.sendKeys(qty);
	}
	
	void set_Kite_Buy_stock_price(String prc)
	{
		price.clear();
		
		price.sendKeys(prc);
	}
	
	void click_Kite_Buy_stock_stoplossradio()
	{
		stoploss_radio.click();	
	}
	
	void set_Kite_Buy_stock_trigger_price(String tp,Actions act)
	{
		trigger_price.click();
		trigger_price.clear();
	//	act.click(trigger_price).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).build().perform();
		trigger_price.sendKeys(tp);
	}
	
	void click_Kite_Buy_stock_buy()
	{
		buy.click();
	}
}
