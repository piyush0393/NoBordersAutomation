package com.touku.webapp.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.touku.webapp.config.Login_data.Login_enum;
import com.touku.webapp.config.URL_data.URL_enum;
import com.touku.webapp.testbase.WebTestBase;

public class Login extends WebTestBase{
	 
	
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
	public void TC_VerifyLoginBtnClick_3() {
		test = extent.createTest("VerifyLoginBtnClick_3");
		homePageHelper.LoginBtnHomePage.click();
	}
	
	@Test(priority = 4)
	public void TC_LoginURLVerify_4() {
		test = extent.createTest("TC_LoginURLVerify_4");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_Login.URL), "The URL is not same as expected");
	}
	
	//Verify all Elements Login Page ---- TO BE DONE
	
	@Test(priority = 5)
	public void TC_BackBtnloginPageVerify_5() {
		test = extent.createTest("TC_BackBtnloginPageVerify_5");
		if(loginHelper.LoginPageBackBtn.isDisplayed())
			System.out.println("LoginPageBackBtn available");
		else 
			System.out.println("LoginPageBackBtn Missing");
	}
	
	@Test(priority = 6)
	public void TC_SelectedLanguageFlagLoginPageVerify_6() {
		test = extent.createTest("TC_SelectedLanguageFlagLoginPageVerify_6");
		if(loginHelper.LanguageFlagHomePage.isDisplayed())
			System.out.println("LanguageFlagHomePage available");
		else 
			System.out.println("LanguageFlagHomePage Missing");
	}
	
	@Test(priority = 7)
	public void TC_ToukuHeadingLoginPageVerify_7() {
		test = extent.createTest("TC_ToukuHeadingLoginPageVerify_7");
		if(loginHelper.ToukuHeadingLoginPage.isDisplayed())
			System.out.println("ToukuHeadingLoginPage available");
		else 
			System.out.println("ToukuHeadingLoginPage Missing");
	}
	
	@Test(priority = 8)
	public void TC_EnterUsernameFieldLoginPageVerify_8() {
		test = extent.createTest("TC_EnterUsernameFieldLoginPageVerify_8");
		if(loginHelper.EnterUsername.isDisplayed())
			System.out.println("EnterUsername Field available");
		else 
			System.out.println("EnterUsername Field Missing");
	}
	
	@Test(priority = 9)
	public void TC_EnterPasswdFieldLoginPageVerify_9() {
		test = extent.createTest("TC_BackBtnLoginPageVerify_9");
		if(loginHelper.EnterPasswd.isDisplayed())
			System.out.println("EnterPasswd Field available");
		else 
			System.out.println("EnterPasswd Field Missing");
	}
	
	@Test(priority = 10)
	public void TC_EnterUsernameFieldPlaceholderLoginPageVerify_10() {
		test = extent.createTest("TC_EnterUsernameFieldPlaceholderLoginPageVerify_10");
		if(loginHelper.EnterUsernamePlaceholder.isDisplayed())
			System.out.println("EnterUsernamePlaceholder available");
		else 
			System.out.println("EnterUsernamePlaceholder Missing");
	}
	
	@Test(priority = 11)
	public void TC_EnterPasswdFieldPlaceholderLoginPageVerify_11() {
		test = extent.createTest("TC_EnterPasswdFieldPlaceholderLoginPageVerify_11");
		if(loginHelper.EnterPasswdPlaceholder.isDisplayed())
			System.out.println("EnterPasswdPlaceholder available");
		else 
			System.out.println("EnterPasswdPlaceholder Missing");
	}
	
	@Test(priority = 12)
	public void TC_RememberMeCheckboxLoginPageVerify_12() {
		test = extent.createTest("TC_RememberMeCheckboxLoginPageVerify_12");
		if(loginHelper.RememberMeCheckbox2.isDisplayed())
			System.out.println("RememberMeCheckbox2 available");
		else 
			System.out.println("RememberMeCheckbox2 Missing");
	}
	
	@Test(priority = 13)
	public void TC_RememberMeTextLoginPageVerify_13() {
		test = extent.createTest("TC_RememberMeTextLoginPageVerify_13");
		if(loginHelper.RememberMeText.isDisplayed())
			System.out.println("RememberMeText available");
		else 
			System.out.println("RememberMeText Missing");
	}
	
	@Test(priority = 14)
	public void TC_LoginBtnTextLoginPageVerify_14() {
		test = extent.createTest("TC_LoginBtnTextLoginPageVerify_14");
		if(loginHelper.LoginPageLoginBtnText.isDisplayed())
			System.out.println("LoginPageLoginBtnText available");
		else 
			System.out.println("LoginPageLoginBtnText Missing");
	}
	
	@Test(priority = 15)
	public void TC_LoginBtnLoginPageVerify_15() {
		test = extent.createTest("TC_LoginBtnLoginPageVerify_15");
		if(loginHelper.LoginPageLoginBtn.isDisplayed())
			System.out.println("LoginPageLoginBtn available");
		else 
			System.out.println("LoginPageLoginBtn Missing");
	}
	
	@Test(priority = 16)
	public void TC_ForgotUnamePasswdLinkLoginPage_16() {
		test = extent.createTest("TC_LoginBtnLoginPageVerify_15");
		if(loginHelper.ForgotUname_Passwd.isDisplayed())
			System.out.println("ForgotUname_Passwd available");
		else 
			System.out.println("ForgotUname_Passwd Missing");
	}
	
	@Test(priority = 17)
	public void TC_ForgotUnameLinkLoginPage_17() {
		test = extent.createTest("TC_ForgotUnameLinkLoginPage_17");
		if(loginHelper.ForgotUname.isDisplayed())
			System.out.println("ForgotUname available");
		else 
			System.out.println("ForgotUname Missing");
	}
	
	@Test(priority = 18)
	public void TC_ForgotPasswdLinkLoginPage_18() {
		test = extent.createTest("TC_ForgotPasswdLinkLoginPage_18");
		if(loginHelper.ForgotPasswd.isDisplayed())
			System.out.println("ForgotPasswd available");
		else 
			System.out.println("ForgotPasswd Missing");
	}
	
	@Test(priority = 19)
	public void TC_Text3LoginPageVerify_19() {
		test = extent.createTest("TC_Text3LoginPageVerify_19");
		if(loginHelper.Text3LoginPage.isDisplayed())
			System.out.println("Text3LoginPage available");
		else 
			System.out.println("Text3LoginPage Missing");
	}
	
	@Test(priority = 20)
	public void TC_FacebookLogoLoginPageVerify_20() {
		test = extent.createTest("TC_FacebookLogoLoginPageVerify_20");
		if(loginHelper.FacebookLogoLoginPage.isDisplayed())
			System.out.println("FacebookLogoLoginPage available");
		else 
			System.out.println("FacebookLogoLoginPage Missing");
	}
	@Test(priority = 21)
	public void TC_LineLogoLoginPageVerify_21() {
		test = extent.createTest("TC_LineLogoLoginPageVerify_21");
		if(loginHelper.LineLogoLoginPage.isDisplayed())
			System.out.println("LineLogoLoginPage available");
		else 
			System.out.println("LineLogoLoginPage Missing");
	}
	@Test(priority = 22)
	public void TC_GooglePlusLogoLoginPageVerify_22() {
		test = extent.createTest("TC_GooglePlusLogoLoginPageVerify_22");
		if(loginHelper.GooglePlusLogoLoginPage.isDisplayed())
			System.out.println("GooglePlusLogoLoginPage available");
		else 
			System.out.println("GooglePlusLogoLoginPage Missing");
	}
	@Test(priority = 23)
	public void TC_TwitterLogoLoginPageVerify_23() {
		test = extent.createTest("TC_TwitterLogoLoginPageVerify_23");
		if(loginHelper.TwitterLogoLoginPage.isDisplayed())
			System.out.println("TwitterLogoLoginPage available");
		else 
			System.out.println("TwitterLogoLoginPage Missing");
	}
	@Test(priority = 24)
	public void TC_TelegramLogoLoginPageVerify_24() {
		test = extent.createTest("TC_TelegramLogoLoginPageVerify_24");
		if(loginHelper.TelegramLogoLoginPage.isDisplayed())
			System.out.println("TelegramLogoLoginPage available");
		else 
			System.out.println("TelegramLogoLoginPage Missing");
	}
	@Test(priority = 25)
	public void TC_TalkLogoLoginPageVerify_25() {
		test = extent.createTest("TC_TalkLogoLoginPageVerify_25");
		if(loginHelper.TalkLogoLoginPage.isDisplayed())
			System.out.println("TalkLogoLoginPage available");
		else 
			System.out.println("TalkLogoLoginPage Missing");
	}
	
	@Test(priority = 26)
	public void TC_Text4LoginPageVerify_26() {
		test = extent.createTest("TC_Text4LoginPageVerify_26");
		if(loginHelper.Text4LoginPage.isDisplayed())
			System.out.println("Text4LoginPage available");
		else 
			System.out.println("Text4LoginPage Missing");
	}
	
	@Test(priority = 27)
	public void TC_LoginViaAppleButtonVerify_27() {
		test = extent.createTest("TC_LoginViaAppleButtonVerify_27");
		if(loginHelper.LoginViaAppleButton.isDisplayed())
			System.out.println("LoginViaAppleButton available");
		else 
			System.out.println("LoginViaAppleButton Missing");
	}
	
	@Test(priority = 28)
	public void TC_AppleLoginTextVerify_28() {
		test = extent.createTest("TC_AppleLoginTextVerify_28");
		if(loginHelper.AppleLoginText.isDisplayed())
			System.out.println("AppleLoginText available");
		else 
			System.out.println("AppleLoginText Missing");
	}
	
	@Test(priority = 29)
	public void TC_AppleLoginLogoVerify_29() {
		test = extent.createTest("TC_AppleLoginLogoVerify_29");
		if(loginHelper.AppleLoginLogo.isDisplayed())
			System.out.println("AppleLoginLogo available");
		else 
			System.out.println("AppleLoginLogo Missing");
	}
	
	@Test(priority = 30)
	public void TC_NeedSupportLinkVerify_30() {
		test = extent.createTest("TC_NeedSupportLinkVerify_30");
		if(loginHelper.NeedSupportTextLink.isDisplayed())
			System.out.println("NeedSupportTextLink available");
		else 
			System.out.println("NeedSupportTextLink Missing");
	}
	
	@Test(priority = 31)
	public void TC_CrispChatBoxIconVerify_31() {
		test = extent.createTest("TC_CrispChatBoxIconVerify_31");
		if(loginHelper.CristChatBoxIcon.isDisplayed())
			System.out.println("CristChatBoxIcon available");
		else 
			System.out.println("CristChatBoxIcon Missing");
	}
	
	@Test(priority = 30)
	public void TC_EnterUsername_30() {
		test = extent.createTest("TC_EnterUsername_30");
		loginHelper.EnterUsername.sendKeys(Login_enum.Login1.username);
	}
	
	@Test(priority = 31)
	public void TC_EnterPasswd_31() {
		test = extent.createTest("TC_EnterPasswd_31");
		loginHelper.EnterPasswd.sendKeys(Login_enum.Login1.password);
	}
	
	@Test(priority = 32)
	public void TC_ClickRememberMeCheck_32() {
		test = extent.createTest("TC_ClickRemeberMeCheck_32");
		loginHelper.RememberMeCheckbox2.click();
	}
	
	@Test(priority = 33)
	public void TC_ClickLoginButton_33() {
		test = extent.createTest("TC_ClickLoginButton_33");
		loginHelper.LoginPageLoginBtn.click();
	}

}
