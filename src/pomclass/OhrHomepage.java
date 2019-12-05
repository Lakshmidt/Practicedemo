package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OhrHomepage {
	@FindBy(id="welcome")
	private WebElement admin;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public OhrHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickadmin()
	{		
		admin.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
}
