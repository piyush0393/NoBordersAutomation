package com.touku.webapp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.touku.webapp.config.Login_data.Login_enum;
import com.touku.webapp.config.Messages_data.DraftsDateFilter_data;
import com.touku.webapp.config.Messages_data.ScheduleDateFilter_data;
import com.touku.webapp.config.Messages_data.SentDateFilter_data;
import com.touku.webapp.config.URL_data.URL_enum;
import com.touku.webapp.testbase.WebTestBase;

public class MessageList extends WebTestBase{
	
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
		homePageHelper.LoginBtnHomePage.click();
		
	}
	
	@Test(priority = 3)
	public void TC_LoginUser_3() throws InterruptedException {
		test = extent.createTest("TC_LoginUser_3");
		Thread.sleep(1000);
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_Login.URL), "The URL is not same as expected");
		Thread.sleep(2000);
		loginHelper.EnterUsername.sendKeys(Login_enum.Login1.username);
		
		loginHelper.EnterPasswd.sendKeys(Login_enum.Login1.password);
		
		loginHelper.RememberMeCheckbox2.click();
		
		loginHelper.LoginPageLoginBtn.click();
		
	}

	//Schedule messages element verification
	
	
	@Test(priority = 4)
	public void TC_VerifyMessagesSideMenuOptionClick_4() {
		test = extent.createTest("TC_VerifyMessagesOptionClick_4");
		messageListHelper.SideMenuOptionMessages.click();		
	}
	
	@Test(priority = 5)
	public void TC_CheckCurrentURL_5() {
		test = extent.createTest("TC_CheckCurrentURL_5");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINMessageListPage.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 6)
	public void TC_MessageListHeaderVerify_6() {
		test = extent.createTest("TC_MessageListHeaderVerify_6");
		if(messageListHelper.MessageListHeader.isDisplayed())
			System.out.println("MessageListHeader available");
		else 
			System.out.println("MessageListHeader Missing");
	}
	
	@Test(priority = 7)
	public void TC_SideMenuOptionMessagesVerify_7() {
		test = extent.createTest("TC_SideMenuOptionMessagesVerify_7");
		if(messageListHelper.SideMenuOptionMessages.isDisplayed())
			System.out.println("SideMenuOptionMessages available");
		else 
			System.out.println("SideMenuOptionMessages Missing");
	}
	
	@Test(priority = 8)
	public void TC_DynamicChannelNameVerify_8() {
		test = extent.createTest("TC_DynamicChannelNameVerify_8");
		if(messageListHelper.DynamicChannelName.isDisplayed())
			System.out.println("DynamicChannelName available");
		else 
			System.out.println("DynamicChannelName Missing");
	}
	
	@Test(priority = 9)
	public void TC_ComposeNewButtonVerify_9() {
		test = extent.createTest("TC_ComposeNewButtonVerify_9");
		if(messageListHelper.ComposeNewButton.isDisplayed())
			System.out.println("ComposeNewButton available");
		else 
			System.out.println("ComposeNewButton Missing");
	}
	
	@Test(priority = 10)
	public void TC_ActiveTabVerify_10() {
		test = extent.createTest("TC_ActiveTabVerify_10");
		if(messageListHelper.ActiveTab.isDisplayed())
			System.out.println("ActiveTab available");
		else 
			System.out.println("ActiveTab Missing");
	}
	
	@Test(priority = 11)
	public void TC_ScheduleTabVerify_11() {
		test = extent.createTest("TC_ScheduleTabVerify_11");
		if(messageListHelper.ScheduleTab.isDisplayed())
			System.out.println("ScheduleTab available");
		else 
			System.out.println("ScheduleTab Missing");
	}
	
	@Test(priority = 12)
	public void TC_DraftsTabVerify_12() {
		test = extent.createTest("TC_DraftsTabVerify_12");
		if(messageListHelper.DraftsTab.isDisplayed())
			System.out.println("DraftsTab available");
		else 
			System.out.println("DraftsTab Missing");
	}
	
	@Test(priority = 13)
	public void TC_SentTabVerify_13() {
		test = extent.createTest("TC_SentTabVerify_13");
		if(messageListHelper.SentTab.isDisplayed())
			System.out.println("SentTab available");
		else 
			System.out.println("SentTab Missing");
	}
	
	@Test(priority = 14)
	public void TC_FromCalenderDateIconVerify_14() {
		test = extent.createTest("TC_FromCalenderDateIconVerify_14");
		if(messageListHelper.FromCalenderDateIcon.isDisplayed())
			System.out.println("FromCalenderDateIcon available");
		else 
			System.out.println("FromCalenderDateIcon Missing");
	}
	
	@Test(priority = 15)
	public void TC_FromDateCalenderVerify_15() {
		test = extent.createTest("TC_FromDateCalenderVerify_15");
		if(messageListHelper.FromDateCalender.isDisplayed())
			System.out.println("FromDateCalender available");
		else 
			System.out.println("FromDateCalender Missing");
	}
	
	@Test(priority = 16)
	public void TC_ToTextBTWVerify_16() {
		test = extent.createTest("TC_ToTextBTWVerify_16");
		if(messageListHelper.ToTextBTW.isDisplayed())
			System.out.println("ToTextBTW available");
		else 
			System.out.println("ToTextBTW Missing");
	}
	
	@Test(priority = 17)
	public void TC_ToDateCalenderVerify_17() {
		test = extent.createTest("TC_ToDateCalenderVerify_17");
		if(messageListHelper.ToDateCalender.isDisplayed())
			System.out.println("ToDateCalender available");
		else 
			System.out.println("ToDateCalender Missing");
	}
	
	@Test(priority = 18)
	public void TC_ToCalenderDateIconVerify_18() {
		test = extent.createTest("TC_ToCalenderDateIconVerify_18");
		if(messageListHelper.ToCalenderDateIcon.isDisplayed())
			System.out.println("ToCalenderDateIcon available");
		else 
			System.out.println("ToCalenderDateIcon Missing");
	}
	
	@Test(priority = 19)
	public void TC_SearchIconMessageVerify_19() {
		test = extent.createTest("TC_SearchIconMessageVerify_19");
		if(messageListHelper.SearchIconMessage.isDisplayed())
			System.out.println("SearchIconMessage available");
		else 
			System.out.println("SearchIconMessage Missing");
	}
	
	@Test(priority = 20)
	public void TC_SearchButtonVerify_20() {
		test = extent.createTest("TC_SearchButtonVerify_20");
		if(messageListHelper.SearchButton.isDisplayed())
			System.out.println("SearchButton available");
		else 
			System.out.println("SearchButton Missing");
	}
	
	@Test(priority = 21)
	public void TC_ClearButtonTextVerify_21() {
		test = extent.createTest("TC_ClearButtonTextVerify_21");
		if(messageListHelper.ClearButtonText.isDisplayed())
			System.out.println("ClearButtonText available");
		else 
			System.out.println("ClearButtonText Missing");
	}
	
	@Test(priority = 22)
	public void TC_ClearButtonVerify_22() {
		test = extent.createTest("TC_ClearButtonVerify_22");
		if(messageListHelper.ClearButton.isDisplayed())
			System.out.println("ClearButton available");
		else 
			System.out.println("ClearButton Missing");
	}
	
	@Test(priority = 23)
	public void TC_ActionTHTextVerify_23() {
		test = extent.createTest("TC_ActionTHTextVerify_23");
		if(messageListHelper.ActionTHText.isDisplayed())
			System.out.println("ActionTHText available");
		else 
			System.out.println("ActionTHText Missing");
	}
	
	@Test(priority = 24)
	public void TC_ActionTHVerify_24() {
		test = extent.createTest("TC_ActionTHVerify_24");
		if(messageListHelper.ActionTH.isDisplayed())
			System.out.println("ActionTH available");
		else 
			System.out.println("ActionTH Missing");
	}
	
	@Test(priority = 25)
	public void TC_ContentTHTextVerify_25() {
		test = extent.createTest("TC_ContentTHTextVerify_25");
		if(messageListHelper.ContentTHText.isDisplayed())
			System.out.println("ContentTHText available");
		else 
			System.out.println("ContentTHText Missing");
	}
	
	@Test(priority = 26)
	public void TC_ContentTHVerify_26() {
		test = extent.createTest("TC_ContentTHVerify_26");
		if(messageListHelper.ContentTH.isDisplayed())
			System.out.println("ContentTH available");
		else 
			System.out.println("ContentTH Missing");
	}
	
	@Test(priority = 27)
	public void TC_TargetTHTextVerify_27() {
		test = extent.createTest("TC_TargetTHTextVerify_27");
		if(messageListHelper.TargetTHText.isDisplayed())
			System.out.println("TargetTHText available");
		else 
			System.out.println("TargetTHText Missing");
	}
	
	@Test(priority = 28)
	public void TC_TargetTHVerify_28() {
		test = extent.createTest("TC_TargetTHVerify_28");
		if(messageListHelper.TargetTH.isDisplayed())
			System.out.println("TargetTH available");
		else 
			System.out.println("TargetTH Missing");
	}
	
	@Test(priority = 29)
	public void TC_NumberOfTargetTHTextVerify_29() {
		test = extent.createTest("TC_NumberOfTargetTHTextVerify_29");
		if(messageListHelper.NumberOfTargetTHText.isDisplayed())
			System.out.println("NumberOfTargetTHText available");
		else 
			System.out.println("NumberOfTargetTHText Missing");
	}
	
	@Test(priority = 30)
	public void TC_NumberOfTargetTHVerify_30() {
		test = extent.createTest("TC_NumberOfTargetTHVerify_30");
		if(messageListHelper.NumberOfTargetTH.isDisplayed())
			System.out.println("NumberOfTargetTH available");
		else 
			System.out.println("NumberOfTargetTH Missing");
	}
	
	@Test(priority = 31)
	public void TC_ScheduledAtTHTextVerify_31() {
		test = extent.createTest("TC_ScheduledAtTHTextVerify_31");
		if(messageListHelper.ScheduledAtTHText.isDisplayed())
			System.out.println("ScheduledAtTHText available");
		else 
			System.out.println("ScheduledAtTHText Missing");
	}
	
	@Test(priority = 32)
	public void TC_ScheduledAtTHVerify_32() {
		test = extent.createTest("TC_ScheduledAtTHVerify_32");
		if(messageListHelper.ScheduledAtTH.isDisplayed())
			System.out.println("ScheduledAtTH available");
		else 
			System.out.println("ScheduledAtTH Missing");
	}
	
	@Test(priority = 33)
	public void TC_DefaultMessageVerify_33() {
		test = extent.createTest("TC_DefaultMessageVerify_33");
		if(messageListHelper.DefaultMessageScheduledMessage.isDisplayed())
			System.out.println("DefaultMessage available");
		else 
			System.out.println("DefaultMessage Missing");
	}
	
	//Schedule Messages test cases
	
	@Test(priority = 34)
	public void TC_VerifyEnterFromDate_34() {
		test = extent.createTest("TC_DefaultMessageVerify_34");
		messageListHelper.FromDateCalender.sendKeys(ScheduleDateFilter_data.ScheduleDateFilter1.FromDate);
	}
	
	@Test(priority = 35)
	public void TC_VerifyEnterToDate_35() {
		test = extent.createTest("TC_DefaultMessageVerify_35");
		messageListHelper.ToDateCalender.sendKeys(ScheduleDateFilter_data.ScheduleDateFilter1.ToDate);
	}
	
	@Test(priority = 36)
	public void TC_VerifySearchButtonClick_36() {
		test = extent.createTest("TC_VerifySearchButtonClick_36");
		messageListHelper.SearchButton.click();
	}
	
	@Test(priority = 37)
	public void TC_VerifyClearButtonClick_37() {
		test = extent.createTest("TC_VerifyClearButtonClick_37");
		messageListHelper.ClearButton.click();
	}
	
	//Click Drafts Tab
	
	@Test(priority = 38)
	public void TC_VerifyDraftsTabclick_38() {
		test = extent.createTest("TC_VerifyDraftsTabclick_38");
		messageListHelper.DraftsTab.click();
	}
	
	
	//Drafts messages element verification
	
	@Test(priority = 39)
	public void TC_FromCalenderDateIconVerify_39() {
		test = extent.createTest("TC_FromCalenderDateIconVerify_39");
		if(messageListHelper.FromCalenderDateIcon.isDisplayed())
			System.out.println("FromCalenderDateIcon available");
		else 
			System.out.println("FromCalenderDateIcon Missing");
	}
	
	@Test(priority = 40)
	public void TC_FromDateCalenderVerify_40() {
		test = extent.createTest("TC_FromDateCalenderVerify_40");
		if(messageListHelper.FromDateCalender.isDisplayed())
			System.out.println("FromDateCalender available");
		else 
			System.out.println("FromDateCalender Missing");
	}
	
	@Test(priority = 41)
	public void TC_ToTextBTWVerify_41() {
		test = extent.createTest("TC_ToTextBTWVerify_41");
		if(messageListHelper.ToTextBTW.isDisplayed())
			System.out.println("ToTextBTW available");
		else 
			System.out.println("ToTextBTW Missing");
	}
	
	@Test(priority = 42)
	public void TC_ToDateCalenderVerify_42() {
		test = extent.createTest("TC_ToDateCalenderVerify_42");
		if(messageListHelper.ToDateCalender.isDisplayed())
			System.out.println("ToDateCalender available");
		else 
			System.out.println("ToDateCalender Missing");
	}
	
	@Test(priority = 43)
	public void TC_ToCalenderDateIconVerify_43() {
		test = extent.createTest("TC_ToCalenderDateIconVerify_43");
		if(messageListHelper.ToCalenderDateIcon.isDisplayed())
			System.out.println("ToCalenderDateIcon available");
		else 
			System.out.println("ToCalenderDateIcon Missing");
	}
	
	@Test(priority = 44)
	public void TC_SearchIconMessageVerify_44() {
		test = extent.createTest("TC_SearchIconMessageVerify_44");
		if(messageListHelper.SearchIconMessage.isDisplayed())
			System.out.println("SearchIconMessage available");
		else 
			System.out.println("SearchIconMessage Missing");
	}
	
	@Test(priority = 45)
	public void TC_SearchButtonVerify_45() {
		test = extent.createTest("TC_SearchButtonVerify_45");
		if(messageListHelper.SearchButton.isDisplayed())
			System.out.println("SearchButton available");
		else 
			System.out.println("SearchButton Missing");
	}
	
	@Test(priority = 46)
	public void TC_ClearButtonTextVerify_47() {
		test = extent.createTest("TC_ClearButtonTextVerify_47");
		if(messageListHelper.ClearButtonText.isDisplayed())
			System.out.println("ClearButtonText available");
		else 
			System.out.println("ClearButtonText Missing");
	}
	
	@Test(priority = 48)
	public void TC_ClearButtonVerify_48() {
		test = extent.createTest("TC_ClearButtonVerify_48");
		if(messageListHelper.ClearButton.isDisplayed())
			System.out.println("ClearButton available");
		else 
			System.out.println("ClearButton Missing");
	}
	
	@Test(priority = 49)
	public void TC_ActionTHTextVerify_49() {
		test = extent.createTest("TC_ActionTHTextVerify_49");
		if(messageListHelper.ActionTHText.isDisplayed())
			System.out.println("ActionTHText available");
		else 
			System.out.println("ActionTHText Missing");
	}
	
	@Test(priority = 50)
	public void TC_ActionTHVerify_50() {
		test = extent.createTest("TC_ActionTHVerify_50");
		if(messageListHelper.ActionTH.isDisplayed())
			System.out.println("ActionTH available");
		else 
			System.out.println("ActionTH Missing");
	}
	
	@Test(priority = 51)
	public void TC_ContentTHTextVerify_51() {
		test = extent.createTest("TC_ContentTHTextVerify_51");
		if(messageListHelper.ContentTHText.isDisplayed())
			System.out.println("ContentTHText available");
		else 
			System.out.println("ContentTHText Missing");
	}
	
	@Test(priority = 52)
	public void TC_ContentTHVerify_52() {
		test = extent.createTest("TC_ContentTHVerify_52");
		if(messageListHelper.ContentTH.isDisplayed())
			System.out.println("ContentTH available");
		else 
			System.out.println("ContentTH Missing");
	}
	
	@Test(priority = 53)
	public void TC_TargetTHTextVerify_53() {
		test = extent.createTest("TC_TargetTHTextVerify_53");
		if(messageListHelper.TargetTHText.isDisplayed())
			System.out.println("TargetTHText available");
		else 
			System.out.println("TargetTHText Missing");
	}
	
	@Test(priority = 54)
	public void TC_TargetTHVerify_54() {
		test = extent.createTest("TC_TargetTHVerify_54");
		if(messageListHelper.TargetTH.isDisplayed())
			System.out.println("TargetTH available");
		else 
			System.out.println("TargetTH Missing");
	}
	
	@Test(priority = 55)
	public void TC_NumberOfTargetTHTextVerify_55() {
		test = extent.createTest("TC_NumberOfTargetTHTextVerify_55");
		if(messageListHelper.NumberOfTargetTHText.isDisplayed())
			System.out.println("NumberOfTargetTHText available");
		else 
			System.out.println("NumberOfTargetTHText Missing");
	}
	
	@Test(priority = 56)
	public void TC_NumberOfTargetTHVerify_56() {
		test = extent.createTest("TC_NumberOfTargetTHVerify_56");
		if(messageListHelper.NumberOfTargetTH.isDisplayed())
			System.out.println("NumberOfTargetTH available");
		else 
			System.out.println("NumberOfTargetTH Missing");
	}
	
	@Test(priority = 57)
	public void TC_ScheduledAtTHTextVerify_57() {
		test = extent.createTest("TC_ScheduledAtTHTextVerify_57");
		if(messageListHelper.ScheduledAtTHText.isDisplayed())
			System.out.println("ScheduledAtTHText available");
		else 
			System.out.println("ScheduledAtTHText Missing");
	}
	
	@Test(priority = 58)
	public void TC_ScheduledAtTHVerify_58() {
		test = extent.createTest("TC_ScheduledAtTHVerify_58");
		if(messageListHelper.ScheduledAtTH.isDisplayed())
			System.out.println("ScheduledAtTH available");
		else 
			System.out.println("ScheduledAtTH Missing");
	}
	
	@Test(priority = 59)
	public void TC_DefaultMessageDraftsVerify_59() {
		test = extent.createTest("TC_DefaultMessageVerify_59");
		if(messageListHelper.DefaultMessageDrafts.isDisplayed())
			System.out.println("DefaultMessage available");
		else 
			System.out.println("DefaultMessage Missing");
	}
	
	//Drafts messages test cases
	
	@Test(priority = 60)
	public void TC_VerifyEnterFromDate_60() {
		test = extent.createTest("TC_DefaultMessageVerify_60");
		messageListHelper.FromDateCalender.sendKeys(DraftsDateFilter_data.DraftsDateFilter1.FromDate);
	}
	
	@Test(priority = 61)
	public void TC_VerifyEnterToDate_61() {
		test = extent.createTest("TC_DefaultMessageVerify_61");
		messageListHelper.ToDateCalender.sendKeys(DraftsDateFilter_data.DraftsDateFilter1.ToDate);
	}
	
	@Test(priority = 62)
	public void TC_VerifySearchButtonClick_62() {
		test = extent.createTest("TC_VerifySearchButtonClick_62");
		messageListHelper.SearchButton.click();
	}
	
	@Test(priority = 63)
	public void TC_VerifyClearButtonClick_63() {
		test = extent.createTest("TC_VerifyClearButtonClick_63");
		messageListHelper.ClearButton.click();
	}
	
	
	//Click Sent Tab
	
	@Test(priority = 64)
	public void TC_VerifySentTabclick_64() {
		test = extent.createTest("TC_VerifySentTabclick_64");
		messageListHelper.SentTab.click();
	}
	
	
	//Drafts messages element verification
	
	@Test(priority = 65)
	public void TC_FromCalenderDateIconVerify_65() {
		test = extent.createTest("TC_FromCalenderDateIconVerify_65");
		if(messageListHelper.FromCalenderDateIcon.isDisplayed())
			System.out.println("FromCalenderDateIcon available");
		else 
			System.out.println("FromCalenderDateIcon Missing");
	}
	
	@Test(priority = 66)
	public void TC_FromDateCalenderVerify_66() {
		test = extent.createTest("TC_FromDateCalenderVerify_66");
		if(messageListHelper.FromDateCalender.isDisplayed())
			System.out.println("FromDateCalender available");
		else 
			System.out.println("FromDateCalender Missing");
	}
	
	@Test(priority = 67)
	public void TC_ToTextBTWVerify_67() {
		test = extent.createTest("TC_ToTextBTWVerify_67");
		if(messageListHelper.ToTextBTW.isDisplayed())
			System.out.println("ToTextBTW available");
		else 
			System.out.println("ToTextBTW Missing");
	}
	
	@Test(priority = 68)
	public void TC_ToDateCalenderVerify_68() {
		test = extent.createTest("TC_ToDateCalenderVerify_68");
		if(messageListHelper.ToDateCalender.isDisplayed())
			System.out.println("ToDateCalender available");
		else 
			System.out.println("ToDateCalender Missing");
	}
	
	@Test(priority = 69)
	public void TC_ToCalenderDateIconVerify_69() {
		test = extent.createTest("TC_ToCalenderDateIconVerify_69");
		if(messageListHelper.ToCalenderDateIcon.isDisplayed())
			System.out.println("ToCalenderDateIcon available");
		else 
			System.out.println("ToCalenderDateIcon Missing");
	}
	
	@Test(priority = 70)
	public void TC_SearchIconMessageVerify_70() {
		test = extent.createTest("TC_SearchIconMessageVerify_70");
		if(messageListHelper.SearchIconMessage.isDisplayed())
			System.out.println("SearchIconMessage available");
		else 
			System.out.println("SearchIconMessage Missing");
	}
	
	@Test(priority = 71)
	public void TC_SearchButtonVerify_71() {
		test = extent.createTest("TC_SearchButtonVerify_71");
		if(messageListHelper.SearchButton.isDisplayed())
			System.out.println("SearchButton available");
		else 
			System.out.println("SearchButton Missing");
	}
	
	@Test(priority = 72)
	public void TC_ClearButtonTextVerify_72() {
		test = extent.createTest("TC_ClearButtonTextVerify_72");
		if(messageListHelper.ClearButtonText.isDisplayed())
			System.out.println("ClearButtonText available");
		else 
			System.out.println("ClearButtonText Missing");
	}
	
	@Test(priority = 73)
	public void TC_ClearButtonVerify_73() {
		test = extent.createTest("TC_ClearButtonVerify_73");
		if(messageListHelper.ClearButton.isDisplayed())
			System.out.println("ClearButton available");
		else 
			System.out.println("ClearButton Missing");
	}
	
	@Test(priority = 74)
	public void TC_ActionTHTextVerify_74() {
		test = extent.createTest("TC_ActionTHTextVerify_74");
		if(messageListHelper.ActionTHText.isDisplayed())
			System.out.println("ActionTHText available");
		else 
			System.out.println("ActionTHText Missing");
	}
	
	@Test(priority = 75)
	public void TC_ActionTHVerify_75() {
		test = extent.createTest("TC_ActionTHVerify_75");
		if(messageListHelper.ActionTH.isDisplayed())
			System.out.println("ActionTH available");
		else 
			System.out.println("ActionTH Missing");
	}
	
	@Test(priority = 76)
	public void TC_ContentTHTextVerify_76() {
		test = extent.createTest("TC_ContentTHTextVerify_76");
		if(messageListHelper.ContentTHText.isDisplayed())
			System.out.println("ContentTHText available");
		else 
			System.out.println("ContentTHText Missing");
	}
	
	@Test(priority = 77)
	public void TC_ContentTHVerify_77() {
		test = extent.createTest("TC_ContentTHVerify_77");
		if(messageListHelper.ContentTH.isDisplayed())
			System.out.println("ContentTH available");
		else 
			System.out.println("ContentTH Missing");
	}
	
	@Test(priority = 78)
	public void TC_TargetTHTextVerify_78() {
		test = extent.createTest("TC_TargetTHTextVerify_78");
		if(messageListHelper.TargetTHText.isDisplayed())
			System.out.println("TargetTHText available");
		else 
			System.out.println("TargetTHText Missing");
	}
	
	@Test(priority = 79)
	public void TC_TargetTHVerify_79() {
		test = extent.createTest("TC_TargetTHVerify_79");
		if(messageListHelper.TargetTH.isDisplayed())
			System.out.println("TargetTH available");
		else 
			System.out.println("TargetTH Missing");
	}
	
	@Test(priority = 80)
	public void TC_NumberOfTargetTHTextVerify_80() {
		test = extent.createTest("TC_NumberOfTargetTHTextVerify_80");
		if(messageListHelper.NumberOfTargetTHText.isDisplayed())
			System.out.println("NumberOfTargetTHText available");
		else 
			System.out.println("NumberOfTargetTHText Missing");
	}
	
	@Test(priority = 81)
	public void TC_NumberOfTargetTHVerify_81() {
		test = extent.createTest("TC_NumberOfTargetTHVerify_81");
		if(messageListHelper.NumberOfTargetTH.isDisplayed())
			System.out.println("NumberOfTargetTH available");
		else 
			System.out.println("NumberOfTargetTH Missing");
	}
	
	@Test(priority = 82)
	public void TC_ScheduledAtTHTextVerify_82() {
		test = extent.createTest("TC_ScheduledAtTHTextVerify_82");
		if(messageListHelper.ScheduledAtTHText.isDisplayed())
			System.out.println("ScheduledAtTHText available");
		else 
			System.out.println("ScheduledAtTHText Missing");
	}
	
	@Test(priority = 83)
	public void TC_ScheduledAtTHVerify_83() {
		test = extent.createTest("TC_ScheduledAtTHVerify_83");
		if(messageListHelper.ScheduledAtTH.isDisplayed())
			System.out.println("ScheduledAtTH available");
		else 
			System.out.println("ScheduledAtTH Missing");
	}
	
	@Test(priority = 84)
	public void TC_DefaultMessageSentVerify_84() {
		test = extent.createTest("TC_DefaultMessageSentVerify_84");
		if(messageListHelper.DefaultMessageSent.isDisplayed())
			System.out.println("DefaultMessageSent available");
		else 
			System.out.println("DefaultMessageSent Missing");
	}
	
	//Drafts messages test cases
	
	@Test(priority = 85)
	public void TC_VerifyEnterFromDate_85() {
		test = extent.createTest("TC_DefaultMessageVerify_85");
		messageListHelper.FromDateCalender.sendKeys(SentDateFilter_data.SentDateFilter1.FromDate);
	}
	
	@Test(priority = 86)
	public void TC_VerifyEnterToDate_86() {
		test = extent.createTest("TC_DefaultMessageVerify_86");
		messageListHelper.ToDateCalender.sendKeys(SentDateFilter_data.SentDateFilter1.ToDate);
	}
	
	@Test(priority = 87)
	public void TC_VerifySearchButtonClick_87() {
		test = extent.createTest("TC_VerifySearchButtonClick_87");
		messageListHelper.SearchButton.click();
	}
	
	@Test(priority = 88)
	public void TC_VerifyClearButtonClick_88() {
		test = extent.createTest("TC_VerifyClearButtonClick_88");
		messageListHelper.ClearButton.click();
	}
	
	@Test(priority = 89)
	public void TC_VerifyComposeMessageButtonClick_89() {
		test = extent.createTest("TC_VerifyComposeMessageButtonClick_89");
		messageListHelper.ComposeNewButton.click();
	}
	
	@Test(priority = 90)
	public void TC_CheckCurrentURL_90() {
		test = extent.createTest("TC_CheckCurrentURL_90");
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertTrue(CurrentURL.equals(URL_enum.URL_ADMINComposeMessage.URL), "The URL is not same as expected");
	}
	
	@Test(priority = 91)
	public void TC_ReturnToAdminMessagesList_91() {
		test = extent.createTest("TC_ReturnToAdminMessagesList_91");
		messageListHelper.SideMenuOptionMessages.click();
	}
}
