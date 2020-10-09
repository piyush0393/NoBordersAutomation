package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageHelper {

	public HomePageHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//nb-card[contains(@class,'welcome-container welcome-image background-image')]")
	public WebElement BGImageHomePage;
	
	@FindBy(xpath = "//button[@class='login-button btn button pointer']")
	public WebElement LoginBtnHomePage;
	
	@FindBy(xpath = "//button[@class='signup-button btn button pointer']")
	public WebElement SignupButton; 
	
	@FindBy(xpath = "//div[@class='heading-touku']")
	public WebElement ToukuHeadingHomePage;
	
	@FindBy(xpath = "//div[@class='touku-logo']")
	public WebElement ToukuLogoHomePage;
	
	@FindBy(xpath = "//img[@class='lang-flag ng-star-inserted']")
	public WebElement SelectedLangFlag;
	
	@FindBy(xpath = "//ngx-header/div[1]/div[1]/div[1]/button[2]/div[1]/img[1]")
	public WebElement EnglishFlag;
	
	@FindBy(xpath = "//img[@class='lang-flag']")
	public WebElement LanguageFlagHomePage;
	
	@FindBy(xpath = "//span[contains(text(),'The world is connected')]")
	public WebElement Text1HomePage;
	
	@FindBy(xpath = "//span[contains(text(),'Connect with TOUKU')]")
	public WebElement Text2HomePage;
	
	@FindBy(xpath = "//p[contains(text(),'Or login with')]")
	public WebElement Text3HomePage;
	
	@FindBy(xpath = "//div[@class='content-holder']//div[1]//img[1]")
	public WebElement FacebookLogoHomePage;
	
	@FindBy(xpath = "//div[contains(@class,'button-login')]//div[2]//img[1]")
	public WebElement LineLogoHomePage; 
	
	@FindBy(xpath = "//div[contains(@class,'social-links pointer')]//div[3]//img[1]")
	public WebElement GooglePlusLogoHomePage;
	
	@FindBy(xpath = "//div[4]//img[1]")
	public WebElement TwitterLogoHomePage;
	
	@FindBy(xpath = "//div[5]//img[1]")
	public WebElement TelegramLogoHomePage;
	
	@FindBy(xpath = "//div[6]//img[1]")
	public WebElement TalkLogoHomePage;
	
	@FindBy(xpath = "//span[contains(text(),'Or')]")
	public WebElement Text4HomePage;
	
	@FindBy(xpath = "//button[contains(@class,'btn continue-with-apple mobile-screen-apple-button')]")
	public WebElement LoginViaAppleButton;
	
	@FindBy(xpath = "//span[contains(text(),'Continue with Apple')]")
	public WebElement AppleLoginText;
	
	@FindBy(xpath = "//i[contains(@class,'fab fa-apple apple-icon')]")
	public WebElement AppleLoginLogo;
}
