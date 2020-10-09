package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageListHelper {

	public MessageListHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Messages')]")
	public WebElement SideMenuOptionMessages;
	
	@FindBy(xpath = "//span[contains(text(),'Message List')]")
	public WebElement MessageListHeader;
	
	@FindBy(xpath = "//span[contains(@class,'channel-name-static')]")
	public WebElement ChannelNameHeading;

	@FindBy(xpath = "//span[contains(@class,'chnanel-name-dynamic')]")
	public WebElement DynamicChannelName;
	
	@FindBy(xpath = "//button[contains(text(),'Compose New')])]")
	public WebElement ComposeNewButton;
	
	@FindBy(xpath = "//span[@class='nav-link name-tab active']")
	public WebElement ActiveTab;
	
	@FindBy(xpath = "//span[contains(text(),'Schedule')]")
	public WebElement ScheduleTab;
	
	@FindBy(xpath = "//span[contains(text(),'Drafts')]")
	public WebElement DraftsTab;
	
	@FindBy(xpath = "//span[contains(text(),'Sent')]")
	public WebElement SentTab;
	
	@FindBy(xpath = "//div[contains(@class,'row mobile-screen-view')]//div[1]//div[1]//span[1]//i[1]")
	public WebElement FromCalenderDateIcon;
	
	@FindBy(xpath = "//input[@id='from-date']")
	public WebElement FromDateCalender;
	
	@FindBy(xpath = "//span[@class='to-text']")
	public WebElement ToTextBTW;
	
	@FindBy(xpath = "//input[@id='to-date']")
	public WebElement ToDateCalender;
	
	@FindBy(xpath = "//div[contains(@class,'compose-body')]//div[3]//div[1]//span[1]//i[1]")
	public WebElement ToCalenderDateIcon;
	
	@FindBy(xpath = "//i[@class='fa fa-search icon-color']")
	public WebElement SearchIconMessage;
	
	@FindBy(xpath = "//label[contains(@class,'search-icon-label')]")
	public WebElement SearchButton;
	
	@FindBy(xpath = "//span[contains(text(),'Clear')]")
	public WebElement ClearButtonText;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-danger pointer schedule-btn')]")
	public WebElement ClearButton;
	
	@FindBy(xpath = "//b[contains(text(),'Action')]")
	public WebElement ActionTHText;
	
	@FindBy(xpath = "//th[contains(@class,'action-edit-delete')]")
	public WebElement ActionTH;
	
	@FindBy(xpath = "//b[contains(text(),'Content')]")
	public WebElement ContentTHText;
	
	@FindBy(xpath = "//th[2]")
	public WebElement ContentTH;
	
	@FindBy(xpath = "//th[3]//b[1]")
	public WebElement TargetTHText;
	
	@FindBy(xpath = "//th[3]")
	public WebElement TargetTH;
	
	@FindBy(xpath = "//b[contains(text(),'Number of Target')]")
	public WebElement NumberOfTargetTHText;
	
	@FindBy(xpath = "//th[4]")
	public WebElement NumberOfTargetTH;
	
	@FindBy(xpath = "//b[contains(text(),'Scheduled At')]")
	public WebElement ScheduledAtTHText;
	
	@FindBy(xpath = "//th[5]")
	public WebElement ScheduledAtTH;
	
	@FindBy(xpath = "//div[contains(text(),\"You don't have any messages scheduled right now. T\")]")
	public WebElement DefaultMessageScheduledMessage;
	
	@FindBy(xpath = "//div[contains(text(),\"You don't have any drafts saved right now. To crea\")]")
	public WebElement DefaultMessageDrafts;
	
	@FindBy(xpath = "//div[contains(text(),'No sent messages yet!')]")
	public WebElement DefaultMessageSent;
}
