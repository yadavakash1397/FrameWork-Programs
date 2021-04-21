package kite_buy_stock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_dashboard_page 
{
	//1
	@FindBy(xpath = "//input[@id='search-input']")private WebElement search_box;
	
	@FindBy(xpath = "//li[@class='search-result-item selected isadded']") private WebElement tcs_share;
	
	@FindBy(xpath = "(//button[@class='button-blue'])[1]") private WebElement buy_tcs_share;

	//2
	public  Search_dashboard_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	public void set_Search_dashboard_page_searchbox(String data)
	{
		search_box.sendKeys(data);
	}
	
	public void move_Search_dashboard_page_tcsshare(Actions act)
	{
		act.moveToElement(tcs_share).perform();
	}
	
	public void click_Search_dashboard_page_buytcsshare(Actions act)
	{
		act.click(buy_tcs_share).perform();
	}
}
