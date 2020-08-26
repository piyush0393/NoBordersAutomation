package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHelper {

	public LoginHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[@class='login-button btn button pointer']")
	public WebElement LoginBtnHomePage;
	
	@FindBy(xpath = "//a[@class='link login-text']//img")
	public WebElement LoginPageBackBtn;
	
	@FindBy(xpath = "//input[@id='email-input']")
	public WebElement EnterUsername;
	
	@FindBy(xpath = "//input[@placeholder='Login Password']")
	public WebElement EnterPasswd;
	
	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement HideLoginPasswd;
	
	@FindBy(xpath = "//i[@class='fa fa-eye-slash']")
	public WebElement ShowLoginPasswd;
	
	@FindBy(xpath = "//span[contains(text(),'Remember me')]")
	public WebElement RememberMeText;
	
	@FindBy(xpath = "//input[@class='customised-control-input']")
	public WebElement RememberMeCheckbox;
	
	@FindBy(xpath = "//span[@class='login-span ng-star-inserted']")
	public WebElement LoginPageLoginBtn;
	
	@FindBy(xpath = "//div[@class='forgot-username ng-star-inserted']")
	public WebElement ForgotUname_Passwd;
	
	@FindBy(xpath = "//a[contains(text(),'username')]")
	public WebElement ForgotUname;
	
	@FindBy(xpath = "//a[contains(text(),'password?')]")
	public WebElement ForgotPasswd;
	
}
