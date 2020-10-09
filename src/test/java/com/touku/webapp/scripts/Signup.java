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
	
	//Verify All Signup Step 1 elements 
	
	@Test(priority = 24)
	public void TC_SignupBackButtonVerify_24() {
		test = extent.createTest("TC_SignupBackButtonVerify_24");
		if(signupHelper.SignupBackButton.isDisplayed())
			System.out.println("SignupBackButton available");
		else 
			System.out.println("SignupBackButton Missing");
	}
	@Test(priority = 25)
	public void TC_SignupStepSelected1Verify_25() {
		test = extent.createTest("TC_SignupStepSelected1Verify_25");
		if(signupHelper.SignupStepSelected1.isDisplayed())
			System.out.println("SignupStepSelected1 available");
		else 
			System.out.println("SignupStepSelected1 Missing");
	}
	@Test(priority = 26)
	public void TC_SignupStep2Verify_26() {
		test = extent.createTest("TC_SignupStep2Verify_26");
		if(signupHelper.SignupStep2.isDisplayed())
			System.out.println("SignupStep2 available");
		else 
			System.out.println("SignupStep2 Missing");
	}
	@Test(priority = 27)
	public void TC_SignupStep3Verify_27() {
		test = extent.createTest("TC_SignupStep3Verify_27");
		if(signupHelper.SignupStep3.isDisplayed())
			System.out.println("SignupStep3 available");
		else 
			System.out.println("SignupStep3 Missing");
	}
	@Test(priority = 28)
	public void TC_SelectedLangOptionVerify_28() {
		test = extent.createTest("TC_SelectedLangOptionVerify_28");
		if(signupHelper.SelectedLangOption.isDisplayed())
			System.out.println("SelectedLangOption available");
		else 
			System.out.println("SelectedLangOption Missing");
	}
	@Test(priority = 29)
	public void TC_SelectedLangOptionWithOpenDropdownVerify_29() {
		test = extent.createTest("TC_SelectedLangOptionWithOpenDropdownVerify_29");
		if(signupHelper.SelectedLangOptionWithOpenDropdown.isDisplayed())
			System.out.println("SelectedLangOptionWithOpenDropdown available");
		else 
			System.out.println("SelectedLangOptionWithOpenDropdown Missing");
	}
	@Test(priority = 30)
	public void TC_Step1DescriptionVerify_30() {
		test = extent.createTest("TC_Step1DescriptionVerify_30");
		if(signupHelper.Step1Description.isDisplayed())
			System.out.println("Step1Description available");
		else 
			System.out.println("Step1Description Missing");
	}
	@Test(priority = 31)
	public void TC_CountryDropdownBtnVerify_31() {
		test = extent.createTest("TC_CountryDropdownBtnVerify_31");
		if(signupHelper.CountryDropdownBtn.isDisplayed())
			System.out.println("CountryDropdownBtn available");
		else 
			System.out.println("CountryDropdownBtn Missing");
	}
	@Test(priority = 32)
	public void TC_SignupCountryName1Verify_32() {
		test = extent.createTest("TC_SignupCountryName1Verify_32");
		if(signupHelper.SignupCountryName1.isDisplayed())
			System.out.println("SignupCountryName1 available");
		else 
			System.out.println("SignupCountryName1 Missing");
	}
	@Test(priority = 33)
	public void TC_DefaultFlagSelectedVerify_33() {
		test = extent.createTest("TC_DefaultFlagSelectedVerify_33");
		if(signupHelper.DefaultFlagSelected.isDisplayed())
			System.out.println("DefaultFlagSelected available");
		else 
			System.out.println("DefaultFlagSelected Missing");
	}
	@Test(priority = 34)
	public void TC_IndiaFlagSelectedVerify_34() {
		test = extent.createTest("TC_IndiaFlagSelectedVerify_34");
		if(signupHelper.IndiaFlagSelected.isDisplayed())
			System.out.println("IndiaFlagSelected available");
		else 
			System.out.println("IndiaFlagSelected Missing");
	}
	@Test(priority = 35)
	public void TC_Field_EnterPhoneNumberVerify_35() {
		test = extent.createTest("TC_Field_EnterPhoneNumberVerify_35");
		if(signupHelper.Field_EnterPhoneNumber.isDisplayed())
			System.out.println("Field_EnterPhoneNumber available");
		else 
			System.out.println("Field_EnterPhoneNumber Missing");
	}
	@Test(priority = 36)
	public void TC_SendSMS_BtnVerify_36() {
		test = extent.createTest("TC_SendSMS_BtnVerify_36");
		if(signupHelper.SendSMS_Btn.isDisplayed())
			System.out.println("SendSMS_Btn available");
		else 
			System.out.println("SendSMS_Btn Missing");
	}
	@Test(priority = 37)
	public void TC_Field_EnterSMSVerCodeVerify_37() {
		test = extent.createTest("TC_Field_EnterSMSVerCodeVerify_37");
		if(signupHelper.Field_EnterSMSVerCode.isDisplayed())
			System.out.println("Field_EnterSMSVerCode available");
		else 
			System.out.println("Field_EnterSMSVerCode Missing");
	}
	@Test(priority = 38)
	public void TC_NextBtnVerify_38() {
		test = extent.createTest("TC_NextBtnVerify_38");
		if(signupHelper.NextBtn.isDisplayed())
			System.out.println("NextBtn available");
		else 
			System.out.println("NextBtn Missing");
	}
	
	
	//Perform Signup Step 1 actions
	
	@Test(priority = 39)
	public void TC_SelectCountryCode_23() {
		test = extent.createTest("TC_SelectCountryCode_23");
		signupHelper.Field_EnterPhoneNumber.clear();
		signupHelper.Field_EnterPhoneNumber.sendKeys(Signup_enum.Signup4.CountryCode);
	}
	
	@Test(priority = 40)
	public void TC_EnterPhoneNumber_24() {
		test = extent.createTest("TC_EnterPhoneNumber_24");
		signupHelper.Field_EnterPhoneNumber.sendKeys(Signup_enum.Signup4.MobileNumber);
	}
	
	@Test(priority = 41)
	public void TC_VerifyClickSMSButton_25() {
		test = extent.createTest("TC_VerifyClickSMSButton_25");
		signupHelper.SendSMS_Btn.click();
	}
	
	@Test(priority = 42)
	public void TC_EnterSMSVerificationCode_26() {
		test = extent.createTest("TC_EnterSMSVerificationCode_26");
		signupHelper.Field_EnterSMSVerCode.sendKeys(Signup_enum.Signup4.SMSVerCode);
	}
	
	@Test(priority = 43)
	public void TC_ClickNext_27() {
		test = extent.createTest("TC_ClickNext_27");
		signupHelper.NextBtn.click();
	}
	
	//Verify All Signup Step 2 elements 
	
	@Test(priority = 44)
	public void TC_SignupStep2SelectedVerify_44() {
		test = extent.createTest("TC_SignupStep2SelectedVerify_44");
		if(signupHelper.SignupStep2Selected.isDisplayed())
			System.out.println("SignupStep2Selected available");
		else 
			System.out.println("SignupStep2Selected Missing");
	}
	@Test(priority = 45)
	public void TC_Step2DescriptionVerify_45() {
		test = extent.createTest("TC_Step2DescriptionVerify_45");
		if(signupHelper.Step2Description.isDisplayed())
			System.out.println("Step2Description available");
		else 
			System.out.println("Step2Description Missing");
	}
	@Test(priority = 46)
	public void TC_EnterEmailVerify_46() {
		test = extent.createTest("TC_EnterEmailVerify_46");
		if(signupHelper.EnterEmail.isDisplayed())
			System.out.println("EnterEmail available");
		else 
			System.out.println("EnterEmail Missing");
	}
	@Test(priority = 47)
	public void TC_InvalidEmailAlertTextVerify_47() {
		test = extent.createTest("TC_InvalidEmailAlertTextVerify_47");
		if(signupHelper.InvalidEmailAlertText.isDisplayed())
			System.out.println("InvalidEmailAlertText available");
		else 
			System.out.println("InvalidEmailAlertText Missing");
	}
	@Test(priority = 48)
	public void TC_ConfirmEmailVerify_48() {
		test = extent.createTest("TC_ConfirmEmailVerify_48");
		if(signupHelper.ConfirmEmail.isDisplayed())
			System.out.println("ConfirmEmail available");
		else 
			System.out.println("ConfirmEmail Missing");
	}
	@Test(priority = 49)
	public void TC_ConfirmEmailNotSameVerify_49() {
		test = extent.createTest("TC_ConfirmEmailNotSameVerify_49");
		if(signupHelper.ConfirmEmailNotSame.isDisplayed())
			System.out.println("ConfirmEmailNotSame available");
		else 
			System.out.println("ConfirmEmailNotSame Missing");
	}
	@Test(priority = 50)
	public void TC_CorrectTickMarkVerify_50() {
		test = extent.createTest("TC_CorrectTickMarkVerify_50");
		if(signupHelper.CorrectTickMark.isDisplayed())
			System.out.println("CorrectTickMark available");
		else 
			System.out.println("CorrectTickMark Missing");
	}
	@Test(priority = 51)
	public void TC_WrongCrossMarkVerify_51() {
		test = extent.createTest("TC_WrongCrossMarkVerify_51");
		if(signupHelper.WrongCrossMark.isDisplayed())
			System.out.println("WrongCrossMark available");
		else 
			System.out.println("WrongCrossMark Missing");
	}
	@Test(priority = 52)
	public void TC_Step2NextBtnVerify_52() {
		test = extent.createTest("TC_Step2NextBtnVerify_52");
		if(signupHelper.Step2NextBtn.isDisplayed())
			System.out.println("Step2NextBtn available");
		else 
			System.out.println("Step2NextBtn Missing");
	}
	
	//Perform Signup Step 2 Actions
	
	@Test(priority = 53)
	public void TC_enterEmailAddress_28() {
		test = extent.createTest("TC_enterEmailAddress_28");
		signupHelper.EnterEmail.sendKeys(Signup_Email_enum.Signup_email2.Email);
	}
	
	@Test(priority = 54)
	public void TC_verifyEmailConfirmation_29() {
		test = extent.createTest("TC_verifyEmailConfirmation_29");
		signupHelper.ConfirmEmail.sendKeys(Signup_Email_enum.Signup_email2.ConfirmEmail);
	}
	
	@Test(priority = 55)
	public void TC_verifyClickNext_30() {
		test = extent.createTest("TC_verifyClickNext_30");
		signupHelper.Step2NextBtn.click();
	}
	
	//Verify all Signup Step 3 elements   ---- TO BE DONE
	
	@Test(priority = 56)
	public void TC_SignupStep3SelectedVerify_56() {
		test = extent.createTest("TC_SignupStep3SelectedVerify_56");
		if(signupHelper.SignupStep3Selected.isDisplayed())
			System.out.println("SignupStep3Selected available");
		else 
			System.out.println("SignupStep3Selected Missing");
	}
	@Test(priority = 57)
	public void TC_Step3DescriptionVerify_57() {
		test = extent.createTest("TC_Step3DescriptionVerify_57");
		if(signupHelper.Step3Description.isDisplayed())
			System.out.println("Step3Description available");
		else 
			System.out.println("Step3Description Missing");
	}
	@Test(priority = 58)
	public void TC_EnterUsernameVerify_58() {
		test = extent.createTest("TC_EnterUsernameVerify_58");
		if(signupHelper.EnterUsername.isDisplayed())
			System.out.println("EnterUsername available");
		else 
			System.out.println("EnterUsername Missing");
	}
	@Test(priority = 59)
	public void TC_InvalidUsernameTextVerify_59() {
		test = extent.createTest("TC_InvalidUsernameTextVerify_59");
		if(signupHelper.InvalidUsernameText.isDisplayed())
			System.out.println("InvalidUsernameText available");
		else 
			System.out.println("InvalidUsernameText Missing");
	}
	@Test(priority = 60)
	public void TC_EnterPasswdVerify_60() {
		test = extent.createTest("TC_EnterPasswdVerify_60");
		if(signupHelper.EnterPasswd.isDisplayed())
			System.out.println("EnterPasswd available");
		else 
			System.out.println("EnterPasswd Missing");
	}
	@Test(priority = 61)
	public void TC_InvalidPasswdTextVerify_61() {
		test = extent.createTest("TC_InvalidPasswdTextVerify_61");
		if(signupHelper.InvalidPasswdText.isDisplayed())
			System.out.println("InvalidPasswdText available");
		else 
			System.out.println("InvalidPasswdText Missing");
	}
	@Test(priority = 62)
	public void TC_InvalidPasswdCharacterCountVerify_62() {
		test = extent.createTest("TC_InvalidPasswdCharacterCountVerify_62");
		if(signupHelper.InvalidPasswdCharacterCount.isDisplayed())
			System.out.println("InvalidPasswdCharacterCount available");
		else 
			System.out.println("InvalidPasswdCharacterCount Missing");
	}
	@Test(priority = 63)
	public void TC_Re_EnterPasswdVerify_63() {
		test = extent.createTest("TC_Re_EnterPasswdVerify_63");
		if(signupHelper.Re_EnterPasswd.isDisplayed())
			System.out.println("Re_EnterPasswd available");
		else 
			System.out.println("Re_EnterPasswd Missing");
	}
	@Test(priority = 64)
	public void TC_InvalidRe_EnterPasswdTextVerify_20() {
		test = extent.createTest("TC_InvalidRe_EnterPasswdTextVerify_20");
		if(signupHelper.InvalidRe_EnterPasswdText.isDisplayed())
			System.out.println("InvalidRe_EnterPasswdText available");
		else 
			System.out.println("InvalidRe_EnterPasswdText Missing");
	}
	@Test(priority = 65)
	public void TC_ConfirmPasswdNotSameVerify_65() {
		test = extent.createTest("TC_ConfirmPasswdNotSameVerify_65");
		if(signupHelper.ConfirmPasswdNotSame.isDisplayed())
			System.out.println("ConfirmPasswdNotSame available");
		else 
			System.out.println("ConfirmPasswdNotSame Missing");
	}
	@Test(priority = 66)
	public void TC_HidePasswdVerify_66() {
		test = extent.createTest("TC_HidePasswdVerify_66");
		if(signupHelper.HidePasswd.isDisplayed())
			System.out.println("HidePasswd available");
		else 
			System.out.println("HidePasswd Missing");
	}
	@Test(priority = 67)
	public void TC_ShowPasswdVerify_() {
		test = extent.createTest("TC_ShowPasswdVerify_20");
		if(signupHelper.ShowPasswd.isDisplayed())
			System.out.println("ShowPasswd available");
		else 
			System.out.println("ShowPasswd Missing");
	}
	@Test(priority = 68)
	public void TC_SignupPageButtonVerify_68() {
		test = extent.createTest("TC_SignupPageButtonVerify_68");
		if(signupHelper.SignupPageButton.isDisplayed())
			System.out.println("SignupPageButton available");
		else 
			System.out.println("SignupPageButton Missing");
	}
	@Test(priority = 69)
	public void TC_AgreeTermsnConditionVerify_69() {
		test = extent.createTest("TC_AgreeTermsnConditionVerify_69");
		if(signupHelper.AgreeTermsnCondition.isDisplayed())
			System.out.println("AgreeTermsnCondition available");
		else 
		
			System.out.println("AgreeTermsnCondition Missing");
	}
	@Test(priority = 70)
	public void TC_TermsCheckBoxVerify_70() {
		test = extent.createTest("TC_TermsCheckBoxVerify_70");
		if(signupHelper.TermsCheckBox.isDisplayed())
			System.out.println("TermsCheckBox available");
		else 
			System.out.println("TermsCheckBox Missing");
	}
	@Test(priority = 71)
	public void TC_TermsCheckBox2Verify_71() {
		test = extent.createTest("TC_TermsCheckBox2Verify_71");
		if(signupHelper.TermsCheckBox2.isDisplayed())
			System.out.println("TermsCheckBox2 available");
		else 
			System.out.println("TermsCheckBox2 Missing");
	}
	@Test(priority = 72)
	public void TC_AngeliumTermsnconditionsVerify_72() {
		test = extent.createTest("TC_AngeliumTermsnconditionsVerify_72");
		if(signupHelper.AngeliumTermsnconditions.isDisplayed())
			System.out.println("AngeliumTermsnconditions available");
		else 
			System.out.println("AngeliumTermsnconditions Missing");
	}
	@Test(priority = 73)
	public void TC_TermsCloseBtnVerify_73() {
		test = extent.createTest("TC_TermsCloseBtnVerify_73");
		if(signupHelper.TermsCloseBtn.isDisplayed())
			System.out.println("TermsCloseBtn available");
		else 
			System.out.println("TermsCloseBtn Missing");
	}
	@Test(priority = 74)
	public void TC_TermsnConditionsCloseBtnVerify_74() {
		test = extent.createTest("TC_TermsnConditionsCloseBtnVerify_74");
		if(signupHelper.TermsnConditionsCloseBtn.isDisplayed())
			System.out.println("TermsnConditionsCloseBtn available");
		else 
			System.out.println("TermsnConditionsCloseBtn Missing");
	}
	
	//Perform Signup Step 3 Actions
	
	@Test(priority = 75)
	public void TC_VerifyEnterUsername_75() {
		test = extent.createTest("TC_VerifyEnterUsername_75");
		signupHelper.EnterUsername.sendKeys(Signup_UnamePassword_enum.Signup_UnamePassword2.Username);
	}
	
	@Test(priority = 76)
	public void TC_VerifyEnterNewLoginPassword_76() {
		test = extent.createTest("TC_VerifyEnterNewLoginPassword_76");
		signupHelper.EnterPasswd.sendKeys(Signup_UnamePassword_enum.Signup_UnamePassword2.Password);
	}
	
	@Test(priority = 77)
	public void TC_VerifyReEnterLoginPassword_77() {
		test = extent.createTest("TC_VerifyReEnterLoginPassword_77");
		signupHelper.Re_EnterPasswd.sendKeys(Signup_UnamePassword_enum.Signup_UnamePassword2.ConfirmPasswd);
	}
		
	@Test(priority = 78)
	public void TC_ViewTermsandConditions_78() {
		test = extent.createTest("TC_ViewTermsandConditions_78");
		signupHelper.AgreeTermsnCondition.click();
	}
	
	@Test(priority = 79)
	public void TC_CloseTermsandConditionsPopup_79() {
		test = extent.createTest("TC_CloseTermsandConditionsPopup_79");
		signupHelper.TermsnConditionsCloseBtn.click();
	}
	
	@Test(priority = 80)
	public void TC_AcceptTermsandConditions_80() {
		test = extent.createTest("TC_AcceptTermsandConditions_80");
		signupHelper.TermsCheckBox2.click();
	}
	
	@Test(priority = 81)
	public void TC_VerifyClickSignupButton_81() {
		test = extent.createTest("TC_VerifyClickSignupButton_81");
		signupHelper.SignupPageButton.click();
	}
}
