package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Urbanladder {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MICROSECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> lst = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		System.out.println(lst.size());
		WebDriverWait wait=new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.visibilityOfAllElements(lst));
		for(WebElement e:lst)
			System.out.println(e.getText());
		driver.close();
		
	}

}
