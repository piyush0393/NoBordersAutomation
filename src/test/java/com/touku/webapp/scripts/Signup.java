package com.touku.webapp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.touku.webapp.config.Signup_data.Signup_Email_enum;
import com.touku.webapp.config.Signup_data.Signup_UnamePassword_enum;
import com.touku.webapp.config.Signup_data.Signup_enum;
import com.touku.webapp.config.URL_data.URL_enum;
import com.touku.webapp.testbase.WebTestBase;

public class Signup extends WebTestBase{

	@Test(priority = 1)
	public void TC_URLVerify_1() {
		test = extent.createTest("TC_URLVerify_1");
		//driver.switchTo().alert().dismiss();
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_WelcomeHome.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 2)
	public void TC_ChangeLanguageFlag() {
		test = extent.createTest("TC_ChangeLanguageFlag_2");
		homePageHelper.LanguageFlagHomePage.click();
		homePageHelper.EnglishFlag.click();
	}
	
	@Test(priority = 3)
	public void TC_ToukuHeadingHomePageVerify_2() {
		test = extent.createTest("TC_ToukuHeadingHomePageVerify_2");
		if(homePageHelper.ToukuHeadingHomePage.isDisplayed())
			System.out.println("ToukuHeadingHomePage available");
		else 
			System.out.println("ToukuHeadingHomePage Missing");
	}
	
	@Test(priority = 4)
	public void TC_BGImageHomePageVerify_3() {
		test = extent.createTest("TC_BGImageHomePageVerify_3");
		if(homePageHelper.BGImageHomePage.isDisplayed())
			System.out.println("BGImageHomePage available");
		else 
			System.out.println("BGImageHomePage Missing");
	}
	
	@Test(priority = 5)
	public void TC_LoginBtnHomePageVerify_4() {
		test = extent.createTest("TC_LoginBtnHomePageVerify_4");
		if(homePageHelper.LoginBtnHomePage.isDisplayed())
			System.out.println("LoginBtnHomePage available");
		else 
			System.out.println("LoginBtnHomePage Missing");
	}
	
	@Test(priority = 6)
	public void TC_SignupButtonVerify_5() {
		test = extent.createTest("TC_SignupButtonVerify_5");
		if(homePageHelper.SignupButton.isDisplayed())
			System.out.println("SignupButton available");
		else 
			System.out.println("SignupButton Missing");
	}
	
	@Test(priority = 7)
	public void TC_ToukuLogoHomePageVerify_6() {
		test = extent.createTest("TC_ToukuLogoHomePageVerify_6");
		if(homePageHelper.ToukuLogoHomePage.isDisplayed())
			System.out.println("ToukuLogoHomePage available");
		else 
			System.out.println("ToukuLogoHomePage Missing");
	}
	
	@Test(priority = 8)
	public void TC_LanguageFlagHomePageVerify_7() {
		test = extent.createTest("TC_LanguageFlagHomePageVerify_7");
		if(homePageHelper.LanguageFlagHomePage.isDisplayed())
			System.out.println("LanguageFlagHomePage available");
		else 
			System.out.println("LanguageFlagHomePage Missing");
	}
	
	@Test(priority = 9)
	public void TC_Text1HomePageVerify_8() {
		test = extent.createTest("TC_Text1HomePageVerify_8");
		if(homePageHelper.Text1HomePage.isDisplayed())
			System.out.println("Text1HomePage available");
		else 
			System.out.println("Text1HomePage Missing");
	}
	
	@Test(priority = 10)
	public void TC_Text2HomePageVerify_9() {
		test = extent.createTest("TC_Text2HomePageVerify_9");
		if(homePageHelper.Text2HomePage.isDisplayed())
			System.out.println("Text2HomePage available");
		else 
			System.out.println("Text2HomePage Missing");
	}
	
	@Test(priority = 11)
	public void TC_Text3HomePageVerify_10() {
		test = extent.createTest("TC_Text3HomePageVerify_10");
		if(homePageHelper.Text3HomePage.isDisplayed())
			System.out.println("Text3HomePage available");
		else 
			System.out.println("Text3HomePage Missing");
	}
	
