package experiment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExpListener.class)
public class Exceldata {
	
	@Test
	public void main() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fi=new FileInputStream(".\\Excelfiles\\Excelexp.xlsx");
		Workbook w=WorkbookFactory.create(fi);
		Sheet s=w.getSheetAt(0);
		Row r;
		Cell c1;
		Cell c2;
		for(int i=1;i<s.getPhysicalNumberOfRows();i++)
		{	
			r=s.getRow(i);
			if(r!=null)
			{
				c1=r.getCell(0);
				c2=r.getCell(1);
				if((c1!=null && c2!=null)&& (c1.getCellTypeEnum()==CellType.NUMERIC && c2.getCellTypeEnum()==CellType.NUMERIC))
				{	
						double n=c1.getNumericCellValue()+c2.getNumericCellValue();
						//int n=Integer.parseInt(c1.getStringCellValue())+Integer.parseInt(c2.getStringCellValue());
						r.createCell(2).setCellValue(n);
				}
				else
				{
					System.out.println(c1.getCellTypeEnum()+" "+c2.getCellTypeEnum());
				}
			}
		}
		FileOutputStream fo=new FileOutputStream(".\\Excelfiles\\Excelexp.xlsx");
		w.write(fo);
		fi.close();
		fo.flush();
		fo.close();
	}

}
