package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
static
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://lenovo/login.do");
		By b=By.name("username");
		System.out.println(b);
		driver.findElement(b).sendKeys("admin");
	}

}
