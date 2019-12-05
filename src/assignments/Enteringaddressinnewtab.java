package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enteringaddressinnewtab {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://urbanladder.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		List<String> l=new ArrayList<>(driver.getWindowHandles());
		System.out.println(driver.getWindowHandles().getClass().getName());
		System.out.println(l.getClass().getName());
		String path=l.get(1);
		driver.switchTo().window(path);
		driver.get("http://www.google.com/");
	}

}
