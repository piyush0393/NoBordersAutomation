package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFriendHelper {

	public AddFriendHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'Add Friend')]")
	public WebElement AddFriendTitle;
	
	@FindBy(xpath = "//img[@id='add-friend-back']")
	public WebElement AddFriendBackButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//div[@id='search-friends']//label//i")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "//div[contains(text(),'No friends found.')]")
	public WebElement DefaultNoFriendsFoundText;
	
	
}
