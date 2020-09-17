package com.touku.webapp.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.touku.webapp.utilities.WebTestListener;
import com.touku.webapp.helpers.AddFriendHelper;
import com.touku.webapp.helpers.AdminHomeHelper;
import com.touku.webapp.helpers.AppDownloadHelper;
import com.touku.webapp.helpers.ChannelHelper;
import com.touku.webapp.helpers.ComposeMessageHelper;
import com.touku.webapp.helpers.ComposeScenarioHelper;
import com.touku.webapp.helpers.CreateNewChannelHelper;
import com.touku.webapp.helpers.CreateNewGroupHelper;
import com.touku.webapp.helpers.CustomerSupportHelper;
import com.touku.webapp.helpers.FAQHelper;
import com.touku.webapp.helpers.GeneralChatHelper;
import com.touku.webapp.helpers.GeneralHelper;
import com.touku.webapp.helpers.GeneralHomeHelper;
import com.touku.webapp.helpers.GeneralSettingHelper;
import com.touku.webapp.helpers.GreetingMessageHelper;
import com.touku.webapp.helpers.HomePageHelper;
import com.touku.webapp.helpers.InsightsAnalyticsHelper;
import com.touku.webapp.helpers.InvitationHelper;
import com.touku.webapp.helpers.LoginBonusHelper;
import com.touku.webapp.helpers.LoginHelper;
import com.touku.webapp.helpers.MessageListHelper;
import com.touku.webapp.helpers.MoreHelper;
import com.touku.webapp.helpers.OneToOneChatFollowersHelper;
import com.touku.webapp.helpers.OneToOneChatHelper;
import com.touku.webapp.helpers.ProfileHelper;
import com.touku.webapp.helpers.ScenarioListHelper;
import com.touku.webapp.helpers.SettingHelper;
import com.touku.webapp.helpers.SideMenuHelper;
import com.touku.webapp.helpers.SignupHelper;
import com.touku.webapp.helpers.SocialLoginHelper;
import com.touku.webapp.helpers.TimelineHelper;
import com.touku.webapp.helpers.UserAccountHelper;
import com.touku.webapp.utilities.CaptureScreenshots;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.lang.reflect.Method;

import java.net.MalformedURLException;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.util.Base64;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @author Piyush
 * 
 */

public class WebTestBase {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	protected SignupHelper signupHelper;
	protected AddFriendHelper addfriendHelper;
	protected AdminHomeHelper adminhomeHelper;
	protected AppDownloadHelper appdownloadHelper;
	protected ChannelHelper channelHelper;
	protected ComposeMessageHelper composeMessageHelper;
	protected ComposeScenarioHelper composeScenarioHelper;
	protected CreateNewChannelHelper createnewChannelHelper;
	protected CreateNewGroupHelper createnewGroupHelper;
	protected  CustomerSupportHelper customerSupportHelper;
	protected FAQHelper faqHelper;
	protected GeneralChatHelper generalChatHelper;
	protected GeneralHelper generalHelper;
	protected GeneralHomeHelper generalHomeHelper;
	protected GeneralSettingHelper generalSettingHelper;
	protected GreetingMessageHelper greetingMessageHelper;
	protected HomePageHelper homePageHelper;
	protected InsightsAnalyticsHelper insightsAnalyticsHelper;
	protected InvitationHelper invitationHelper;
	protected LoginBonusHelper loginBonusHelper;
	protected LoginHelper loginHelper;
	protected MessageListHelper messageListHelper;
	protected MoreHelper moreHelper;
	protected OneToOneChatFollowersHelper oneTooneChatFollowersHelper;
	protected OneToOneChatHelper oneTooneChatHelper;
	protected ProfileHelper profileHelper;
	protected ScenarioListHelper scenarioListHelper;
	protected SettingHelper settingHelper; 
	protected SideMenuHelper sideMenuHelper;
	protected SocialLoginHelper socialLoginHelper;
	protected TimelineHelper timelineHelper;
	protected UserAccountHelper userAccountHelper;
	
