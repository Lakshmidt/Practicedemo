package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderpopup {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.xpath("//div[@class='spritimg dob-sprit-img']")).click();
		driver.findElement(By.xpath("//div[@id='date-picker']//li[@class='currentdate']/a[contains(.,1)]")).click();
		driver.findElement(By.id("proceed")).click();
		driver.close();
	}
}
