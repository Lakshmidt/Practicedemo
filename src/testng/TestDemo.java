package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void run() {
		Reporter.log("Testing",true);
	}
}
