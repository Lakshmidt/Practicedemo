package actionsacls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Espncrikinfo {
	static FileInputStream fi;
	static 	FileOutputStream fo;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		try {
			 fi=new FileInputStream("C:\\Users\\Lakshmi\\Music\\files\\file.xlsx");
			fo=new FileOutputStream("C:\\Users\\Lakshmi\\Music\\files\\file.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='cscore cricket   cscore--series top cscore--final cscore--home-winner js-show']"))).perform();
		driver.findElement(By.xpath("//h2[text()='IND-A in WI']/../../..//a[contains(.,'Scorecard')]")).click();
		List<WebElement> lst = driver.findElements(By.xpath("//h2[text()='West Indies A 1st Innings ']/../../..//div[@class='scorecard-section batsmen']/div[@class='flex-row']"));
		Workbook work = WorkbookFactory.create(fi);
		Sheet s = work.getSheet("Sheet1");
		for(int i=0;i<lst.size();i++)
		{
			Row r = s.createRow(i);
			for(int j=0;j<lst.size();j++)
			{
				r.createCell(j).setCellValue(lst.get(i).getText());
			System.out.println(lst.get(i).getText());
			}
		}
		fi.close();
		fo.close();
	}

}