	@Test(priority = 12)
	public void TC_FacebookLogoHomePageVerify_11() {
		test = extent.createTest("TC_FacebookLogoHomePageVerify_11");
		if(homePageHelper.FacebookLogoHomePage.isDisplayed())
			System.out.println("FacebookLogoHomePage available");
		else 
			System.out.println("FacebookLogoHomePage Missing");
	}
	@Test(priority = 13)
	public void TC_LineLogoHomePageVerify_12() {
		test = extent.createTest("TC_LineLogoHomePageVerify_12");
		if(homePageHelper.LineLogoHomePage.isDisplayed())
			System.out.println("LineLogoHomePage available");
		else 
			System.out.println("LineLogoHomePage Missing");
	}
	@Test(priority = 14)
	public void TC_GooglePlusLogoHomePageVerify_13() {
		test = extent.createTest("TC_GooglePlusLogoHomePageVerify_13");
		if(homePageHelper.GooglePlusLogoHomePage.isDisplayed())
			System.out.println("GooglePlusLogoHomePage available");
		else 
			System.out.println("GooglePlusLogoHomePage Missing");
	}
	@Test(priority = 15)
	public void TC_TwitterLogoHomePageVerify_14() {
		test = extent.createTest("TC_TwitterLogoHomePageVerify_14");
		if(homePageHelper.TwitterLogoHomePage.isDisplayed())
			System.out.println("TwitterLogoHomePage available");
		else 
			System.out.println("TwitterLogoHomePage Missing");
	}
	@Test(priority = 16)
	public void TC_TelegramLogoHomePageVerify_15() {
		test = extent.createTest("TC_TelegramLogoHomePageVerify_15");
		if(homePageHelper.TelegramLogoHomePage.isDisplayed())
			System.out.println("TelegramLogoHomePage available");
		else 
			System.out.println("TelegramLogoHomePage Missing");
	}
	@Test(priority = 17)
	public void TC_TalkLogoHomePageVerify_16() {
		test = extent.createTest("TC_TalkLogoHomePageVerify_16");
		if(homePageHelper.TalkLogoHomePage.isDisplayed())
			System.out.println("TalkLogoHomePage available");
		else 
			System.out.println("TalkLogoHomePage Missing");
	}
	
	@Test(priority = 18)
	public void TC_Text4HomePageVerify_17() {
		test = extent.createTest("TC_Text4HomePageVerify_17");
		if(homePageHelper.Text4HomePage.isDisplayed())
			System.out.println("Text4HomePage available");
		else 
			System.out.println("Text4HomePage Missing");
	}
	
	@Test(priority = 19)
	public void TC_LoginViaAppleButtonVerify_18() {
		test = extent.createTest("TC_LoginViaAppleButtonVerify_18");
		if(homePageHelper.LoginViaAppleButton.isDisplayed())
			System.out.println("LoginViaAppleButton available");
		else 
			System.out.println("LoginViaAppleButton Missing");
	}
	
	@Test(priority = 20)
	public void TC_AppleLoginTextVerify_19() {
		test = extent.createTest("TC_AppleLoginTextVerify_19");
		if(homePageHelper.AppleLoginText.isDisplayed())
			System.out.println("AppleLoginText available");
		else 
			System.out.println("AppleLoginText Missing");
	}
	
	@Test(priority = 21)
	public void TC_AppleLoginLogoVerify_20() {
		test = extent.createTest("TC_AppleLoginLogoVerify_20");
		if(homePageHelper.AppleLoginLogo.isDisplayed())
			System.out.println("AppleLoginLogo available");
		else 
			System.out.println("AppleLoginLogo Missing");
	}
		
	@Test(priority = 22)
	public void TC_SignupButtonClick_21() {
		test = extent.createTest("TC_SignupButtonClick_21");
		homePageHelper.SignupButton.click();
	}
	
