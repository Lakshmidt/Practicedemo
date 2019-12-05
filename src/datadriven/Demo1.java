package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void readData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Lakshmi\\Music\\Demo\\seleniumprjt\\Excel.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh = wbook.getSheet("Sheet1");
		/*Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		Cell cell2 = row.getCell(1);
		System.out.println(cell2.getStringCellValue());
		Row r1=sh.getRow(3);
		Cell c = r1.getCell(0);
		System.out.println(c.getNumericCellValue());*/
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++)
		{
			for(int j=0;j<sh.getRow(0).getPhysicalNumberOfCells();j++)
			{
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		readData();
	}
}
