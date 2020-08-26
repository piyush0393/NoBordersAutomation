package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralChatHelper {

	public GeneralChatHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-search')]")
	public WebElement ChatSearchIcon;
	
	@FindBy(xpath = "//input[@id='searchFilter']")
	public WebElement ChatSearchField;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-sort sort-icon')]")
	public WebElement ChatSortByButton;
	
	@FindBy(xpath = "//li[contains(text(),'Time received')]")
	public WebElement ChatSortByTimeRecieved;
	
	@FindBy(xpath = "//li[contains(text(),'Unread messages')]")
	public WebElement ChatSortByUnreadMessages;
	
	@FindBy(xpath = "//li[contains(text(),'Name')]")
	public WebElement ChatSortByName;
	
	@FindBy(xpath = "//li[@class='active-sort']")
	public WebElement ChatActiveSort;
	
	@FindBy(xpath = "//button[@class='_searh-btn context-menu-icon']//img[@class='context-menu-icon pointer']")
	public WebElement AddFriend_GroupChat_Channel;
	
	@FindBy(xpath = "//ul[@id='panel-context-menu']//span[contains(@class,'item-text')][contains(text(),'Create Group Chat')]")
	public WebElement CreateGroupChatOption;
	
	@FindBy(xpath = "//div[@id='sidepanel']//li[1]//span[1]//*[local-name()='svg']")
	public WebElement CreatGroupChatIcon;
	
	@FindBy(xpath = "//ul[@id='panel-context-menu']//span[contains(@class,'item-text')][contains(text(),'Create New Channel')]")
	public WebElement CreateNewChannelOption;
	
	@FindBy(xpath = "//div[@id='sidepanel']//li[2]//span[1]//*[local-name()='svg']")
	public WebElement CreateNewChannelIcon;
	
	@FindBy(xpath = "//span[contains(@class,'item-text')][contains(text(),'Add Friend')]")
	public WebElement AddFriendOption;
	
	@FindBy(xpath = "//div[@id='sidepanel']//li[3]//span[1]//*[local-name()='svg']")
	public WebElement AddFriendIcon;

	@FindBy(xpath = "//div[contains(@class,'channel-tab sidebar-scroll available-items count-message-chat')]//div[6]//ul[1]//div[1]")
	public WebElement DefaultNoFriendFoundText;
}
