package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewGroupHelper {

	public CreateNewGroupHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'Create New Group')]")
	public WebElement CreateNewGroupHeader;
	
	@FindBy(xpath = "//span[@class='group_picture-change']//img")
	public WebElement GroupProfileImage;
	
	@FindBy(xpath = "//i[@class='fa fa-camera pointer profile-camera']")
	public WebElement ChooseGroupProfileImage;
	
	@FindBy(xpath = "//label[contains(text(),'Group name')]")
	public WebElement GroupNameLabel;
	
	@FindBy(xpath = "//input[@class='form-control input-box-shadow ng-pristine ng-invalid ng-touched']")
	public WebElement GroupNameField;
	
	@FindBy(xpath = "//label[contains(text(),'Note')]")
	public WebElement NoteLabel;
	
	@FindBy(xpath = "//span[@class='float-right text-secondary']")
	public WebElement NoteCharacterLiveCount;
	
	@FindBy(xpath = "//div[@id='create-group']//div//ul//form//div//div//div//textarea")
	public WebElement NoteMessageTextArea;
	
	@FindBy(xpath = "//span[@class='search-user-icon']")
	public WebElement SearchUserIcon;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//div[contains(@class,'content chat-content mobilein')]//li[1]//button[1]")
	public WebElement AddFriendButton;
	
	@FindBy(xpath = "//div[@id='create-group']//div//ul//div//span[contains(text(),'Create')]")
	public WebElement CreategroupButton;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement CancelGroupCreateEvent;
	
	
}
