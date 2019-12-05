package actionsacls;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menusandsubmenus {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://urbanladder.com/");
		WebElement e = driver.findElement(By.xpath("//div[@class='popup-text text-center vert large-6 columns']/a[1]"));
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='popup-text text-center vert large-6 columns']/a[1]")));
		e.click();
		Actions a=new Actions(driver);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		/*for(int i=0;i<menu.size()-8;i++)
		{
			System.out.println(menu.get(i).getText());
			a.moveToElement(menu.get(i)).perform();
			List<WebElement> sublist = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']"));
			for(WebElement se:sublist)
			{
				System.out.println(se.getText());
			}
		}*/
		for(WebElement ele:menu)
		{
			//System.out.println(ele.getText());
			a.moveToElement(ele).perform();
			List<WebElement> sublist = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']"));
		
			for(WebElement se:sublist)
			{
				System.out.println(se.getText());
				
			}
		}
		System.out.println();
		
	}

}
