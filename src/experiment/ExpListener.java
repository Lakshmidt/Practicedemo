package experiment;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

public class ExpListener extends ExtentReportsexp implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		test.log(Status.INFO,"Test Finished");
		Reporter.log("Reports test finish");
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		test.log(Status.INFO,"started");
		Reporter.log("Reports starts");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(Status.INFO,"Test Failed");
		Reporter.log("Reports test failed");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(Status.INFO,"Test skipped");
		Reporter.log("Reports test skipped");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		report();
		test.log(Status.INFO,"Test started");
		Reporter.log("Reports test started");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(Status.INFO,"Test is pass");
		Reporter.log("Reports test pass");
	}
	

}
