package com.touku.webapp.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InvitationHelper {

	public InvitationHelper(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
}
