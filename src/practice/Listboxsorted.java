package practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxsorted {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/Select.html");
		Select s=new Select(driver.findElement(By.id("slv")));
		List<WebElement> lst = s.getOptions();
		//using TreeSet
		TreeSet<String> ts=new TreeSet<>();
		for(WebElement e:lst)
		{
			ts.add(e.getText());
		}
		System.out.println(ts);
		driver.close();
	
	}
}
