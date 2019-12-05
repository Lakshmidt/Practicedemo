package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesdemo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}

}
