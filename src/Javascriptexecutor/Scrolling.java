package Javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolling {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://urbanladder.com/");
		WebElement e = driver.findElement(By.xpath("//div[@class='popup-text text-center vert large-6 columns']/a[1]"));
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='popup-text text-center vert large-6 columns']/a[1]")));
		e.click();
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		for(int i=0;i<10;i++)
		{
			scroll.executeScript("window.scrollBy(0,500)");
			Thread.sleep(500);
		}
		for(int i=0;i<10;i++)
		{
			scroll.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(500);
		}
		scroll.executeScript("window.open()");
	}

}
