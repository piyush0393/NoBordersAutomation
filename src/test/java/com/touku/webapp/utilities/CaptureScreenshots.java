package com.touku.webapp.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;

/**
 * @author Piyush
 * 
 */

public class CaptureScreenshots {

	/**
	 * This function capture the screenshot for failed test cases
	 * @param driver
	 * @param filename
	 */
	static String screenshotName="";
	public void captureFailedTCScreenshot(WebDriver driver, String filename) throws IOException, InterruptedException{
			
		screenshotName= filename+getCurrentTime();
		
		try {
			FileOutputStream out = new FileOutputStream("screenshot//"+screenshotName+".jpg");
				
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		
			String screen = "file://"+getPath()+"/screenshot/"+screenshotName+".jpg";
			System.out.println("screen "+screen);
			String str = "<a href= '" + screen+ "    "+ "'target='_blank' >" + filename + "</a>";

			Reporter.log(str);		
			
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (WebDriverException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * This function get the project absolute path
	 * @return Project absolute path
	 */
	public String getPath(){
		String path ="";
		File file = new File("");
		String absolutePathOfFirtFile=file.getAbsolutePath();
		path = absolutePathOfFirtFile.replace("\\\\+", "/");
		return path;
	}
	
	public String getCurrentTime(){
		DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
		Date date = new Date();
		return format.format(date);
	}
	

	public void cleanDir() throws IOException, InterruptedException{
		
		File theDir = new File("screenshot");			
		theDir.mkdir();
		System.out.println("Clean the screenshot directory");
		Thread.sleep(3000);
		System.out.println("Clean the old Screenshots");
		
	}
	
	public void copyScreenshotIntoSurefire() throws IOException, InterruptedException{
		Thread.sleep(5000);
		Thread.sleep(5000);
		System.out.println("Copying screenshots into /target/surefire-reports/");
	}
	
		
}
