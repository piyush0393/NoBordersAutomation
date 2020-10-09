package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScenarioListHelper {

	public ScenarioListHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/ngx-dashboard[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/div[1]/div[1]/div[2]/ngx-sidebar[1]/div[1]/ul[1]/li[1]/div[4]/ul[1]/li[3]/div[1]/span[2]")
	public WebElement SideMenuOptionScenario;
	
	@FindBy(xpath = "//span[contains(text(),'Scenario List')]")
	public WebElement ScenarioListHeading;
	
	@FindBy(xpath = "//span[contains(@class,'channel-name-static')]")
	public WebElement ChannelNameHeading;
	
	@FindBy(xpath = "//span[contains(@class,'chnanel-name-dynamic')]")
	public WebElement ChannelNameDynamic;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-success pointer new-compose-btn')]")
	public WebElement ComposeNewButton;
	
	@FindBy(xpath = "//button[contains(text(),'Compose New')]")
	public WebElement ComposeNewText;
	
	@FindBy(xpath = "//span[contains(@class,'nav-link name-tab active')]")
	public WebElement ActiveTab;
	
	@FindBy(xpath = "//span[contains(@class,'nav-link name-tab')][contains(text(),'Scenario')]")
	public WebElement ScenarioTab;
	
	@FindBy(xpath = "//span[contains(text(),'Drafts')]")
	public WebElement DraftsTab;
	
	@FindBy(xpath = "//b[contains(text(),'Action')]")
	public WebElement ScenarioActionTD1;
	
	@FindBy(xpath = "//b[contains(text(),'Content')]")
	public WebElement ScenarioContentTD2;
	
	@FindBy(xpath = "//th[3]//b[1]")
	public WebElement ScenarioTargetTD3;
	
	@FindBy(xpath = "//b[contains(text(),'Number of Target')]")
	public WebElement ScenarioNumberOfTargetTD4;
	
	@FindBy(xpath = "//b[contains(text(),'Scenario')]")
	public WebElement ScenarioScenarioTD5;
	
	@FindBy(xpath = "//div[contains(text(),\"You don't have any scenario message right now. To\")]")
	public WebElement DefaultScenarioMessage;
	
	@FindBy(xpath = "//b[contains(text(),'Action')]")
	public WebElement DraftsActionTD1;
	
	@FindBy(xpath = "//b[contains(text(),'Content')]")
	public WebElement DraftsContentTD2;
	
	@FindBy(xpath = "//th[3]//b[1]")
	public WebElement DraftsTargetContentTD3;
	
	@FindBy(xpath = "//b[contains(text(),'Number of Target')]")
	public WebElement DraftsNumberofTargetTD4;
	
	@FindBy(xpath = "//b[contains(text(),'Scheduled At')]")
	public WebElement DraftsScheduledAtTD5;
	
	@FindBy(xpath = "//div[contains(text(),\"You don't have any drafts saved right now. To crea\")]")
	public WebElement DefaultDraftsMessage;
	
	
	
}
