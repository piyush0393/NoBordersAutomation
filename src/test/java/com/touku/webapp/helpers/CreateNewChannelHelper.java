package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewChannelHelper {

	public CreateNewChannelHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'Create New Channel')]")
	public WebElement CreateNewChannelHeader;
	
	@FindBy(xpath = "//img[contains(@class,'pointer context-menu-icon __banner-update')]")
	public WebElement EditChannelBGImage;
	
	@FindBy(xpath = "//div[@class='bg-channel']")
	public WebElement ChannelBGImage;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Channel Name')]")
	public WebElement ChannelNameEditField;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Status')]")
	public WebElement StatusEditField;
	
	@FindBy(xpath = "//div[contains(@class,'bg-channel-content')]//img[1]")
	public WebElement ChannelProfileImage;
	
	@FindBy(xpath = "//img[contains(@class,'pointer profile-camera')]")
	public WebElement EditChannelProfileImage;
	
	@FindBy(xpath = "//span[contains(text(),'About')]")
	public WebElement ChannelAboutTab;
	
	@FindBy(xpath = "//div[contains(@class,'channel-details-tab')]")
	public WebElement SelectedChannelTab;
	
	@FindBy(xpath = "//span[contains(text(),'Manage')]")
	public WebElement ChannelManageTab;
	
	@FindBy(xpath = "//div[contains(text(),'About')]")
	public WebElement AboutHeader;
	
	@FindBy(xpath = "//span[contains(@class,'float-right p-2 text-secondary')]")
	public WebElement AboutCharacterCount;
	
	@FindBy(xpath = "//div[@id='about-section']//textarea")
	public WebElement AboutSectionTextArea;
	
	@FindBy(xpath = "//span[contains(text(),'Show new follower past posts')]")
	public WebElement ShowNewFollowersPosts_buttonLabel;
	
	@FindBy(xpath = "//div[contains(@class,'messages')]//div[2]//span[1]//label[1]//input[1]")
	public WebElement ShowNewFollowersPosts_Togglebutton;
	
	@FindBy(xpath = "//span[contains(text(),'VIP')]")
	public WebElement VIPFeature_buttonLabel;
	
	@FindBy(xpath = "//div[contains(@class,'row')]//div[3]//span[1]//label[1]//input[1]")
	public WebElement VIPFeature_Togglebutton;
	
	@FindBy(xpath = "//div[contains(@class,'label-title vip-sect col-12 d-flex justify-content-between')]//span[contains(@class,'float-right p-2 text-secondary')][contains(text(),'0')]")
	public WebElement VIPFeatureCharacterCount;
	
	@FindBy(xpath = "//div[contains(@class,'col-12')]//textarea[contains(@class,'text-area-size form-control input-box-shadow ng-pristine ng-valid ng-touched')]")
	public WebElement VIPFeatureTextArea;
	
	@FindBy(xpath = "//div[contains(@class,'body2-text')]")
	public WebElement VIP_MonthLabel;
	
	@FindBy(xpath = "//input[contains(@class,'form-control vip-input ng-valid ng-dirty ng-touched')]")
	public WebElement TP_Value;
	
	@FindBy(xpath = "//span[contains(@class,'vip-unit')]")
	public WebElement VIP_Unit_TP;
	
	@FindBy(xpath = "//div[@id='create-channel']//div//ul//div//span[contains(text(),'Create')]")
	public WebElement CreateChannelButton;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement CancelCreateChannelButton;
}
