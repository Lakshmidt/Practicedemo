package pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartpage {
	@FindBy (tagName="img")
	private List<WebElement> l;
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement close;
	
	public Flipkartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public int imgcount()
	{
		return l.size();
	}
	public void clickclose()
	{
		close.click();
	}
}
