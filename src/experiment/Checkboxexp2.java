package experiment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxexp2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(100,500)");
		List<WebElement> lst = driver.findElements(By.xpath("//label[input[@class='cb1-element']]"));
		for(WebElement ele:lst)
		{
			System.out.println(ele.getText());
			ele.click();
			Thread.sleep(2000);
		}
		for(int i=lst.size()-1;i>=0;i--)
		{
			lst.get(i).click();
			Thread.sleep(2000);
		}
		for(int i=0;i<=lst.size()-1;i+=2)
		{
			lst.get(i).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.id("check1")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("check1")).click();
		ExpectedCondition<Boolean> d = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d)
			{
				return d.findElement(By.id("check1")).getAttribute("value").contains("Uncheck All");
			}
		};
		(new WebDriverWait(driver,10)).until(d);
		System.out.println(d.getClass().getName());
		driver.findElement(By.id("check1")).click();
		//Thread.sleep(2000);
		lst.get(0).click();
		Thread.sleep(2000);
		lst.get(lst.size()-1).click();
	}

}
