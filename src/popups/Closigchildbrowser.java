package popups;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closigchildbrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//driver.manage().window().maximize();
		Set <String>wh=driver.getWindowHandles();
		Iterator<String> it=wh.iterator();
		it.next();
		while(it.hasNext())
		{
		String s=(String) it.next();
			driver.switchTo().window(s);
			driver.close();
		}
		
		//another way
		String s=driver.getWindowHandle();
		wh.remove(s);
		for(String s1:wh)
		{
			driver.switchTo().window(s1);
			driver.close();
		}
	}
}
