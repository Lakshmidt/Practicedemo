package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=1re7nsig9qvg9");
		System.out.println(driver.getTitle());
	}

}
