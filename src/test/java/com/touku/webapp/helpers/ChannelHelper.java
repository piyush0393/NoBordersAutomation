package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChannelHelper {

	public ChannelHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='trend']")
	public WebElement TrendTab;
	
	@FindBy(xpath = "//li[@id='following']")
	public WebElement FollowingTab;
	
	@FindBy(xpath = "//li[@id='rank']")
	public WebElement RankingTab;
	
	@FindBy(xpath = "//div[contains(text(),'No channel found')]")
	public WebElement DefaultTrendNoChannelText;
	
	@FindBy(xpath = "//div[contains(text(),'No channel found')]")
	public WebElement DefaultFollowingNoChannelText;
	
	@FindBy(xpath = "//ul[contains(@class,'channel-tabs')]")
	public WebElement TimelineTabs;
	
	@FindBy(xpath = "//div[contains(text(),'No channel found')]")
	public WebElement DefaultRankingNoChannelText;

}



