package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildbrowserPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Set<String> wh = driver.getWindowHandles();
		for(String w:wh)
		{
			driver.switchTo().window(w);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}

}
