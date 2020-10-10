package com.touku.webapp.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.touku.webapp.config.Login_data.Login_enum;
import com.touku.webapp.config.URL_data.URL_enum;
import com.touku.webapp.testbase.WebTestBase;

public class AdminHome extends WebTestBase{

	
	
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
		
		Thread.sleep(1500);
		loginHelper.EnterUsername.sendKeys(Login_enum.Login1.username);
		
		loginHelper.EnterPasswd.sendKeys(Login_enum.Login1.password);
		
		loginHelper.RememberMeCheckbox2.click();
		
		loginHelper.LoginPageLoginBtn.click();
		
	}


	//AdminHome Page elements verified
	
	@Test(priority = 4)
	public void TC_SidemenuHomeOptionVerify_4() {
		test = extent.createTest("TC_SidemenuHomeOptionVerify_4");
		if(adminhomeHelper.SidemenuHomeOption.isDisplayed())
			System.out.println("SidemenuHomeOption available");
		else 
			System.out.println("SidemenuHomeOption Missing");
	}
	
	@Test(priority = 5)
	public void TC_HomeHeaderVerify_5() {
		test = extent.createTest("TC_HomeHeaderVerify_5");
		if(adminhomeHelper.HomeHeader.isDisplayed())
			System.out.println("HomeHeader available");
		else 
			System.out.println("HomeHeader Missing");
	}
	
	@Test(priority = 6)
	public void TC_WelcomeToTOUKU_HeaderVerify_6() {
		test = extent.createTest("TC_WelcomeToTOUKU_HeaderVerify_6");
		if(adminhomeHelper.WelcomeToTOUKU_Header.isDisplayed())
			System.out.println("WelcomeToTOUKU_Header available");
		else 
			System.out.println("WelcomeToTOUKU_Header Missing");
	}
	
	@Test(priority = 7)
	public void TC_ClickToukuButtonDescVerify_7() {
		test = extent.createTest("TC_ClickToukuButtonDescVerify_7");
		if(adminhomeHelper.ClickToukuButtonDesc.isDisplayed())
			System.out.println("ClickToukuButtonDesc available");
		else 
			System.out.println("ClickToukuButtonDesc Missing");
	}
	
	@Test(priority = 8)
	public void TC_ClickHereButtonVerify_8() {
		test = extent.createTest("TC_ClickHereButtonVerify_8");
		if(adminhomeHelper.ClickHereButton.isDisplayed())
			System.out.println("ClickHereButton available");
		else 
			System.out.println("ClickHereButton Missing");
	}
	
	@Test(priority = 9)
	public void TC_HomeBGImageVerify_9() {
		test = extent.createTest("TC_HomeBGImageVerify_9");
		if(adminhomeHelper.HomeBGImage.isDisplayed())
			System.out.println("HomeBGImage available");
		else 
			System.out.println("HomeBGImage Missing");
	}
	
	@Test(priority = 10)
	public void TC_AnnouncementsHeaderVerify_10() {
		test = extent.createTest("TC_AnnouncementsHeaderVerify_10");
		if(adminhomeHelper.AnnouncementsHeader.isDisplayed())
			System.out.println("AnnouncementsHeader available");
		else 
			System.out.println("AnnouncementsHeader Missing");
	}
	
	@Test(priority = 11)
	public void TC_DateTableTDHeaderVerify_11() {
		test = extent.createTest("TC_DateTableTDHeaderVerify_11");
		if(adminhomeHelper.DateTableTDHeader.isDisplayed())
			System.out.println("DateTableTDHeader available");
		else 
			System.out.println("DateTableTDHeader Missing");
	}
	
	@Test(priority = 12)
	public void TC_TitleTR1Verify_12() {
		test = extent.createTest("TC_TitleTR1Verify_12");
		if(adminhomeHelper.TitleTR1.isDisplayed())
			System.out.println("TitleTR1 available");
		else 
			System.out.println("TitleTR1 Missing");
	}
	
	@Test(priority = 13)
	public void TC_DateTR1Verify_13() {
		test = extent.createTest("TC_DateTR1Verify_13");
		if(adminhomeHelper.DateTR1.isDisplayed())
			System.out.println("DateTR1 available");
		else 
			System.out.println("DateTR1 Missing");
	}
	
	@Test(priority = 14)
	public void TC_InsightSummaryDateVerify_14() {
		test = extent.createTest("TC_InsightSummaryDateVerify_14");
		if(adminhomeHelper.InsightSummaryDate.isDisplayed())
			System.out.println("InsightSummaryDate available");
		else 
			System.out.println("InsightSummaryDate Missing");
	}
	
	@Test(priority = 15)
	public void TC_InsightSummaryHeadingVerify_15() {
		test = extent.createTest("TC_InsightSummaryHeadingVerify_15");
		if(adminhomeHelper.InsightSummaryHeading.isDisplayed())
			System.out.println("InsightSummaryHeading available");
		else 
			System.out.println("InsightSummaryHeading Missing");
	}
	
	@Test(priority = 16)
	public void TC_TargetReachCardHeadingVerify_16() {
		test = extent.createTest("TC_TargetReachCardHeadingVerify_16");
		if(adminhomeHelper.TargetReachCardHeading.isDisplayed())
			System.out.println("TargetReachCardHeading available");
		else 
			System.out.println("TargetReachCardHeading Missing");
	}
	
	@Test(priority = 17)
	public void TC_TargetReachAudienceNumberVerify_17() {
		test = extent.createTest("TC_TargetReachAudienceNumberVerify_17");
		if(adminhomeHelper.TargetReachAudienceNumber.isDisplayed())
			System.out.println("TargetReachAudienceNumber available");
		else 
			System.out.println("TargetReachAudienceNumber Missing");
	}
	
	@Test(priority = 18)
	public void TC_TargetReachAudiencePercentVerify_18() {
		test = extent.createTest("TC_TargetReachAudiencePercentVerify_18");
		if(adminhomeHelper.TargetReachAudiencePercent.isDisplayed())
			System.out.println("TargetReachAudiencePercent available");
		else 
			System.out.println("TargetReachAudiencePercent Missing");
	}
	
	@Test(priority = 19)
	public void TC_TotalMessagesHeadingVerify_19() {
		test = extent.createTest("TC_TotalMessagesHeadingVerify_19");
		if(adminhomeHelper.TotalMessagesHeading.isDisplayed())
			System.out.println("TotalMessagesHeading available");
		else 
			System.out.println("TotalMessagesHeading Missing");
	}
	
	@Test(priority = 20)
	public void TC_One_OneChatsHeadingVerify_20() {
		test = extent.createTest("TC_One_OneChatsHeadingVerify_20");
		if(adminhomeHelper.One_OneChatsHeading.isDisplayed())
			System.out.println("One_OneChatsHeading available");
		else 
			System.out.println("One_OneChatsHeading Missing");
	}
	
	@Test(priority = 21)
	public void TC_TotalMessagesCountVerify_21() {
		test = extent.createTest("TC_TotalMessagesCountVerify_21");
		if(adminhomeHelper.TotalMessagesCount.isDisplayed())
			System.out.println("TotalMessagesCount available");
		else 
			System.out.println("TotalMessagesCount Missing");
	}
	
	@Test(priority = 22)
	public void TC_TotalMessagesPercentVerify_22() {
		test = extent.createTest("TC_TotalMessagesPercentVerify_22");
		if(adminhomeHelper.TotalMessagesPercent.isDisplayed())
			System.out.println("TotalMessagesPercent available");
		else 
			System.out.println("TotalMessagesPercent Missing");
	}
	
	@Test(priority = 23)
	public void TC_TotalMsgsLastComparedDaysVerify_23() {
		test = extent.createTest("TC_TotalMsgsLastComparedDaysVerify_23");
		if(adminhomeHelper.TotalMsgsLastComparedDays.isDisplayed())
			System.out.println("TotalMsgsLastComparedDays available");
		else 
			System.out.println("TotalMsgsLastComparedDays Missing");
	}
	
	@Test(priority = 24)
	public void TC_One_OneChatCountNumberVerify_24() {
		test = extent.createTest("TC_One_OneChatCountNumberVerify_24");
		if(adminhomeHelper.One_OneChatCountNumber.isDisplayed())
			System.out.println("One_OneChatCountNumber available");
		else 
			System.out.println("One_OneChatCountNumber Missing");
	}
	
	@Test(priority = 25)
	public void TC_One_OneChatPercentVerify_25() {
		test = extent.createTest("TC_One_OneChatPercentVerify_25");
		if(adminhomeHelper.One_OneChatPercent.isDisplayed())
			System.out.println("One_OneChatPercent available");
		else 
			System.out.println("One_OneChatPercent Missing");
	}
	
	@Test(priority = 26)
	public void TC_One_OneChatLastComparedDaysVerify_26() {
		test = extent.createTest("TC_One_OneChatLastComparedDaysVerify_26");
		if(adminhomeHelper.One_OneChatLastComparedDays.isDisplayed())
			System.out.println("One_OneChatLastComparedDays available");
		else 
			System.out.println("One_OneChatLastComparedDays Missing");
	}
	
	@Test(priority = 27)
	public void TC_TotalMessagesChartVerify_27() {
		test = extent.createTest("TC_TotalMessagesChartVerify_27");
		if(adminhomeHelper.TotalMessagesChart.isDisplayed())
			System.out.println("TotalMessagesChart available");
		else 
			System.out.println("TotalMessagesChart Missing");
	}
	
	@Test(priority = 28)
	public void TC_One_OneChatChartVerify_28() {
		test = extent.createTest("TC_One_OneChatChartVerify_28");
		if(adminhomeHelper.One_OneChatChart.isDisplayed())
			System.out.println("One_OneChatChart available");
		else 
			System.out.println("One_OneChatChart Missing");
	}
	
	@Test(priority = 29)
	public void TC_TargetReachChartVerify_29() {
		test = extent.createTest("TC_TargetReachChartVerify_29");
		if(adminhomeHelper.TargetReachChart.isDisplayed())
			System.out.println("TargetReachChart available");
		else 
			System.out.println("TargetReachChart Missing");
	}
	
	@Test(priority = 30)
	public void TC_ScheduledMessagesVerify_30() {
		test = extent.createTest("TC_ScheduledMessagesVerify_30");
		if(adminhomeHelper.ScheduledMessages.isDisplayed())
			System.out.println("ScheduledMessages available");
		else 
			System.out.println("ScheduledMessages Missing");
	}
	
	@Test(priority = 31)
	public void TC_ContentTD1Verify_31() {
		test = extent.createTest("TC_ContentTD1Verify_31");
		if(adminhomeHelper.ContentTD1.isDisplayed())
			System.out.println("ContentTD1 available");
		else 
			System.out.println("ContentTD1 Missing");
	}
	
	@Test(priority = 32)
	public void TC_TargetTD2Verify_32() {
		test = extent.createTest("TC_TargetTD2Verify_32");
		if(adminhomeHelper.TargetTD2.isDisplayed())
			System.out.println("TargetTD2 available");
		else 
			System.out.println("TargetTD2 Missing");
	}
	
	@Test(priority = 33)
	public void TC_NumberOfTargetTD3Verify_33() {
		test = extent.createTest("TC_NumberOfTargetTD3Verify_33");
		if(adminhomeHelper.NumberOfTargetTD3.isDisplayed())
			System.out.println("NumberOfTargetTD3 available");
		else 
			System.out.println("NumberOfTargetTD3 Missing");
	}
	
	@Test(priority = 34)
	public void TC_AdvancedTD4Verify_34() {
		test = extent.createTest("TC_AdvancedTD4Verify_34");
		if(adminhomeHelper.AdvancedTD4.isDisplayed())
			System.out.println("AdvancedTD4 available");
		else 
			System.out.println("AdvancedTD4 Missing");
	}
	
	@Test(priority = 35)
	public void TC_ScheduledAtTD5Verify_35() {
		test = extent.createTest("TC_ScheduledAtTD5Verify_35");
		if(adminhomeHelper.ScheduledAtTD5.isDisplayed())
			System.out.println("ScheduledAtTD5 available");
		else 
			System.out.println("ScheduledAtTD5 Missing");
	}
	
	@Test(priority = 33)
	public void TC_BulkMessagesDefaultMsgVerify_33() {
		test = extent.createTest("TC_BulkMessagesDefaultMsgVerify_33");
		if(adminhomeHelper.BulkMessagesDefaultMsg.isDisplayed())
			System.out.println("BulkMessagesDefaultMsg available");
		else 
			System.out.println("BulkMessagesDefaultMsg Missing");
	}
	
	@Test(priority = 34)
	public void TC_CreateNewMessageButtonVerify_34() {
		test = extent.createTest("TC_CreateNewMessageButtonVerify_34");
		if(adminhomeHelper.CreateNewMessageButton.isDisplayed())
			System.out.println("CreateNewMessageButton available");
		else 
			System.out.println("CreateNewMessageButton Missing");
	}
	
	@Test(priority = 35)
	public void TC_DefaultTextTotalMessagesVerify_35() {
		test = extent.createTest("TC_DefaultTextTotalMessagesVerify_35");
		if(adminhomeHelper.DefaultTextTotalMessages.isDisplayed())
			System.out.println("DefaultTextTotalMessages available");
		else 
			System.out.println("DefaultTextTotalMessages Missing");
	}
	
	@Test(priority = 36)
	public void TC_DefaultButtonTotalMessagesVerify_36() {
		test = extent.createTest("TC_DefaultButtonTotalMessagesVerify_36");
		if(adminhomeHelper.DefaultButtonTotalMessages.isDisplayed())
			System.out.println("DefaultButtonTotalMessages available");
		else 
			System.out.println("DefaultButtonTotalMessages Missing");
	}
	
	@Test(priority = 37)
	public void TC_DefaultTextOneOneChatVerify_37() {
		test = extent.createTest("TC_DefaultTextOneOneChatVerify_37");
		if(adminhomeHelper.DefaultTextOneOneChat.isDisplayed())
			System.out.println("DefaultTextOneOneChat available");
		else 
			System.out.println("DefaultTextOneOneChat Missing");
	}
	
	@Test(priority = 38)
	public void TC_DefaultButtonOneOneChatVerify_38() {
		test = extent.createTest("TC_DefaultButtonOneOneChatVerify_38");
		if(adminhomeHelper.DefaultButtonOneOneChat.isDisplayed())
			System.out.println("DefaultButtonOneOneChat available");
		else 
			System.out.println("DefaultButtonOneOneChat Missing");
	}

	@Test(priority = 39)
	public void TC_CheckCurrentURL_39() {
		test = extent.createTest("TC_CheckCurrentURL_39");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINHome.URL), "The URL is not same as expected");
	}
	
	//Check ClickHere Button
	
	@Test(priority = 40)
	public void TC_ClickHereButtonClickVerify_40() {
		test = extent.createTest("TC_ClickHereButtonClickVerify_39");
		adminhomeHelper.ClickHereButton.click();
	}
	
	@Test(priority = 41)
	public void TC_CheckCurrentURL_41() {
		test = extent.createTest("TC_CheckCurrentURL_41");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINClickHereButton.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 42)
	public void TC_SwitchBackToToukuHome_42() {
		test = extent.createTest("TC_SwitchBackToToukuHome_42");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "" + Keys.SHIFT + "" + Keys.TAB);
	}
	
	@Test(priority = 43)
	public void TC_VerifyAnnouncementTitleClick_43() {
		test = extent.createTest("TC_VerifyAnnouncementTitleClick_43");
		adminhomeHelper.TitleTR1.click();
	}
	
	@Test(priority = 44)
	public void TC_CheckCurrentURL_44() {
		test = extent.createTest("TC_CheckCurrentURL_44");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINAnnouncementDetails.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 45)
	public void TC_ReturnToAdminHome_45() {
		test = extent.createTest("TC_ReturnToAdminHome_45");
		adminhomeHelper.SidemenuHomeOption.click();
	}
	
	@Test(priority = 46)
	public void TC_VerifyInsightSummarySendAMessageButtonClick_46() {
		test = extent.createTest("TC_VerifyInsightSummarySendAMessageButtonClick_46");
		adminhomeHelper.DefaultButtonTotalMessages.click();
	}
	
	@Test(priority = 47)
	public void TC_CheckCurrentURL_47() {
		test = extent.createTest("TC_CheckCurrentURL_44");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINComposeMessage.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 48)
	public void TC_ReturnToAdminHome_48() {
		test = extent.createTest("TC_ReturnToAdminHome_48");
		TC_ReturnToAdminHome_45();
	}
	
	@Test(priority = 49)
	public void TC_VerifyStartAChatButtonClick_49() {
		test = extent.createTest("TC_VerifyStartAChatButtonClick_49");
		adminhomeHelper.DefaultButtonOneOneChat.click();
	}
	
	@Test(priority = 50)
	public void TC_CheckCurrentURL_50() {
		test = extent.createTest("TC_CheckCurrentURL_50");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINStartAChatFollowers.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 51)
	public void TC_ReturnToAdminHome_51() {
		test = extent.createTest("TC_ReturnToAdminHome_51");
		TC_ReturnToAdminHome_45();
	}
	
	@Test(priority = 52)
	public void TC_VerifyCreateNewMessageButtonClick_52() throws InterruptedException {
		test = extent.createTest("TC_VerifyCreateNewMessageButtonClick_52");
		adminhomeHelper.CreateNewMessageButton.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 53)
	public void TC_CheckCurrentURL_53() {
		test = extent.createTest("TC_CheckCurrentURL_53");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINComposeMessage.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 54)
	public void TC_ReturnToAdminHome_54() {
		test = extent.createTest("TC_ReturnToAdminHome_54");
		TC_ReturnToAdminHome_45();
	}
}
