package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readdatafrompropertyfile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.load(new FileInputStream("C:\\Users\\Lakshmi\\Music\\Demo\\seleniumprjt\\new.properties"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
	}

}
