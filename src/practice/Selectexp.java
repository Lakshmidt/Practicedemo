package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectexp {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/html codes/Select.html");
		Select s=new Select(driver.findElement(By.id("slv")));
		List<WebElement> lst = s.getOptions();
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("p");
		Thread.sleep(2000);
		s.selectByVisibleText("vada");
		Thread.sleep(2000);
		s.selectByIndex(lst.size()-1);
		System.out.println(s.getFirstSelectedOption());
		List<WebElement> lst1 = s.getAllSelectedOptions();
		
		for(WebElement e:lst1)
			System.out.println(e.getText());
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
			s.deselectByVisibleText("palao");
			s.deselectByValue("v");
			s.deselectByIndex(0);
			s.deselectAll();
		}
		System.out.println("-----------------");
		WebElement e1 = s.getWrappedElement();
		System.out.println(e1.getText());
		driver.close();
		
		
	}

}
