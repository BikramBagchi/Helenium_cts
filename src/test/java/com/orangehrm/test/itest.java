package com.orangehrm.test;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

import com.orange.base.TestBase;
import com.orangehrm.utils.screenshot;

public class itest extends TestBase  implements ITestListener
{
	screenshot ssc;
//	Logger log = Logger.getLogger(itest.class);

	
	public void onTestStart(ITestResult result)
	{
//		log.info("Test case "+result.getMethod().toString()+" just begain");
		
	}

	public void onTestSuccess(ITestResult result)
	{
	
//		log.info("Test case "+result.getMethod().toString()+" pass");
		
	}

	public void onTestFailure(ITestResult result)
	{
//		log.info("Test case "+result.getMethod().toString()+" fail");
		screenshot.failtestcase(result.getMethod().toString());	
		
	}

	public void onTestSkipped(ITestResult result) 
	{
	
//		log.info("Test case "+result.getMethod().toString()+" skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	public void onStart(ITestContext context)
	{
	
//		log.info("Test case automation script begain");
		
	}

	public void onFinish(ITestContext context) 
	{
	
//		log.info("Test case automation script finish please check the report and details log for more details");
		
	}

}
