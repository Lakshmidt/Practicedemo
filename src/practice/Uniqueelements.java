package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uniqueelements {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Lakshmi\\Desktop\\html codes\\Select.html");
		Select s=new Select(driver.findElement(By.id("slv")));
		List<WebElement> lst = s.getOptions();
		System.out.println(lst.getClass().getName());
		for(int i=0;i<lst.size();i++)
		{
			boolean f=true;
			for(int j=0;j<lst.size();j++)
			{
				if((lst.get(i).getText().equals(lst.get(j).getText()))&& i!=j)
				{
					f=false;
					break;
				}
			}
			if(f)
				System.out.println(lst.get(i).getText());
		}
		driver.close();
	}
}
