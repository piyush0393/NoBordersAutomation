package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenuHelper {

	public SideMenuHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='menu-icon-link pointer']//*[local-name()='svg']")
	public WebElement SideMenuIcon;
	
	@FindBy(xpath = "//i[@class='fa fa-user']")
	public WebElement GeneralToggle;
	
	@FindBy(xpath = "//i[@class='fa fa-user-secret']")
	public WebElement AdminToggle;
	
	@FindBy(xpath = "//span[contains(text(),'General')]")
	public WebElement GeneralHeading;
	
	@FindBy(xpath = "//i[@class='__aero']")
	public WebElement GeneralDropdwn;
	
	@FindBy(xpath = "//div[@class='avatar-image pointer ng-failed-lazyloaded ng-lazyloaded']")
	public WebElement UserProfilePic;
	
	@FindBy(xpath = "//div[@class='user__name']")
	public WebElement SideMenuUsername;
	
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	public WebElement sideMenuHomeOption;
	
	@FindBy(xpath = "//li[contains(@class,'nav-chat pointer center-aling-words-icon flex-element')]//img[1]")
	public WebElement sideMenuHomeOptionIcon;
	
	@FindBy(xpath = "//span[contains(@class,'menu-name')][contains(text(),'Chat')]")
	public WebElement sideMenuChatOption;
	
	@FindBy(xpath = "//li[contains(@class,'nav-friends pointer center-aling-words-icon flex-element active')]//img[2]")
	public WebElement sideMenuChatOptionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Timeline')]")
	public WebElement sideMenuTimelineOption;
	
	@FindBy(xpath = "//li[contains(@class,'nav-timeline center-aling-words-icon flex-element pointer')]//img[1]")
	public WebElement sideMenuTimelineOptionIcon;
	
	@FindBy(xpath = "//span[contains(@class,'menu-name')][contains(text(),'Channel')]")
	public WebElement sideMenuChannelOption;
	
	@FindBy(xpath = "//li[contains(@class,'nav-channel flex-element center-aling-words-icon pointer')]//img[1]")
	public WebElement sideMenuChannelOptionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'More')]")
	public WebElement sideMenuMoreOption;
	
	@FindBy(xpath = "//li[contains(@class,'nav-more flex-element center-aling-words-icon pointer')]//img[1]")
	public WebElement sideMenuMoreOptionIcon;
	
	@FindBy(xpath = "//div[contains(@class,'edit-icon-menu narrow-icon context-menu-icon')]//img[contains(@class,'context-menu-icon pointer')]")
	public WebElement CollapsedSideMenuEditOption;


}
