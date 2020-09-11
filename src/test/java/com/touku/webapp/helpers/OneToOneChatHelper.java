package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneToOneChatHelper {

	public OneToOneChatHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='searchFilter']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "//h5[contains(text(),'Replies (1)')]")
	public WebElement RepliesHeadingandCount;
	
	@FindBy(xpath = "//div[@id='thread']//ul//li//div//div//div//div[contains(text(),'Pytest')]")
	public WebElement ChatFriendName;
	
	@FindBy(xpath = "//p[contains(text(),'hmm')]")
	public WebElement ChatFriendLatestReply;
	
	@FindBy(xpath = "//div[@id='thread']//ul//li//div//div//div//div[contains(text(),'08')]")
	public WebElement ChatFriendLatestReplyMMDD;
	
	@FindBy(xpath = "//img[contains(@class,'ng-lazyloaded')]")
	public WebElement ChatFriendNameProfilePic;
	
	@FindBy(xpath = "//li[contains(@class,'contact-groupsamelist contact replies-list replies-list-active')]//div[contains(@class,'wrap chat-panel open-chat')]//div//span[contains(@class,'contact-status online')]")
	public WebElement ChatFriendNameOnlineStatus;
	
	@FindBy(xpath = "//div[@class='follow-up-resolve-label color-green']")
	public WebElement ChatFriendReplyDoneStatus;
	
	@FindBy(xpath = "//i[contains(@class,'greet-user-first-logo')]")
	public WebElement DefaultConversationLogo;
	
	@FindBy(xpath = "//div[contains(text(),'Start a new conversation')]")
	public WebElement DefaultConversationMessage;
	
	
	//ChatFriend-ChatScreenElements
	
	@FindBy(xpath = "//div[contains(@class,'pr-0')]//img[contains(@class,'ng-lazyloaded')]")
	public WebElement ChatFriendProfilePic;
	
	@FindBy(xpath = "//p[contains(@class,'header-name')]")
	public WebElement ChatFriendHeaderName;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-ellipsis-v pointer context-menu-icon center-dot-thread')]")
	public WebElement RightSideThreeButtonMenu;
	
	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	public WebElement RemoveOption;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-user-times action-icon')]")
	public WebElement RemoveOptionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Pin this chat')]")
	public WebElement PinThisChatOption;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-thumbtack action-icon pin-chat')]")
	public WebElement PinThisChatOptionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Manage Notes')]")
	public WebElement ManageNotesOption;
	
	@FindBy(xpath = "//div[contains(@class,'content chat-content mobilein')]//li[3]//img[1]")
	public WebElement ManageNotesOptionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Manage Tags')]")
	public WebElement ManageTagsOption;
	
	@FindBy(xpath = "//div[contains(@class,'content chat-content mobilein')]//li[4]//img[1]")
	public WebElement ManageTagsOptionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Change Display Name')]")
	public WebElement ChangeDisplayNameOption;
	
	@FindBy(xpath = "//div[contains(@class,'content chat-content mobilein')]//li[5]//img[1]")
	public WebElement ChangeDisplayNameOptionIcon;
	
	@FindBy(xpath = "//div[contains(@class,'chat-date-label')][contains(text(),'07')]")
	public WebElement ChatScreenDateOfChatDone;
	
	@FindBy(xpath = "//div[contains(text(),'Today')]")
	public WebElement ChatScreenTodayChat;

	@FindBy(xpath = "//div[@id='sub_chat_183919']//span[contains(@class,'senderNameInSentLi')][contains(text(),'pypy3651')]")
	public WebElement ChatScreenMsgSenderName;
	
	@FindBy(xpath = "//div[@id='sub_chat_183919']//span[contains(@class,'receiver-time')]")
	public WebElement MessageSentTimeFromSender;
	
	@FindBy(xpath = "//span[contains(@class,'right-msg')]")
	public WebElement MessageReadStatus;
	
	@FindBy(xpath = "//span[contains(@class,'receiver-time after-translate-position')]")
	public WebElement MessageRecievedTimeFromSender;
	
	@FindBy(xpath = "//label[contains(@class,'translated-message-spna')]")
	public WebElement TranslatedMessageIndication;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-times-circle back-icon delete-translate-message')]")
	public WebElement TranslateCrossButton;
	
	@FindBy(xpath = "//img[contains(@class,'desktop-camra')]")
	public WebElement CameraButton;
	
	@FindBy(xpath = "//p[contains(@class,'float-right p-2 text-secondary')]")
	public WebElement MessageCharacterCount;
	
	@FindBy(xpath = "//textarea[@id='single-txt']")
	public WebElement MessageTextArea;
	
	@FindBy(xpath = "//span[contains(text(),'Need review')]")
	public WebElement NeedReviewOption;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-comments header-btn-text')]")
	public WebElement NeedReviewOptionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Done')]")
	public WebElement DoneOption;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-check-circle header-btn-text')]")
	public WebElement DoneOptionIcon;
	
	
	//SendMessageOptions
	//Unsend Modal
	@FindBy(xpath = "//div[contains(@class,'swal2-icon swal2-warning swal2-animate-warning-icon')]")
	public WebElement UnsendModalIcon;
	
	@FindBy(xpath = "//h2[@id='swal2-title']")
	public WebElement UnsendHeaderText;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement UnsendContent;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement UnsendModalCancelButton;
	
	@FindBy(xpath = "//button[contains(text(),'Sure')]")
	public WebElement UnsendModalSureButton;
	
	//Delete Modal
	@FindBy(xpath = "//div[@class='swal2-icon swal2-warning swal2-animate-warning-icon']")
	public WebElement DeleteModalIcon;
	
	@FindBy(xpath = "//h2[@id='swal2-title']")
	public WebElement DeleteModalHeaderText;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement DeleteModalContent;
	
	@FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
	public WebElement DeleteModalCancelButton;
	
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	public WebElement DeleteModalSureButton;
	
	
	
	
	
}
