package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingHelper {

	public GeneralSettingHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='sidepanel']//div//div//span[contains(text(),'Add Friend')]")
	public WebElement AddFriendLink;
	
	@FindBy(xpath = "//div[@class='searchFriend allChildTab pointer']//img[@class='searchFriend-icon']")
	public WebElement AddFriendIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Create New Group')]")
	public WebElement CreateNewGroupLink;
	
	@FindBy(xpath = "//div[@class='createGroup allChildTab pointer']//img[@class='searchFriend-icon']")
	public WebElement CreateNewGroupIcon;
	
	@FindBy(xpath = "//span[@class='span-padding-left-7'][contains(text(),'Create New Channel')]")
	public WebElement CreateNewChannelLink;
	
	@FindBy(xpath = "//div[@class='channel allChildTab lastBorder pointer chat-panel']//img[@class='searchFriend-icon']")
	public WebElement CreateNewChannelIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	public WebElement ProfileLink;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-user icon-padding')]")
	public WebElement ProfileIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Invitation URL')]")
	public WebElement InvitationURL_link;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-id-card icon-padding')]")
	public WebElement InvitationURL_icon;
	
	@FindBy(xpath = "//span[contains(@class,'referral-code-value')]")
	public WebElement InvitationCode;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-clone ref-link-icon')]")
	public WebElement InvitationCodeCopy;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-download down-qrCode-icon')]")
	public WebElement InvitationCodeDownload;
	
	@FindBy(xpath = "//span[contains(@class,'div-version')]")
	public WebElement GoToXANAWallet;
	
	@FindBy(xpath = "//img[contains(@class,'icon-padding xana-logo')]")
	public WebElement GoToXANAWalletIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Send Method')]")
	public WebElement SendMethodLink;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-paper-plane icon-padding lang-icon')]")
	public WebElement SendMethodICON;
	
	@FindBy(xpath = "//button[contains(@class,'btn lang-btn dropdown-toggle')][contains(text(),'Enter')]")
	public WebElement SendMethodDropDownSelectedOption;
	
	@FindBy(xpath = "//div[contains(@class,'lang-menu dropdown-menu show')]")
	public WebElement SendMethodDropdownOpen;
	
	@FindBy(xpath = "//button[contains(text(),'Ctrl + Enter')]")
	public WebElement SendMethodDropdownOption2;
	
	@FindBy(xpath = "//div[@id='sidepanel']//div//div//div//div//div//button[contains(text(),'Enter')]")
	public WebElement SendMethodDropdownOption1;
	
	@FindBy(xpath = "//span[contains(text(),'Language')]")
	public WebElement LanguageLink;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-language icon-padding lang-icon')]")
	public WebElement LanguageIcon;
	
	@FindBy(xpath = "//button[contains(text(),'English')]")
	public WebElement LanguageSelectedOption;
	
	@FindBy(xpath = "//div[contains(@class,'lang-menu dropdown-menu show')]//button[1]")
	public WebElement LanguageOption1;
	
	@FindBy(xpath = "//div[@id='sidepanel']//button[2]")
	public WebElement LangauageOption2;
	
	@FindBy(xpath = "//div[@id='sidepanel']//button[3]")
	public WebElement LanguageOption3;
	
	@FindBy(xpath = "//div[@id='sidepanel']//button[4]")
	public WebElement LanguageOption4;
	
	@FindBy(xpath = "//span[contains(text(),'Make App')]")
	public WebElement MakeAppLink;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-plus-circle icon-padding lang-icon pl-1')]")
	public WebElement MakeAppIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Customer Support')]")
	public WebElement CustomerSupportLink;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-comments icon-padding lang-icon pl-1')]")
	public WebElement CustomerSupportIcon;
	
	@FindBy(xpath = "//span[contains(@class,'version-number')][contains(text(),'Chat')]")
	public WebElement CustomerSupportChatLink;
	
	@FindBy(xpath = "//span[contains(text(),'FAQ')]")
	public WebElement FAQLink;
	
	@FindBy(xpath = "//span[contains(text(),'Open')]")
	public WebElement FAQOpenLink;
	
	@FindBy(xpath = "//span[contains(text(),'Reload & Update')]")
	public WebElement Reload_and_UpdateLink;
	
	@FindBy(xpath = "//span[contains(text(),'Version')]")
	public WebElement ToukuAppVersionLink;
	
	@FindBy(xpath = "//i[@class='fa fa-code-branch icon-padding lang-icon pl-1']")
	public WebElement ToukuAppVersionIcon;
	
	@FindBy(xpath = "//span[contains(text(),'2.3.2')]")
	public WebElement ToukuAppVersionNumber;
	
	@FindBy(xpath = "//i[@class='fa fa-recycle icon-padding lang-icon pl-1']")
	public WebElement Releoad_and_UpdateIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	public WebElement LogoutLink;
	
	@FindBy(xpath = "//i[@class='fa fa-sign-out-alt icon-padding lang-icon pl-1']")
	public WebElement LogoutIcon;
	
	
	
	
}
