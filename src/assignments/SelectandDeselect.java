package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDeselect {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/Select.html");
		Select s=new Select(driver.findElement(By.id("slv")));
		List<WebElement> lst = s.getOptions();
		for(int i=lst.size()-1;i>=0;i--)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		for(int i=lst.size()-1;i>=0;i--)
		{
			s.deselectByIndex(i);
			Thread.sleep(1000);
		}
		driver.close();
	}
}
