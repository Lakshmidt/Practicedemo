package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(name="username")
	private WebElement us;
	@FindBy(name="pwd")
	private WebElement pwd;
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	@FindBy(className="errormsg")
	private WebElement err;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setusername(String us)
	{
		this.us.sendKeys(us);
	}
	public void setpwd(String p)
	{
		pwd.sendKeys(p);
	}
	public void login()
	{
		login.click();
	}
	public String errmsg() 
	{
		return err.getText();
	}
	public void clearuser()
	{
		us.clear();
	}
}
