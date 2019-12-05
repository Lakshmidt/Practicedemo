package actionsacls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
		
	}
}
