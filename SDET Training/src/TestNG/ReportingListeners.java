package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public abstract class ReportingListeners implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult result)
	{
		//TODO 
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		//TODO 
		
		System.out.println("Listner-Inside Test Success");
		
	}
	
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//TODO 
		
		System.out.println("Listner-Inside Test Failure");
		
	}

}
