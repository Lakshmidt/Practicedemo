package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenchot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot img=(TakesScreenshot)driver;
		File src=img.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Photos/ang.png");
		FileUtils.copyFile(src,dest);
		Thread.sleep(1000);
		driver.close();
		
	}

}
