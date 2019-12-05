package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateEle {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/html%20codes/Select.html");
		Select s=new Select(driver.findElement(By.id("slv")));
		List<WebElement> lst = s.getOptions();
		for(int i=0;i<lst.size();i++)
		{
			boolean f=false;
			int cnt=0;
			for(int j=i+1;j<lst.size();j++)
			{
				if((lst.get(i).getText().equals(lst.get(j).getText())))
				{
					cnt++;
					f=true;
					break;
				}
				else
					f=false;
			}
			if(cnt>=1)
				System.out.println("duplicate "+(lst.get(i).getText()));
			if(f)
			System.out.println("boolean "+lst.get(i).getText());
			if(!f)
				System.out.println("unique "+lst.get(i).getText());
		}
		driver.close();
	}
}
