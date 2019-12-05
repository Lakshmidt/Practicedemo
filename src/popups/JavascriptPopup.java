package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptPopup {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.findElement(By.name("btnLogin")).click();
	//	Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}
}
