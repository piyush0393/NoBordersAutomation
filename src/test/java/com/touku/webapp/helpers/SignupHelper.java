package com.touku.webapp.helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupHelper {

	public SignupHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='signup-button btn button pointer']")
	public WebElement SignupButton; 
	
	@FindBy(xpath = "//a[@class='link']//img")
	public WebElement SignupBackButton;
	
	@FindBy(xpath = "//div[@class='step-circle step-completed']")
	public WebElement SignupStepSelected1;
	
	@FindBy(xpath = "//div[contains(text(),'2')]")
	public WebElement SignupStep2;
	
	@FindBy(xpath = "//div[contains(text(),'3')]")
	public WebElement SignupStep3;

	@FindBy(xpath = "//div[@id='selected-lan']")
	public WebElement SelectedLangOption;
	
	@FindBy(xpath = "//div[@id='selected-lan']//img[contains(@class,'lang-flag')]")
	public WebElement SelectedLangOptionWithOpenDropdown;
	
	@FindBy(xpath = "//div[contains(@class,'col-12 step-description')]")
	public WebElement Step1Description;
	
	@FindBy(xpath = "//button[contains(@class,'dropbtn btn')]")
	public WebElement CountryDropdownBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Aaland Islands')]")
	public WebElement SignupCountryName1;
	
	@FindBy(xpath = "//span[contains(@class,'defaultCountry ng-star-inserted')]")
	public WebElement DefaultFlagSelected;
	
	@FindBy(xpath = "//span[contains(@class,'flag flag-in')]")
	public WebElement IndiaFlagSelected;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter phone number')]")
	public WebElement Field_EnterPhoneNumber;
	
	@FindBy(xpath = "//span[contains(text(),'SMS')]")
	public WebElement SendSMS_Btn;
	
	@FindBy(xpath = "//input[contains(@placeholder,'SMS verification code')]")
	public WebElement Field_EnterSMSVerCode;
	
	@FindBy(xpath = "//button[contains(@class,'btn next-btn')]")
	public WebElement NextBtn;
	
	@FindBy(xpath = "//div[contains(text(),'2')]")
	public WebElement SignupStep2Selected;
	
	@FindBy(xpath = "//div[@class='col-12 step-description']")
	public WebElement Step2Description;
	
	@FindBy(xpath = "//input[@placeholder='Email (example@gmail.com)']")
	public WebElement EnterEmail;
	
	@FindBy(xpath = "//div[contains(text(),'Email must be a valid email address')]")
	public WebElement InvalidEmailAlertText;
	
	@FindBy(xpath = "//input[@id='confirm-email']")
	public WebElement ConfirmEmail;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm e-mail do not match')]")
	public WebElement ConfirmEmailNotSame;
	
	@FindBy(xpath = "//img[@class='tick-mark-img ng-star-inserted']")
	public WebElement CorrectTickMark;
	
	@FindBy(xpath = "//img[@class='tick-mark-img cross-tick ng-star-inserted']")
	public WebElement WrongCrossMark;
	
	@FindBy(xpath = "//button[@class='btn next-btn']")
	public WebElement Step2NextBtn;
	
	@FindBy(xpath = "//div[contains(text(),'3')]")
	public WebElement SignupStep3Selected;
	
	@FindBy(xpath = "//div[@class='col-12 step-description']")
	public WebElement Step3Description;
	
	@FindBy(xpath = "//input[@id='register-username']")
	public WebElement EnterUsername;
	
	@FindBy(xpath = "//div[contains(text(),'Username must be at least one character')]")
	public WebElement InvalidUsernameText;
	
	@FindBy(xpath = "//input[@placeholder='New Login Password']")
	public WebElement EnterPasswd;
	
	@FindBy(xpath = "//div[contains(text(),'New Login Password is required')]")
	public WebElement InvalidPasswdText;
	
	@FindBy(xpath = "//div[contains(text(),'Password must be at least of 8 characters')]")
	public WebElement InvalidPasswdCharacterCount;
	
	@FindBy(xpath = "//input[@placeholder='Re-enter log in password']")
	public WebElement Re_EnterPasswd;
	
	@FindBy(xpath = "//div[contains(text(),'Repeat Login Password is required')]")
	public WebElement InvalidRe_EnterPasswdText;
	
	@FindBy(xpath = "//div[@class='invalid-feedback']")
	public WebElement ConfirmPasswdNotSame;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-eye')]")
	public WebElement HidePasswd;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-eye-slash')]")
	public WebElement ShowPasswd;
	
	@FindBy(xpath = "//span[contains(@class,'signup-span')]")
	public WebElement SignupPageButton;
	
	@FindBy(xpath = "//a[@class='term-link']")
	public WebElement AgreeTermsnCondition;
	
	@FindBy(xpath = "//input[contains(@class,'customised-control-input')]")
	public WebElement TermsCheckBox;   //isChecked() condition check
	
	@FindBy(xpath = "//span[contains(@class,'customised-control-indicator')]")
	public WebElement TermsCheckBox2;
	
	@FindBy(xpath = "//h3[contains(text(),'ANGELIUM Terms of Use')]")
	public WebElement AngeliumTermsnconditions;
	
	@FindBy(xpath = "//button[contains(@class,'float-right terms-btn')]")
	public WebElement TermsCloseBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement TermsnConditionsCloseBtn;
	
	
	/*Sample Locator and WebElement
	*@FindBy(linkText = "ENTER")
	*public WebElement EnterButton;
	*/

}
