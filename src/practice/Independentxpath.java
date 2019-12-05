package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independentxpath {

	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lakshmi/Desktop/Table.html");
		String s=driver.findElement(By.xpath("//td[text()='Sql']/../td[2]")).getText();
		System.out.println(s);
		String s1=driver.findElement(By.xpath("//td[text()='Unix']/../td[2]")).getText();
		System.out.println(s1);
		driver.close();
	
	}

}
