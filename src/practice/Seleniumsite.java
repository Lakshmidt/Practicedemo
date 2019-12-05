package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsite {

	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		String s=driver.findElement(By.xpath("//tr[1]/td[text()='Java']/../td[2]")).getText();
		System.out.println("Client varsion of Java: "+s);
		String s1=driver.findElement(By.xpath("//tr[5]/td[text()='Javascript (Node)']/../td[2]")).getText();
		System.out.println("Client varsion of Javascript: "+s1);
		//driver.close();
	}

}
