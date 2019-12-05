package experiment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtabexp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//a[text()='Gmail']")).sendKeys(Keys.CONTROL,Keys.RETURN);
		driver.quit();
	}

}
