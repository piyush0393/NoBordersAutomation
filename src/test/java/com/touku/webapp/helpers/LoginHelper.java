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
	
	@FindBy(xpath = "//img[@class='lang-flag']")
	public WebElement LanguageFlagHomePage;
	
	@FindBy(xpath = "//button[@class='login-button btn button pointer']")
	public WebElement LoginBtnHomePage;
	
	@FindBy(xpath = "//div[@class='heading-touku']")
	public WebElement ToukuHeadingLoginPage;
	
	@FindBy(xpath = "//div[@class='touku-logo']")
	public WebElement ToukuLogoLoginPage;
	
	@FindBy(xpath = "//a[@class='link login-text']//img")
	public WebElement LoginPageBackBtn;
	
	@FindBy(xpath = "//input[@id='email-input']")
	public WebElement EnterUsername;
	
	@FindBy(xpath = "//input[@placeholder='Username or Email']")
	public WebElement EnterUsernamePlaceholder;
	
	@FindBy(xpath = "//input[@placeholder='Login Password']")
	public WebElement EnterPasswd;
	
	@FindBy(xpath = "//input[@placeholder='Login Password']")
	public WebElement EnterPasswdPlaceholder;
	
	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement HideLoginPasswd;
	
	@FindBy(xpath = "//i[@class='fa fa-eye-slash']")
	public WebElement ShowLoginPasswd;
	
	@FindBy(xpath = "//span[contains(text(),'Remember me')]")
	public WebElement RememberMeText;
	
	@FindBy(xpath = "//input[@class='customised-control-input']")
	public WebElement RememberMeCheckbox;
	
	@FindBy(xpath = "//span[contains(@class,'customised-control-indicator')]")
	public WebElement RememberMeCheckbox2;
	
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	public WebElement LoginPageLoginBtnText;
	
	@FindBy(xpath = "//button[contains(@class,'form-control pointer loginBtnCss btn-full-width')]")
	public WebElement LoginPageLoginBtn;
	
	@FindBy(xpath = "//div[contains(@class,'forgot-username')]")
	public WebElement ForgotUname_Passwd;
	
	@FindBy(xpath = "//a[contains(text(),'Username')]")
	public WebElement ForgotUname;
	
	@FindBy(xpath = "//a[contains(text(),'password?')]")
	public WebElement ForgotPasswd;
	
	@FindBy(xpath = "//div[contains(text(),'Or log In with')]")
	public WebElement Text3LoginPage;
	
	@FindBy(xpath = "//div[contains(@class,'social-links-section')]//div[1]//img[1]")
	public WebElement FacebookLogoLoginPage;
	
	@FindBy(xpath = "//div[contains(@class,'social-links pointer')]//div[2]//img[1]")
	public WebElement LineLogoLoginPage; 
	
	@FindBy(xpath = "//div[contains(@class,'social-links pointer')]//div[3]//img[1]")
	public WebElement GooglePlusLogoLoginPage;
	
	@FindBy(xpath = "//div[4]//img[1]")
	public WebElement TwitterLogoLoginPage;
	
	@FindBy(xpath = "//div[5]//img[1]")
	public WebElement TelegramLogoLoginPage;
	
	@FindBy(xpath = "//div[6]//img[1]")
	public WebElement TalkLogoLoginPage;
	
	@FindBy(xpath = "//span[contains(text(),'Or')]")
	public WebElement Text4LoginPage;
	
	@FindBy(xpath = "//button[contains(@class,'btn continue-with-apple mobile-screen-apple-button')]")
	public WebElement LoginViaAppleButton;
	
	@FindBy(xpath = "//span[contains(text(),'Continue with Apple')]")
	public WebElement AppleLoginText;
	
	@FindBy(xpath = "//i[contains(@class,'fab fa-apple apple-icon')]")
	public WebElement AppleLoginLogo;
	
	@FindBy(xpath = "//a[contains(text(),'Need support for log in?')]")
	public WebElement NeedSupportTextLink;
	
	@FindBy(xpath = "//body/div/div[@id='crisp-chatbox']/div/a/span[2]")
	public WebElement CristChatBoxIcon;
}
