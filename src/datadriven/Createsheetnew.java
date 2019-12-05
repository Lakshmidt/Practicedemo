package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Createsheetnew {
	public static void createsheet() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\Lakshmi\\Music\\Demo\\seleniumprjt\\newsheet.xls");
		Workbook work = WorkbookFactory.create(fi);
		work.createSheet("Sheet4");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lakshmi\\Music\\Demo\\seleniumprjt\\newsheet.xls");
		work.write(fo);
		work.close();
		fi.close();
		fo.close();
	}
	public static void main(String... args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		createsheet();
	}

}
