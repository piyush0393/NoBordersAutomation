package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerSupportHelper {

	public CustomerSupportHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='version-number'][contains(text(),'Chat')]")
	public WebElement SupportChatLink;
	
	@FindBy(xpath = "//span[contains(text(),'Questions? Chat with us!')]")
	public WebElement SupportChatHeading;
	
	@FindBy(xpath = "//span[contains(text(),'Typically replies under 3 hours')]")
	public WebElement DefaultActiveStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Support is online')]")
	public WebElement OnlineActiveStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Was last active an hour ago')]")
	public WebElement LastActiveStatus;
	
	@FindBy(xpath = "//span[@class='crisp-123ltdb crisp-1mh9nm6']")
	public WebElement ToukuProfilePic;
	
	@FindBy(xpath = "//span[contains(@class,'crisp-124j424 crisp-9dgo7z')][contains(text(),'Touku')]")
	public WebElement ToukuProfileLabel;
	
	@FindBy(xpath = "//span[contains(@class,'crisp-1vzg1qq')]")
	public WebElement SupportCloseButton;
	
	@FindBy(xpath = "//span[contains(@class,'crisp-djkbfv crisp-1mh9nm6')]")
	public WebElement SupportProfilePic;
	
	@FindBy(xpath = "//span[contains(@class,'crisp-1q4fhvx crisp-124j424 crisp-9dgo7z')]")
	public WebElement SupportProfileLabel;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,'Compose your message...')]")
	public WebElement SupportMessageArea;
	
	@FindBy(xpath = "//span[contains(@class,'crisp-wt1dr1 crisp-15xwsav crisp-k6ym6q')]")
	public WebElement EmojiSupportMessageArea;
	
	@FindBy(xpath = "//input[contains(@name,'attach_file')]")
	public WebElement SupportAttachFile;
	
	@FindBy(xpath = "//span[contains(text(),'Offline. Please reload the page.')]")
	public WebElement OfflineSupportStatus;
	
	@FindBy(xpath = "//span[contains(text(),'No messages can be received or sent for now.')]")
	public WebElement OfflineSupportStatusMessage;
	
	@FindBy(xpath = "//body/div/div[@id='crisp-chatbox']/div/div/div/div/div[1]/div[1]/span[1]")
	public WebElement RedAlertExclamation;
	
	
	
	
}
