package actionsacls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclickexp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://lenovo/login.do");
		WebElement e = driver.findElement(By.xpath("//a[text()='Actimind Inc.']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.contextClick(e).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}

}
