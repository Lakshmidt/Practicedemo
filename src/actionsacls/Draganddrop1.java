package actionsacls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement dest = driver.findElement(By.xpath("//div[@id='droptarget']"));
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
}
