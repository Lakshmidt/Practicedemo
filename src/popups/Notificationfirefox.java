package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notificationfirefox {
	static
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions options=new FirefoxOptions();
		options.addPreference("geo.disable", true);
		options.addPreference("dom.webnotifications.enabled",false);
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
	}

}
