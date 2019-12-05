package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Samplecustomwait {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/Sample.html");
		WebElement e=driver.findElement(By.id("username"));
		e.sendKeys("Test yantra");
		String value=e.getAttribute("value");
		
		/*	if(value.equals("Test yantra"))
				{	
					driver.findElement(By.id("enterkey")).sendKeys("TY");
				}
			else
			{
				System.out.println("not equal");
			}*/
		
		WebDriverWait wait=new WebDriverWait(driver, 1);
		wait.until(new ExpectedCondition<Boolean>()
				{

					public Boolean apply(WebDriver  arg0) {
						// TODO Auto-generated method stub
						if(value.equals("Test yantra"))
							return driver.findElement(By.id("enterkey")).isDisplayed();
						return null;	
								}
		
				});
		driver.findElement(By.id("enterkey")).sendKeys("TY");
		Thread.sleep(2000);
		driver.close();
	}

}
