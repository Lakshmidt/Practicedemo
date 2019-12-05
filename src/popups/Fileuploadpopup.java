package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
	}
	public static void main(String []args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/html%20codes/Fileupload.html");
		String s="C:\\Users\\Lakshmi\\Desktop\\Fileupload.docx";
		driver.findElement(By.id("f1")).sendKeys(s);
	}
}
