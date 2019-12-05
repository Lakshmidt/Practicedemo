package actionsacls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String []srg)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		//driver.findElement(By.id("menu-item-381")).click();
		WebElement ele=driver.findElement(By.id("menu-item-381"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		WebElement e=driver.findElement(By.xpath("//div[text()='Human Resources']/parent::div[@class='row']/div[@class='col-md-8 col-sm-8 col-xs-8 ']"));
		System.out.println(e.getText());
	}
}