	protected static String timeGMT;
	protected String testName = "";
	protected String[] groups = null;
	public static String path =  System.getProperty("user.dir");   //getFilePath();
	public static Properties prop;
	
	public static Actions actions;
	public static WebDriverWait wait;
	int i = 1;
	
	//capture screenshots of failures
	CaptureScreenshots captureScreenShots = null;
	
	//builds a new report using the html template 
	ExtentHtmlReporter htmlReporter;
    protected JavascriptExecutor js;
    protected ExtentReports extent;
    
    //helps to generate the logs in test report.
    protected ExtentTest test;
	
    public WebTestBase()
    { 
        try{         	  
        	  
        	  js = (JavascriptExecutor) driver;
	          prop = new Properties();
	          //actions = new Actions(driver);
	          FileInputStream conf = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/touku/webapp/config/app.properties");
				prop.load(conf); 		                 
	   }catch(FileNotFoundException e){  
           System.out.println("Failed to read from application.properties file.");  
       }catch(IOException e){  
            System.out.println("Failed to read from application.properties file.");  
       }
     }	

    public static void initialization(String os,String browser) {
		
		
		switch(os) {
		case "Windows" :
			switch(browser) {
			case "chrome" : 
				System.setProperty("webdriver.chrome.driver", path + prop.getProperty("windows_chrome_path"));
				options = new ChromeOptions();
				options.addArguments("--disable-infobars");
				options.addArguments("--disable-notifications");

				driver = new ChromeDriver(options);
				break;
			
			case "FF" : 	
				System.setProperty("webdriver.gecko.driver", path + prop.getProperty("windows_firefox_path"));
				driver = new FirefoxDriver();
				break;
			} 
			break;
			
		case "Linux" :
			switch(browser) {
			case "chrome" :
				System.out.println("Initialization linux1");
				System.setProperty("webdriver.chrome.driver", path + prop.getProperty("linux_chrome_path"));
				System.out.println("Initialization linux2");
				//System.out.println("Initialization ");
				options = new ChromeOptions();
				options.addArguments("--disable-infobars");
				options.addArguments("--disable-notifications");
				
				driver = new ChromeDriver(options);
				System.out.println("Initialization linux3");
				break;
				
			case "FF" :
				System.setProperty("webdriver.gecko.driver", path + prop.getProperty("linux_firefox_path"));
				driver = new FirefoxDriver();
				break;
			}
			
			break;
		
		case "Mac" :
			switch(browser) {
			case "chrome" :
				System.out.println("Initialization mac1");
				System.setProperty("webdriver.chrome.driver", path + prop.getProperty("mac_chrome_path"));
				System.out.println("Initialization mac2");
				options = new ChromeOptions();
				options.addArguments("--disable-infobars");
				options.addArguments("--disable-notifications");
				
				driver = new ChromeDriver(options);
				System.out.println("Initialization mac3");
				break;
				
			case "FF" :
				System.setProperty("webdriver.gecko.driver", path + prop.getProperty("mac_firefox_path"));
				driver = new FirefoxDriver();
			}
			
			break;
			
		case "default": 
			System.out.println("No initialization done");
		
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(WebTestListener.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(WebTestListener.IMPLICIT_WAIT, TimeUnit.SECONDS);
		System.out.println("implicit wait assigned");
		driver.get(prop.getProperty("url"));
	}
    
    @BeforeTest
    public void startReport() {
    	// initialize the HtmlReporter
    	
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
         
        //To add system or environment info by using the setSystemInfo method.
        
        
        //configuration items to change the look and feel
        //add content, manage tests etc
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("ToukuWebApp Extent Report");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }
    
	@BeforeClass
	public void cleanScreenShotDirectory() throws IOException, InterruptedException{
		
		System.out.println("*********************************************");
		System.out.println("Executing Test Script Class File Name: "+ this.getClass().getSimpleName());
		System.out.println("*********************************************");
		CaptureScreenshots captureScreenshots = new CaptureScreenshots();
		captureScreenshots.cleanDir();
		
		
		//test = extent.startTest("ExtentDemo");

		//wait = new WebDriverWait(driver,30);
		System.out.println("Initialization call");
		initialization(prop.getProperty("os2"),prop.getProperty("browser1"));
		//wait = new WebDriverWait(driver,30);
		System.out.println("Wait assigned");
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void setUp(Method method) throws MalformedURLException
	{
		Test testClass = method.getAnnotation(Test.class);
		groups = testClass.groups();
		// used by a couple of tests	
		testName = method.getName();
		
		System.out.println("*********************************************");
		System.out.println("Test Method Name: " + testName); 
		System.out.println("*********************************************");
 		
 		initializePageHelperObjects();
	}
			
	@AfterTest
	public void teardown() throws InterruptedException, IOException {
		extent.flush();
		}
	
	
	@AfterMethod
	public void getResult(ITestResult result) throws IOException, InterruptedException {
        if(result.getStatus() == ITestResult.FAILURE) {
        	
        	String testName = result.getMethod().getMethodName();			
			captureScreenShots = new CaptureScreenshots();
			captureScreenShots.captureFailedTCScreenshot(driver, testName);
			
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
	
	@AfterClass
	public void copyScreenshotToSureFire() throws IOException, InterruptedException{
		CaptureScreenshots captureScreenshots = new CaptureScreenshots();
		captureScreenshots.copyScreenshotIntoSurefire();
		cleanUpPageHelperObjects();
	}
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	/**
	 * Log troubleshooting information to the reporter output (called when a test
	 * fails).
	 * 
	 * @param fileName
	 *            - Name to use for the screenshot
	 */
	public void outputTestInfoToReporter(String fileName) {
		String date = getCurrentDate();
		String screenshotDatedFolderPath = getPath() + "\\screenshots\\Screenshot_" + date;
		File fl = new File(screenshotDatedFolderPath);
		fl.mkdirs();
		try {
			String screenshotName = this.createFile(fileName);
			String screenshotPath = fl.getPath() + "\\" + screenshotName + ".jpg";
			FileOutputStream out = new FileOutputStream(screenshotPath);
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
			Reporter.log("<div style='clear:both;' >" + "<b>" + this.getDateTime() + "</b><br><br>"
					+ "<b>Test Name:</b> " + getClass().getSimpleName() + "." + testName + "</div>");
		} catch (Exception e) {
		}
	}
	
	// Creating file name
	public String createFile(String file) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat dateFormat1 = new SimpleDateFormat("hh-mm-ss");
		Calendar cal = Calendar.getInstance();
		String fileName = file + "_" + dateFormat.format(cal.getTime()) + "_" + dateFormat1.format(cal.getTime());
		return fileName;
	}

	public String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String currentDate = dateFormat.format(cal.getTime());
		return currentDate;
	}

	public String getMonth() {
		DateFormat dateFormat = new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		String currentMonth = dateFormat.format(cal.getTime());
		return currentMonth;
	}

	public String getDayOfMonth() {
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_MONTH);
		DecimalFormat mFormat= new DecimalFormat("00");
		String dayOfMonth = mFormat.format(Double.valueOf(day));
		return dayOfMonth;
	}
	
	/**
	 * returns a date/time stamp. Example "04/06/2016 05:00:28 PM"
	 * 
	 * @return
	 */
	public String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
		Calendar cal = Calendar.getInstance();
		String currentDate = dateFormat.format(cal.getTime());
		String currentTime = timeFormat.format(cal.getTime());
		return currentDate + " " + currentTime;
	}

	// Get absolute path
	public String getPath() {
		String path = "";
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");
		return path;
	}
	
	public static String getImageBase64String(String imagePath, String imageExtension, String style)
			throws IOException {
		String imageString = null;
		// Catch file not found exception since we want tests to still fail
		// with an assertion failure if the diff image doesn't get generated for
		// whatever reason
		try {
			File file = new File(imagePath);
			FileInputStream fis = new FileInputStream(file);
			imageString = Base64.getEncoder().encodeToString(IOUtils.toByteArray(fis));
			fis.close();
		} catch (java.io.FileNotFoundException e) {
			System.out.print(e);
		}
		return "<img src='data:image/" + imageExtension + ";base64," + imageString + "' style='" + style + "' />";
	}

	public static String getImageBase64String(String imagePath, String imageExtension) throws IOException {
		return getImageBase64String(imagePath, imageExtension, "width:1000px;");
	}		
	
	
	
	public void initializePageHelperObjects(){		
		
		signupHelper = new SignupHelper(driver);
		addfriendHelper = new AddFriendHelper(driver);
		adminhomeHelper = new AdminHomeHelper(driver);
		appdownloadHelper = new AppDownloadHelper(driver);
		channelHelper = new ChannelHelper(driver);
		composeMessageHelper = new ComposeMessageHelper(driver);
		composeScenarioHelper = new ComposeScenarioHelper(driver);
		createnewChannelHelper = new CreateNewChannelHelper(driver);
		createnewGroupHelper = new CreateNewGroupHelper(driver);
		customerSupportHelper = new CustomerSupportHelper(driver);
		faqHelper = new FAQHelper(driver);
		generalChatHelper = new GeneralChatHelper(driver);
		generalHelper = new GeneralHelper(driver);
		generalHomeHelper  = new GeneralHomeHelper(driver);
		generalSettingHelper = new GeneralSettingHelper(driver);
		greetingMessageHelper = new GreetingMessageHelper(driver);
		homePageHelper = new HomePageHelper(driver);
		insightsAnalyticsHelper = new InsightsAnalyticsHelper(driver);
		invitationHelper = new InvitationHelper(driver);
		loginBonusHelper = new LoginBonusHelper(driver);
		loginHelper = new LoginHelper(driver);
		messageListHelper = new MessageListHelper(driver);
		moreHelper = new MoreHelper(driver);
		oneTooneChatFollowersHelper = new OneToOneChatFollowersHelper(driver);
		oneTooneChatHelper = new OneToOneChatHelper(driver);
		profileHelper = new ProfileHelper(driver);
		scenarioListHelper = new ScenarioListHelper(driver);
		settingHelper = new SettingHelper(driver); 
		sideMenuHelper = new SideMenuHelper(driver);
		signupHelper = new SignupHelper(driver);
		socialLoginHelper = new SocialLoginHelper(driver);
		timelineHelper = new TimelineHelper(driver);
		userAccountHelper = new UserAccountHelper(driver); 
	}	
	
	public void cleanUpPageHelperObjects(){			
		
		 driver = null;
		 signupHelper = null;
		 addfriendHelper = null;                                  
		 adminhomeHelper = null;                                  
         appdownloadHelper = null;                              
         channelHelper = null;                                      
         composeMessageHelper = null;                        
         composeScenarioHelper = null;                      
         createnewChannelHelper = null;                    
         createnewGroupHelper = null;                        
         customerSupportHelper = null;                     
         faqHelper = null;                                              
         generalChatHelper = null;                              
         generalHelper = null;                                      
         generalHomeHelper = null;                              
         generalSettingHelper = null;                        
         greetingMessageHelper = null;                      
         homePageHelper = null;                                    
         insightsAnalyticsHelper = null;                  
         invitationHelper = null;                                
         loginBonusHelper = null;                                
         loginHelper = null;                                          
         messageListHelper = null;                              
         moreHelper = null;                                            
         oneTooneChatFollowersHelper = null;          
         oneTooneChatHelper = null;                            
         profileHelper = null;                                      
         scenarioListHelper = null;                            
         settingHelper = null;                                      
         sideMenuHelper = null;                                    
         socialLoginHelper = null;                              
         timelineHelper = null;                                    
         userAccountHelper = null;
	}
}