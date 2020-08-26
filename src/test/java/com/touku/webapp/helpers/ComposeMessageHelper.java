package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeMessageHelper {

	public ComposeMessageHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Compose Message')]")
	public WebElement ComposeMessagePageHeading;
	
	@FindBy(xpath = "//span[contains(text(),'Channel name:')]")
	public WebElement ChannelNameLabel;
	
	@FindBy(xpath = "//span[@class='chnanel-name-dynamic']")
	public WebElement ActualChannelName;
	
	@FindBy(xpath = "//span[@class='compose-text text-in-scenario']")
	public WebElement CreateNScheduleMessageLabel;
	
	@FindBy(xpath = "//span[contains(text(),'Destination')]")
	public WebElement DestinationTD1;
	
	@FindBy(xpath = "//span[contains(text(),'Date and time')]")
	public WebElement DateNTimeTD2;
	
	@FindBy(xpath = "//span[contains(text(),'Timeline')]")
	public WebElement TimeLineTD3;
	
	@FindBy(xpath = "//input[@name='allFollowers']")
	public WebElement AllFollowersRadioButton;
	
	@FindBy(xpath = "//span[contains(text(),'Followers')]")
	public WebElement FollowersOption;
	
	@FindBy(xpath = "//input[@name='onlyAdminWhoFollows']")
	public WebElement OnlyAdminWhoFollowsRadioButton;
	
	@FindBy(xpath = "//span[contains(text(),'Only admin who follows')]")
	public WebElement OnlyAdminWhoFollowsOption;
	
	@FindBy(xpath = "//div[contains(@class,'col-lg-10 col-md-12 col-12 p-0 radiobtn1')]//nb-radio[1]//label[1]//input[1]")
	public WebElement SendNowRadioButton;
	
	@FindBy(xpath = "//span[contains(text(),'Send now')]")
	public WebElement SendNowOption;
	
	@FindBy(xpath = "//nb-radio[2]//label[1]//input[1]")
	public WebElement SendLaterRadioButton;
	
	@FindBy(xpath = "//span[contains(text(),'Send later')]")
	public WebElement SendLaterOption;
	
	@FindBy(xpath = "//span[contains(@class,'checkmark')]")
	public WebElement AllowPostToTimelineCheckBox;
	
	@FindBy(xpath = "//div[contains(@class,'checkmark-label')]")
	public WebElement AllowPostToTimelineOption;
	
	@FindBy(xpath = "//label[@class='greet-label text-character-count']")
	public WebElement TextBoxCharacterCount;
	
	@FindBy(xpath = "//label[@class='greet-label']")
	public WebElement TextAreaLabel;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter message']")
	public WebElement EnterMessageTextArea;
	
	@FindBy(xpath = "//span[contains(text(),'Preview')]")
	public WebElement ChatHeader;
	
	@FindBy(xpath = "//i[@class='aero-icon']")
	public WebElement HideChatBelow;
	
	@FindBy(xpath = "//p[@class='send-body']")
	public WebElement TypedMessageInPreview;
	
	@FindBy(xpath = "//span[contains(text(),'Text')]")
	public WebElement TextButtonContent;
	
	@FindBy(xpath = "//div[contains(@class,'content chat-content chat-content-border')]//span[1]//i[1]")
	public WebElement TextPlusIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Photo')]")
	public WebElement PhotoButtonContent;
	
	@FindBy(xpath = "//span[2]//i[1]")
	public WebElement PhotoPlusIcon;
	
	@FindBy(xpath = "//span[3]//i[1]")
	public WebElement AudioPlusIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Audio')]")
	public WebElement AudioButtonContent;
	
	@FindBy(xpath = "//span[contains(text(),'Video')]")
	public WebElement VideoButtonContent;
	
	@FindBy(xpath = "//span[4]//i[1]")
	public WebElement VideoPlusIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Save Draft')]")
	public WebElement SaveDraftButtonContent;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-success pointer schedule-btn')]")
	public WebElement SaveDraftButton;
	
	@FindBy(xpath = "//span[contains(text(),'Send Test')]")
	public WebElement SendTestButtonContent;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-danger pointer schedule-btn button-send-test')]")
	public WebElement SendTestButton;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-success pointer send-block schedule-btn')]")
	public WebElement SendButton;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-success pointer send-block schedule-btn')]//span[contains(text(),'Send')]")
	public WebElement SendButtonContent;
	
	@FindBy(xpath = "//label[contains(text(),'Photo')]")
	public WebElement PhotoLabel;
	
	@FindBy(xpath = "//div[@class='photo-section image-left-div cdk-drag']//i[@class='fa fa-times-circle']")
	public WebElement PhotoSectionRemoveButton;
	
	//@FindBy(xpath = "")
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
