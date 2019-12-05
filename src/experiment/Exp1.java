package experiment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exp1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		By b = By.name("q");
		System.out.println(b.getClass().getName());
//		driver.findElement(By.name("q")).sendKeys("google");
//		driver.findElement(By.name("q")).sendKeys("gmail");
//		Thread.sleep(2000);
//		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		//driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"t",Keys.ENTER);
		/******************************This is for launching new tab and entering url***************************/
		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_T);
//		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
//		Set<String> win = driver.getWindowHandles();
//		System.out.println(win.size());
//		List<String> lst=new ArrayList<>(win);
//		System.out.println(lst.size());
//		driver.switchTo().window(lst.get(1));
//		driver.get("http:\\naukri.com");
//		driver.quit();
	
		/*******************This is for Rightclick action*******************/
		WebElement ele = driver.findElement(By.xpath("//div[@id='SIvCob']/a[7]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		//a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build()
		a.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}

}