	@Test(priority = 23)
	public void TC_SignupURLVerify_22() {
		test = extent.createTest("TC_SignupURLVerify_22");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_Signup.URL),"The URL is not same as expected");
	}
	
	//Verify All Signup Step 1 elements  ---- TO BE DONE
	//Perform Signup Step 1 actions
	
	@Test(priority = 24)
	public void TC_SelectCountryCode_23() {
		test = extent.createTest("TC_SelectCountryCode_23");
		signupHelper.Field_EnterPhoneNumber.clear();
		signupHelper.Field_EnterPhoneNumber.sendKeys(Signup_enum.Signup4.CountryCode);
	}
	
	@Test(priority = 25)
	public void TC_EnterPhoneNumber_24() {
		test = extent.createTest("TC_EnterPhoneNumber_24");
		signupHelper.Field_EnterPhoneNumber.sendKeys(Signup_enum.Signup4.MobileNumber);
	}
	
	@Test(priority = 26)
	public void TC_VerifyClickSMSButton_25() {
		test = extent.createTest("TC_VerifyClickSMSButton_25");
		signupHelper.SendSMS_Btn.click();
	}
	
	@Test(priority = 27)
	public void TC_EnterSMSVerificationCode_26() {
		test = extent.createTest("TC_EnterSMSVerificationCode_26");
		signupHelper.Field_EnterSMSVerCode.sendKeys(Signup_enum.Signup4.SMSVerCode);
	}
	
	@Test(priority = 28)
	public void TC_ClickNext_27() {
		test = extent.createTest("TC_ClickNext_27");
		signupHelper.NextBtn.click();
	}
	
	//Verify All Signup Step 2 elements   ---- TO BE DONE
	//Perform Signup Step 2 Actions
	
	@Test(priority = 29)
	public void TC_enterEmailAddress_28() {
		test = extent.createTest("TC_enterEmailAddress_28");
		signupHelper.EnterEmail.sendKeys(Signup_Email_enum.Signup_email2.Email);
	}
	
	@Test(priority = 30)
	public void TC_verifyEmailConfirmation_29() {
		test = extent.createTest("TC_verifyEmailConfirmation_29");
		signupHelper.ConfirmEmail.sendKeys(Signup_Email_enum.Signup_email2.ConfirmEmail);
	}
	
	@Test(priority = 31)
	public void TC_verifyClickNext_30() {
		test = extent.createTest("TC_verifyClickNext_30");
		signupHelper.Step2NextBtn.click();
	}
	
	//Verify all Signup Step 3 elements   ---- TO BE DONE
	//Perform Signup Step 3 Actions
	
	@Test(priority = 32)
	public void TC_VerifyEnterUsername_31() {
		test = extent.createTest("TC_VerifyEnterUsername_31");
		signupHelper.EnterUsername.sendKeys(Signup_UnamePassword_enum.Signup_UnamePassword2.Username);
	}
	
	@Test(priority = 33)
	public void TC_VerifyEnterNewLoginPassword_32() {
		test = extent.createTest("TC_VerifyEnterNewLoginPassword_32");
		signupHelper.EnterPasswd.sendKeys(Signup_UnamePassword_enum.Signup_UnamePassword2.Password);
	}
	
	@Test(priority = 34)
	public void TC_VerifyReEnterLoginPassword_33() {
		test = extent.createTest("TC_VerifyReEnterLoginPassword_33");
		signupHelper.Re_EnterPasswd.sendKeys(Signup_UnamePassword_enum.Signup_UnamePassword2.ConfirmPasswd);
	}
	
	@Test(priority = 35)
	public void TC_ViewTermsandConditions_34() {
		test = extent.createTest("TC_ViewTermsandConditions_34");
		signupHelper.AgreeTermsnCondition.click();
	}
	
	@Test(priority = 36)
	public void TC_CloseTermsandConditionsPopup_35() {
		test = extent.createTest("TC_CloseTermsandConditionsPopup_35");
		signupHelper.TermsnConditionsCloseBtn.click();
	}
	
	@Test(priority = 37)
	public void TC_AcceptTermsandConditions_36() {
		test = extent.createTest("TC_AcceptTermsandConditions_36");
		signupHelper.TermsCheckBox2.click();
	}
	
	@Test(priority = 38)
	public void TC_VerifyClickSignupButton_37() {
		test = extent.createTest("TC_VerifyClickSignupButton_37");
		signupHelper.SignupPageButton.click();
	}
}
