package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralHomeHelper {

	public GeneralHomeHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='searchFilter']")
	public WebElement SearchFilterField;
	
	@FindBy(xpath = "//div[@id='search']//label")
	public WebElement SearchFilterIcon;
	
	@FindBy(xpath = "//button[contains(@class,'_searh-btn context-menu-icon')]//img[contains(@class,'context-menu-icon pointer')]")
	public WebElement AddFriend_GroupChat_Channel;
	
	@FindBy(xpath = "//h5[contains(text(),'Profile')]")
	public WebElement HomeProfileHeading;
	
	@FindBy(xpath = "//div[@id='profile']//i[contains(@class,'fa fa-chevron-down')]")
	public WebElement ProfileDropdownArrow;
	
	@FindBy(xpath = "//div[@id='profile']//i[contains(@class,'fa fa-chevron-up')]")
	public WebElement ProfileDropdownArrowUP;
	
	@FindBy(xpath = "//img[@id='profile-img pointer']")
	public WebElement HomeProfilePic;
	
	@FindBy(xpath = "//p[contains(@class,'pointer profile-username')]")
	public WebElement HomeUsername;
	
	@FindBy(xpath = "//h5[contains(text(),'Channels (0)')]")
	public WebElement HomeChannelsHeading;
	
	@FindBy(xpath = "//div[@id='channel-hide']//i[contains(@class,'fa fa-chevron-down')]")
	public WebElement ChannelDropDownArrow;
	
	@FindBy(xpath = "//div[contains(@class,'channel-tab sidebar-scroll available-items count-message-chat')]//div[3]//div[1]//i[1]")
	public WebElement ChannelDropdownArrowUP;
	
	@FindBy(xpath = "//div[contains(text(),'No channel found')]")
	public WebElement DefaultNoChannelFoundDiv;
	
	@FindBy(xpath = "//h5[contains(text(),'Groups (0)')]")
	public WebElement HomeGroupsHeading;
	
	@FindBy(xpath = "//div[contains(@class,'channel-tab sidebar-scroll available-items count-message-chat')]//div[4]//div[1]//i[1]")
	public WebElement HomeGroupsDropdownArrow;
	
	@FindBy(xpath = "//div[contains(@class,'channel-tab sidebar-scroll available-items count-message-chat')")
	public WebElement HomeGroupsDropdownArrowUP;
	
	@FindBy(xpath = "//div[contains(text(),'No groups found')]")
	public WebElement DefaultNoGroupFoundDiv;
	
	@FindBy(xpath = "//h5[contains(text(),'Friends (0)')]")
	public WebElement HomeFriendsHeading;
	
	@FindBy(xpath = "//div[contains(@class,'profile-head expand-button1 pointer')]//i[contains(@class,'fa fa-chevron-down')]")
	public WebElement HomeFriendsDropdownArrow;
	
	@FindBy(xpath = "//div[contains(@class,'profile-head expand-button1 pointer')]//i[contains(@class,'fa fa-chevron-up')]")
	public WebElement HomeFriendsDropdownArrowUP;
	
	@FindBy(xpath = "//div[contains(text(),'No friend found')]")
	public WebElement DefaultNoFriendFoundDiv;
	
	@FindBy(xpath = "//i[contains(@class,'greet-user-first-logo')]")
	public WebElement DefaultConversationIconNoChat;
	
	@FindBy(xpath = "//div[contains(text(),'Start a new conversation')]")
	public WebElement StartANewConversationHeading;
	
	
}
