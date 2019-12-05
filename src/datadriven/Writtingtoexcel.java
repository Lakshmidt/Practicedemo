package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writtingtoexcel {

	public static void writeData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\Lakshmi\\Desktop\\Excel.xlsx");
		Workbook work = WorkbookFactory.create(fi);
		 Sheet s = work.getSheet("Sheet2");
		Row r = s.createRow(3);
		 r.createCell(0).setCellValue("tc06");
		 r.createCell(1).setCellValue("pass");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lakshmi\\Desktop\\Excel.xlsx");
		work.write(fo);
		fo.flush();
		fi.close();
		fo.close();
	}
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		writeData();
	}

}
