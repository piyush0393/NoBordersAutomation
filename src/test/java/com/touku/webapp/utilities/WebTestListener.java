package com.touku.webapp.utilities;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.touku.webapp.testbase.WebTestBase;

/**
 * @author Piyush
 * 
 */

public class WebTestListener extends TestListenerAdapter {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static final int IMPLICIT_WAIT = 30;
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.testng.TestListenerAdapter#onTestFailure(org.testng.ITestResult)
	 * 
	 * When the tests fail, take a screen shot and log it in the TestNG reporter output.
	 * Have to do this here since calling this in the after method sends the reporter output
	 * to the afterMethod as well, which we can't see from jenkins.
	 * 
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		// Screenshot name should be "ClassName.TestName"
		// Having trouble getting the 'simple' class name here, so just stripping off the extra bits by hand...
		String testClassName = result.getMethod().getTestClass().getName();
		testClassName = testClassName.replace("com.touku.webapp.scripts.", "");

		// Capture our DriverTestCase instance from our test, so we
		// can take a screen shot using AndroidTestDriver methods.
		WebTestBase instance = ((WebTestBase) result.getInstance());
		instance.outputTestInfoToReporter(testClassName + "." + result.getMethod().getMethodName());
		//instance.printGroupOutput("Failed", result.getEndMillis() - result.getStartMillis());
	}

	@SuppressWarnings("unused")
	@Override
	public void onTestSuccess(ITestResult result) {
		WebTestBase instance = ((WebTestBase) result.getInstance());
		
	}

	@SuppressWarnings("unused")
	@Override
	public void onTestSkipped(ITestResult result) {
		WebTestBase instance = ((WebTestBase) result.getInstance());
		
	}
	

}