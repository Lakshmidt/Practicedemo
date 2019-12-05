package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationchrome {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
	}

}
