package TestNG;

import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.Listeners;


@Listeners(ReportingListeners.class)
public class TestNGClass {
	
	
	//@org.testing.annotations.BeforeSuite
	
	public void BeforeSuite()
	{
		System.out.println("**Inside Before Suite**");
		
	}
	
	
	
	public void BeforeTest()
	{
		System.out.println("**Inside Before Test**");
		
	}
	
	
	
 // @Test(priority=1)
	
	public void TestMethod1()
	
	{
		
		System.out.println("**Inside Test Member 1**");
		
	}
	
 //@Test(priority = 2)
	
	public void TestMethod2()
	
	{
		
		System.out.println("**Inside Test Member 2**");
		
	}

 
 //@Test(priority=3, dependsOnMethods= {TestMethod2})
   public void TestMethod3()
   {
	 System.out.println("Inside Test Method3");
	 
   }
 
 //@AfterTest
 public void AfterTestMethods()
 {
	 
	 System.out.println("**Inside AfterSuite**");
	 
 }
 
 
 
}
