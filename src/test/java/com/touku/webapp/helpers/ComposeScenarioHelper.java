package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeScenarioHelper {

	public ComposeScenarioHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Compose Scenario')]")
	public WebElement ComposeScenarioPageHeading;
	
	@FindBy(xpath = "//span[contains(@class,'channel-name-static')]")
	public WebElement ChannelNameHeading;
	
	@FindBy(xpath = "//span[contains(@class,'chnanel-name-dynamic')]")
	public WebElement ChannelNameDynamic;
	
	@FindBy(xpath = "//span[contains(@class,'compose-text text-in-scenario')]")
	public WebElement CreateScheduleMessage;
	
	@FindBy(xpath = "//span[contains(text(),'Destination')]")
	public WebElement DestinationTH;
	
	@FindBy(xpath = "//input[contains(@name,'allFollowers')]")
	public WebElement FollowersRadioBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Followers')]")
	public WebElement FollowersOption;
	
	@FindBy(xpath = "//input[contains(@name,'onlyAdminWhoFollows')]")
	public WebElement OnlyAdminWhoFollowsRadioBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Only admin who follows')]")
	public WebElement OnlyAdminWhoFollowsOption;
	
	@FindBy(xpath = "//span[contains(text(),'When')]")
	public WebElement WhenTH;
	
	@FindBy(xpath = "//button[contains(@class,'btn day-following-dropdown dropdown-toggle')]")
	public WebElement WhenUserStartsFollowing;
	
	@FindBy(xpath = "//button[contains(text(),'When user start following')]")
	public WebElement WhenUserStartsFollowingText;
	
	
	/*Options for Following*/

	@FindBy(xpath = "//button[contains(text(),'Day 1 after following')]")
	public WebElement Day1Following;
	@FindBy(xpath = "//button[contains(text(),'Day 2 after following')]")
	public WebElement Day2Following;
	@FindBy(xpath = "//button[contains(text(),'Day 3 after following')]")
	public WebElement Day3Following;
	@FindBy(xpath = "//button[contains(text(),'Day 4 after following')]")
	public WebElement Day4Following;
	@FindBy(xpath = "//button[contains(text(),'Day 5 after following')]")
	public WebElement Day5Following;
	@FindBy(xpath = "//button[contains(text(),'Day 6 after following')]")
	public WebElement Day6Following;
	@FindBy(xpath = "//button[contains(text(),'Day 7 after following')]")
	public WebElement Day7Following;
	@FindBy(xpath = "//button[contains(text(),'Day 8 after following')]")
	public WebElement Day8Following;
	@FindBy(xpath = "//button[contains(text(),'Day 9 after following')]")
	public WebElement Day9Following;
	@FindBy(xpath = "//button[contains(text(),'Day 10 after following')]")
	public WebElement Day10Following;
	@FindBy(xpath = "//button[contains(text(),'Day 11after following')]")
	public WebElement Day11Following;
	@FindBy(xpath = "//button[contains(text(),'Day 12 after following')]")
	public WebElement Day12Following;
	@FindBy(xpath = "//button[contains(text(),'Day 13 after following')]")
	public WebElement Day13Following;
	@FindBy(xpath = "//button[contains(text(),'Day 14 after following')]")
	public WebElement Day14Following;
	@FindBy(xpath = "//button[contains(text(),'Day 15 after following')]")
	public WebElement Day15Following;
	@FindBy(xpath = "//button[contains(text(),'Day 16 after following')]")
	public WebElement Day16Following;
	@FindBy(xpath = "//button[contains(text(),'Day 17 after following')]")
	public WebElement Day17Following;
	@FindBy(xpath = "//button[contains(text(),'Day 18 after following')]")
	public WebElement Day18Following;
	@FindBy(xpath = "//button[contains(text(),'Day 19 after following')]")
	public WebElement Day19Following;
	@FindBy(xpath = "//button[contains(text(),'Day 20 after following')]")
	public WebElement Day20Following;
	@FindBy(xpath = "//button[contains(text(),'Day 21 after following')]")
	public WebElement Day21Following;
	@FindBy(xpath = "//button[contains(text(),'Day 22 after following')]")
	public WebElement Day22Following;
	@FindBy(xpath = "//button[contains(text(),'Day 23 after following')]")
	public WebElement Day23Following;
	@FindBy(xpath = "//button[contains(text(),'Day 24 after following')]")
	public WebElement Day24Following;
	@FindBy(xpath = "//button[contains(text(),'Day 25 after following')]")
	public WebElement Day25Following;
	@FindBy(xpath = "//button[contains(text(),'Day 26 after following')]")
	public WebElement Day26Following;
	@FindBy(xpath = "//button[contains(text(),'Day 27 after following')]")
	public WebElement Day27Following;
	@FindBy(xpath = "//button[contains(text(),'Day 28 after following')]")
	public WebElement Day28Following;
	@FindBy(xpath = "//button[contains(text(),'Day 29 after following')]")
	public WebElement Day29Following;
	@FindBy(xpath = "//button[contains(text(),'Day 30 after following')]")
	public WebElement Day30Following;
	
	/*Options Finished*/
	
	@FindBy(xpath = "//span[contains(text(),'@')]")
	public WebElement AtTheRateIcon;
	
	@FindBy(xpath = "//owl-date-time-timer-box[1]//label[1]//input[1]")
	public WebElement EnterHourBox;
	
	@FindBy(xpath = "//owl-date-time-timer-box[2]//label[1]//input[1]")
	public WebElement EnterMinuteBox;
	
	@FindBy(xpath = "//div[contains(@class,'cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing')]")
	public WebElement TimeBoxHourMinute;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement CancelTimeButton;
	
	@FindBy(xpath = "//owl-date-time-container[@id='owl-dt-picker-1']//span[contains(text(),'Set')]")
	public WebElement SetTimeButton;
	
	
	
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
	
	@FindBy(xpath = "//label[contains(text(),'Photo')]")
	public WebElement PhotoLabel;
	
	@FindBy(xpath = "//label[contains(text(),'Photo (1)')]")
	public WebElement PhotoLabelOnePhotoAdded;
	
	@FindBy(xpath = "//div[@class='photo-section image-left-div cdk-drag']//i[@class='fa fa-times-circle']")
	public WebElement PhotoSectionRemoveButton;
	
	@FindBy(xpath = "//button[@class='upload-button pointer']//span[contains(text(),'Upload')]")
	public WebElement PhotoUploadButtonText;
	
	@FindBy(xpath = "//button[@class='upload-button pointer']")
	public WebElement PhotoUploadButton;
	
	@FindBy(xpath = "//i[@class='fa fa-times-circle close']")
	public WebElement SelectedPhotoCrossIcon;
	
	@FindBy(xpath = "//a[contains(text(),'Add Link')]")
	public WebElement AddLinkToPhoto;
	
	@FindBy(xpath = "//img[@class='profile']")
	public WebElement AddedPhoto;
	
	@FindBy(xpath = "//nb-card[@class='addLink-modal']")
	public WebElement AddLinkModalBox;
	
	@FindBy(xpath = "//nb-card-header[@class='link-header']")
	public WebElement AddLinkModalHeader;
	
	@FindBy(xpath = "//i[@class='fa fa-times nb-icon-left']")
	public WebElement AddLinkModalCrossButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter URL']")
	public WebElement AddLinkModalEnterURL;
	
	@FindBy(xpath = "//button[@class='btn btn-success pointer']")
	public WebElement AddLinkModalSubmitButton;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement AddLinkModalSubmitText;
	
	@FindBy(xpath = "//label[contains(text(),'Audio')]")
	public WebElement AudioLabel;
	
	@FindBy(xpath = "//label[contains(text(),'Audio (1)')]")
	public WebElement AudioLabelOneAudioAdded;
	
	@FindBy(xpath = "//div[@class='compose-body']//div[3]//div[1]//div[1]//div[1]//label[2]//i[1]")
	public WebElement AudioSectionRemoveButton;
	
	@FindBy(xpath = "//div[contains(@class,'compose-body')]//div[3]//div[2]//button[1]//span[1]")
	public WebElement AudioUploadButtonText;
	
	@FindBy(xpath = "//div[contains(@class,'compose-body')]//div[3]//div[2]//button[1]")
	public WebElement AudioUploadButton;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-spinner fa-spin text-black')]")
	public WebElement WaitRotatingLoaderButton;
	
	@FindBy(xpath = "//audio[contains(@class,'sent-body')]")
	public WebElement AudioPauseButtton;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-times-circle close')]")
	public WebElement AudioSelectedCrossButton;
	
	@FindBy(xpath = "//label[contains(text(),'Video')]")
	public WebElement VideoLabel;
	
	@FindBy(xpath = "//div[@id='cdk-drop-list-3']//div[4]//div[1]//div[1]//div[1]//label[2]//i[1]")
	public WebElement VideoSectionRemoveButton;
	
	@FindBy(xpath = "//div[@id='cdk-drop-list-3']//div[4]//div[2]//button[1]")
	public WebElement VideoUploadButton;
	
	@FindBy(xpath = "//i[contains(@class,'aero-icon down-up')]")
	public WebElement PreviewOpenUpButton;
}
