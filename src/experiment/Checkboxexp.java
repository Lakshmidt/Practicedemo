package experiment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://smartwebby.com/PHP/Phptips2.asp");
		List<WebElement> lst = driver.findElements(By.xpath("//td[@class='examplelink']/input"));
		Thread.sleep(5000);
		String t = driver.findElement(By.xpath("//td[@class='examplelink']")).getText();
		System.out.println(t);
		/*for(int i=lst.size()-1;i>=0;i--)
		{
			lst.get(i).click();
			Thread.sleep(5000);
		}*/
		for(WebElement ele:lst)
		{
			if(ele.isSelected())
			{
				System.out.println(ele.getAttribute("value"));
			}
			else
				ele.click();
			Thread.sleep(5000);
			System.out.println(ele.getText());
		}
	}

}
