package experiment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectActions {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/html%20codes/Select.html");
		Select s=new Select(driver.findElement(By.id("slv")));
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(4);
		s.deselectByIndex(1);
		s.deselectByIndex(0);
		List<WebElement> lst = s.getAllSelectedOptions();
		System.out.println(lst.getClass().getName());
		WebElement ele;
		
		driver.close();
	}

}
