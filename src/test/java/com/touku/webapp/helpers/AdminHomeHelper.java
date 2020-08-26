package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomeHelper {

	public AdminHomeHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	public WebElement SidemenuHomeOption;
	
	@FindBy(xpath = "//p[contains(text(),'Home')]")
	public WebElement HomeHeader;
	
	@FindBy(xpath = "//b[contains(text(),'Welcome to TOUKU')]")
	public WebElement WelcomeToTOUKU_Header;
	
	@FindBy(xpath = "//div[contains(text(),'Click button to know how to use TOUKU.')]")
	public WebElement ClickToukuButtonDesc;
	
	@FindBy(xpath = "//a[contains(text(),'Click here')]")
	public WebElement ClickHereButton;
	
	@FindBy(xpath = "//div[@class='col-6 p-0 background-set hidden-mobile-screen']")
	public WebElement HomeBGImage;
	
	@FindBy(xpath = "//span[contains(text(),'Announcements')]")
	public WebElement AnnouncementsHeader;
	
	@FindBy(xpath = "//th[contains(text(),'Title')]")
	public WebElement TitleTableTDHeader;
	
	@FindBy(xpath = "//th[contains(text(),'Date')]")
	public WebElement DateTableTDHeader;
	
	@FindBy(xpath = "//td[contains(text(),'[notice] New Version Released v1.8.5")
	public WebElement TitleTR1;
	
	@FindBy(xpath = "//td[@class='date-width']")
	public WebElement DateTR1;
	
	@FindBy(xpath = "//span[contains(text(),'Insight summary')]")
	public WebElement InsightSummaryHeading;
	
	@FindBy(xpath = "//span[@class='date-text ml-3']")
	public WebElement InsightSummaryDate;
	
	@FindBy(xpath = "//div[contains(text(),'Target Reach')]")
	public WebElement TargetReachCardHeading;
	
	@FindBy(xpath = "//span[@class='value-text'][contains(text(),'0')]")
	public WebElement TargetReachAudienceNumber;
	
	@FindBy(xpath = "//div[@class='col-lg-4 col-md-12 col-sm-12 pl-0 padding-0 margin-b-15']//span[@class='text-info ml-2'][contains(text(),'0%')]")
	public WebElement TargetReachAudiencePercent;
	
	@FindBy(xpath = "//div[@class='col-lg-4 col-md-12 col-sm-12 pl-0 padding-0 margin-b-15']//div[@class='text-muted'][contains(text(),'Compared to 7 days ago')]")
	public WebElement TargetReachLastComparedDays;
	
	@FindBy(xpath = "//div[contains(text(),'Total messages')]")
	public WebElement TotalMessagesHeading;
	
	@FindBy(xpath = "//div[contains(text(),'1:1 Chats')]")
	public WebElement One_OneChatsHeading;
	
	@FindBy(xpath = "//div[@class='insight-block']//div//div[@class='insight-text-block ng-star-inserted']//span[@class='value-text'][contains(text(),'1')]")
	public WebElement TotalMessagesCount;
	
	@FindBy(xpath = "//div[@class='insight-block']//div//div[@class='insight-text-block ng-star-inserted']//span[@class='text-info ml-2'][contains(text(),'100%')]")
	public WebElement TotalMessagesPercent;
	
	@FindBy(xpath = "//div[@class='insight-block']//div//div[@class='insight-text-block ng-star-inserted']//div[@class='text-muted'][contains(text(),'Compared to 7 days ago')]")
	public WebElement TotalMsgsLastComparedDays;
	
	@FindBy(xpath = "//div[@class='col-lg-4 col-md-12 col-sm-12 pr-0 padding-0']//span[@class='value-text'][contains(text(),'1')]")
	public WebElement One_OneChatCountNumber;
	
	@FindBy(xpath = "//div[@class='col-lg-4 col-md-12 col-sm-12 pr-0 padding-0']//span[@class='text-info ml-2'][contains(text(),'100%')]")
	public WebElement One_OneChatPercent;
	
	@FindBy(xpath = "//div[@class='col-lg-4 col-md-12 col-sm-12 pr-0 padding-0']//div[@class='text-muted'][contains(text(),'Compared to 7 days ago')]")
	public WebElement One_OneChatLastComparedDays;
	
	@FindBy(xpath = "//canvas[@id='messageChart']")
	public WebElement TotalMessagesChart;
	
	@FindBy(xpath = "//canvas[@id='chatChart']")
	public WebElement One_OneChatChart;
	
	@FindBy(xpath = "//canvas[@id='targetChart']")
	public WebElement TargetReachChart;
	
	@FindBy(xpath = "//span[contains(text(),'Scheduled messages')]")
	public WebElement ScheduledMessages;
	
	@FindBy(xpath = "//b[contains(text(),'Content')]")
	public WebElement ContentTD1;
	
	@FindBy(xpath = "//b[contains(text(),'Target')]")
	public WebElement TargetTD2;
	
	@FindBy(xpath = "//b[contains(text(),'Number of Target')]")
	public WebElement NumberOfTargetTD3;
	
	@FindBy(xpath = "//b[contains(text(),'Advanced')]")
	public WebElement AdvancedTD4;
	
	@FindBy(xpath = "//b[contains(text(),'Scheduled At')]")
	public WebElement ScheduledAtTD5;
	
	@FindBy(xpath = "//div[contains(text(),'Use bulk messages to send event and promotional in')]")
	public WebElement BulkMessagesDefaultMsg;
	
	@FindBy(xpath = "//button[contains(text(),'Create new message')]")
	public WebElement CreateNewMessageButton;
	
	@FindBy(xpath = "//div[contains(text(),'Send a new message to see statistics here.')]")
	public WebElement DefaultTextTotalMessages;
	
	@FindBy(xpath = "//button[contains(text(),'Send a message')]")
	public WebElement DefaultButtonTotalMessages;
	
	@FindBy(xpath = "//div[contains(text(),'Start a new chat to see statistics here.')]")
	public WebElement DefaultTextOneOneChat;
	
	@FindBy(xpath = "//button[contains(text(),'Start a chat')]")
	public WebElement DefaultButtonOneOneChat;
	
}
