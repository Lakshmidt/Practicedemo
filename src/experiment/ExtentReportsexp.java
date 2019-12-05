package experiment;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsexp {
	static ExtentReports report=new ExtentReports();
	static ExtentTest test=report.createTest("ExtetReportExample");
	@BeforeSuite
	public void report()
	{
		 ExtentHtmlReporter html=new ExtentHtmlReporter(".\\Reports\\Newhtmlreport.html");
		html.config().setDocumentTitle("HTML Report");
		html.config().setTheme(Theme.DARK);
		report.attachReporter(html);
		
	}

}
