package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrmloginpage {

	@FindBy(id="txtUsername")
	private WebElement us;
	@FindBy(id="txtPassword")
	private WebElement pw;
	@FindBy(id="btnLogin")
	private WebElement login;
	
	public Orangehrmloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setusername(String user)
	{
		us.sendKeys(user);
	}
	public void setpwd(String p)
	{
		pw.sendKeys(p);
	}
	public void login()
	{
		login.click();
	}
}
