package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		String s=driver.getWindowHandle();
		System.out.println(s);
		driver.navigate().to("https://www.naukri.com/");
	//	driver.navigate().back();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1.size());
		System.out.println(s1);
		for(String a:s1)
		{
			System.out.println(a);
		}
		driver.quit();
		
	}

}
