package popups;

//import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closingonlyparent {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//driver.manage().window().maximize();
		//Set <String>wh=driver.getWindowHandles();
	//	String s=driver.getWindowHandle();
		//System.out.println(s);
		driver.close();
	}
}
