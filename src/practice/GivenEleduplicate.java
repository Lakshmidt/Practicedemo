package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GivenEleduplicate {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/Select.html");
		Select s=new Select(driver.findElement(By.id("slv")));
		String str="idly";
		List<WebElement> lst = s.getOptions();
		int  cnt=0;
		for(WebElement e:lst) 
		{
			if(e.getText().equals(str))
			{
				cnt++;
			}
		}
		if(cnt==2)
			System.out.println(str+" is duplicate");
		else
			System.out.println(str+" is not duplicate");
		
		driver.close();
	}
}
