package com.touku.webapp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.touku.webapp.config.Login_data.Login_enum;
import com.touku.webapp.config.URL_data.URL_enum;
import com.touku.webapp.testbase.WebTestBase;

public class ScenarioList extends WebTestBase{
	
	@Test(priority = 1)
	public void TC_URLVerify_1() {
		test = extent.createTest("TC_URLVerify_1");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_WelcomeHome.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 2)
	public void TC_ChangeLanguageFlag_2() {
		test = extent.createTest("TC_ChangeLangaugeFlag_2");
		homePageHelper.LanguageFlagHomePage.click();
		homePageHelper.EnglishFlag.click();
	}
	
	@Test(priority = 3)
	public void TC_LoginUser_3() throws InterruptedException {
		test = extent.createTest("TC_LoginUser_3");
		Thread.sleep(2000);
		homePageHelper.LoginBtnHomePage.click();
		Thread.sleep(1000);
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_Login.URL), "The URL is not same as expected");
		Thread.sleep(2000);
		loginHelper.EnterUsername.sendKeys(Login_enum.Login1.username);
		
		loginHelper.EnterPasswd.sendKeys(Login_enum.Login1.password);
		
		loginHelper.RememberMeCheckbox2.click();
		
		loginHelper.LoginPageLoginBtn.click();
		
	}

	@Test(priority = 4)
	public void TC_VerifyScenarioSideMenuOption_4() {
		test = extent.createTest("TC_VerifyScenarioSideMenuOption_4");
		scenarioListHelper.SideMenuOptionScenario.click();

	}
	
	@Test(priority = 5)
	public void TC_CheckCurrentURL_5() {
		test = extent.createTest("TC_CheckCurrentURL_5");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINScenarioListPage.URL), "The URL is not same as expected");
	}
	
	// Scenario tab elements verification
	
	@Test(priority = 6)
	public void TC_ScenarioListHeadingVerify_6() {
		test = extent.createTest("TC_ScenarioListHeadingVerify_6");
		if(scenarioListHelper.ScenarioListHeading.isDisplayed())
			System.out.println("ScenarioListHeading available");
		else 
			System.out.println("ScenarioListHeading Missing");
	}
	
	@Test(priority = 7)
	public void TC_ChannelNameHeadingVerify_7() {
		test = extent.createTest("TC_ChannelNameHeadingVerify_7");
		if(scenarioListHelper.ChannelNameHeading.isDisplayed())
			System.out.println("ChannelNameHeading available");
		else 
			System.out.println("ChannelNameHeading Missing");
	}
	
	@Test(priority = 8)
	public void TC_ChannelNameDynamicVerify_8() {
		test = extent.createTest("TC_ChannelNameDynamicVerify_8");
		if(scenarioListHelper.ChannelNameDynamic.isDisplayed())
			System.out.println("ChannelNameDynamic available");
		else 
			System.out.println("ChannelNameDynamic Missing");
	}
	
	@Test(priority = 9)
	public void TC_ComposeNewButtonVerify_9() {
		test = extent.createTest("TC_ComposeNewButtonVerify_9");
		if(scenarioListHelper.ComposeNewButton.isDisplayed())
			System.out.println("ComposeNewButton available");
		else 
			System.out.println("ComposeNewButton Missing");
	}
	
	@Test(priority = 10)
	public void TC_ComposeNewTextVerify_10() {
		test = extent.createTest("TC_ComposeNewTextVerify_10");
		if(scenarioListHelper.ComposeNewText.isDisplayed())
			System.out.println("ComposeNewText available");
		else 
			System.out.println("ComposeNewText Missing");
	}
	
	@Test(priority = 11)
	public void TC_ActiveTabVerify_11() {
		test = extent.createTest("TC_ActiveTabVerify_11");
		if(scenarioListHelper.ActiveTab.isDisplayed())
			System.out.println("ActiveTab available");
		else 
			System.out.println("ActiveTab Missing");
	}
	
	@Test(priority = 12)
	public void TC_ScenarioTabVerify_12() {
		test = extent.createTest("TC_ScenarioTabVerify_12");
		if(scenarioListHelper.ScenarioTab.isDisplayed())
			System.out.println("ScenarioTab available");
		else 
			System.out.println("ScenarioTab Missing");
	}
	
	@Test(priority = 13)
	public void TC_DraftsTabVerify_13() {
		test = extent.createTest("TC_DraftsTabVerify_13");
		if(scenarioListHelper.DraftsTab.isDisplayed())
			System.out.println("DraftsTab available");
		else 
			System.out.println("DraftsTab Missing");
	}
	
	@Test(priority = 14)
	public void TC_ScenarioActionTD1Verify_14() {
		test = extent.createTest("TC_ScenarioActionTD1Verify_14");
		if(scenarioListHelper.ScenarioActionTD1.isDisplayed())
			System.out.println("ScenarioActionTD1 available");
		else 
			System.out.println("ScenarioActionTD1 Missing");
	}
	
	@Test(priority = 15)
	public void TC_ScenarioContentTD2Verify_15() {
		test = extent.createTest("TC_ScenarioContentTD2Verify_15");
		if(scenarioListHelper.ScenarioContentTD2.isDisplayed())
			System.out.println("ScenarioContentTD2 available");
		else 
			System.out.println("ScenarioContentTD2 Missing");
	}
	
	@Test(priority = 16)
	public void TC_ScenarioTargetTD3Verify_16() {
		test = extent.createTest("TC_ScenarioTargetTD3Verify_16");
		if(scenarioListHelper.ScenarioTargetTD3.isDisplayed())
			System.out.println("ScenarioTargetTD3 available");
		else 
			System.out.println("ScenarioTargetTD3 Missing");
	}
	
	@Test(priority = 17)
	public void TC_ScenarioNumberOfTargetTD4Verify_17() {
		test = extent.createTest("TC_ScenarioNumberOfTargetTD4Verify_17");
		if(scenarioListHelper.ScenarioNumberOfTargetTD4.isDisplayed())
			System.out.println("ScenarioNumberOfTargetTD4 available");
		else 
			System.out.println("ScenarioNumberOfTargetTD4 Missing");
	}
	
	@Test(priority = 18)
	public void TC_ScenarioScenarioTD5Verify_18() {
		test = extent.createTest("TC_ScenarioScenarioTD5Verify_18");
		if(scenarioListHelper.ScenarioScenarioTD5.isDisplayed())
			System.out.println("ScenarioScenarioTD5 available");
		else 
			System.out.println("ScenarioScenarioTD5 Missing");
	}
	
	@Test(priority = 19)
	public void TC_DefaultScenarioMessageVerify_19() {
		test = extent.createTest("TC_DefaultScenarioMessageVerify_19");
		if(scenarioListHelper.DefaultScenarioMessage.isDisplayed())
			System.out.println("DefaultScenarioMessage available");
		else 
			System.out.println("DefaultScenarioMessage Missing");
	}
	
	
	//Drafts tab elements verification
	
	@Test(priority = 20)
	public void TC_DraftsActionTD1Verify_20() {
		test = extent.createTest("TC_DraftsActionTD1Verify_20");
		if(scenarioListHelper.DraftsActionTD1.isDisplayed())
			System.out.println("DraftsActionTD1 available");
		else 
			System.out.println("DraftsActionTD1 Missing");
	}
	
	@Test(priority = 21)
	public void TC_DraftsContentTD2Verify_21() {
		test = extent.createTest("TC_DraftsContentTD2Verify_21");
		if(scenarioListHelper.DraftsContentTD2.isDisplayed())
			System.out.println("DraftsContentTD2 available");
		else 
			System.out.println("DraftsContentTD2 Missing");
	}
	
	@Test(priority = 22)
	public void TC_TargetContentTD3Verify_22() {
		test = extent.createTest("TC_TargetContentTD3Verify_22");
		if(scenarioListHelper.DraftsTargetContentTD3.isDisplayed())
			System.out.println("TargetContentTD3 available");
		else 
			System.out.println("TargetContentTD3 Missing");
	}
	
	@Test(priority = 23)
	public void TC_NumberofTargetTD4Verify_23() {
		test = extent.createTest("TC_NumberofTargetTD4Verify_23");
		if(scenarioListHelper.DraftsNumberofTargetTD4.isDisplayed())
			System.out.println("NumberofTargetTD4 available");
		else 
			System.out.println("NumberofTargetTD4 Missing");
	}
	
	@Test(priority = 24)
	public void TC_ScheduledAtTD5Verify_24() {
		test = extent.createTest("TC_ScheduledAtTD5Verify_24");
		if(scenarioListHelper.DraftsScheduledAtTD5.isDisplayed())
			System.out.println("ScheduledAtTD5 available");
		else 
			System.out.println("ScheduledAtTD5 Missing");
	}
	
	@Test(priority = 25)
	public void TC_DefaultDraftsMessageVerify_25() {
		test = extent.createTest("TC_DefaultDraftsMessageVerify_25");
		if(scenarioListHelper.DefaultDraftsMessage.isDisplayed())
			System.out.println("DefaultDraftsMessage available");
		else 
			System.out.println("DefaultDraftsMessage Missing");
	}
	
	@Test(priority = 26)
	public void TC_VerifyComposeMessageButtonClick_89() throws InterruptedException {
		test = extent.createTest("TC_VerifyComposeMessageButtonClick_89");
		scenarioListHelper.ComposeNewButton.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 27)
	public void TC_CheckCurrentURL_90() {
		test = extent.createTest("TC_CheckCurrentURL_90");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINScenarioListPage.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 28)
	public void TC_ReturnToAdminMessagesList_91() {
		test = extent.createTest("TC_ReturnToAdminMessagesList_91");
		scenarioListHelper.SideMenuOptionScenario.click();
	}
	
}
