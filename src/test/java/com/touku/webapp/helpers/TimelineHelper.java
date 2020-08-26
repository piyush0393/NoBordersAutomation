package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimelineHelper {

	public TimelineHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@id='trend']")
	public WebElement TrendTab;
	
	@FindBy(xpath = "//li[@id='following']")
	public WebElement FollowingTab;
	
	@FindBy(xpath = "//li[@id='rank']")
	public WebElement RankingTab;
	
	@FindBy(xpath = "//div[contains(text(),'There is no post to display.')]")
	public WebElement DefaultTrendNoPostText;
	
	@FindBy(xpath = "//div[contains(text(),'There is no post in timeline of your any of the following channel.')]")
	public WebElement DefaultFollowingNoPostText;
	
	@FindBy(xpath = "//ul[contains(@class,'timeline-tabs')]")
	public WebElement TimelineTabs;
	
	@FindBy(xpath = "//div[contains(text(),'There is no post to display.')]")
	public WebElement DefaultRankingNoPostText;

}
