package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListisSorted {
		static 
		{
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		}
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Lakshmi/Desktop/Select.html");
			Select s=new Select(driver.findElement(By.id("slv")));
			List<WebElement> lst = s.getOptions();
			List <String>l=new ArrayList<>();
			List <String>srt = new ArrayList<>();
			for(WebElement e:lst)
			{
				l.add(e.getText());
				srt.add(e.getText());
			}
				Collections.sort(l);
			boolean f=false;
			for(int i=0;i<l.size()-1;i++)
			{
				if(srt.get(i).equals(l.get(i)))
					f=true;
				else
				{
					f=false;
					break;
				}
			}
			if(f)
				System.out.println("Elements are in sorted order");
			else
				System.out.println("Elements are not in sorted order");
			driver.close();
	}

}
