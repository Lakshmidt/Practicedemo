package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeonlyperticular {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set <String>wh=driver.getWindowHandles();
		for(String w:wh)
		{
			String s=driver.switchTo().window(w).getTitle();
			if(s.equals("Cognizant"))
				driver.close();
		}
	}
}
