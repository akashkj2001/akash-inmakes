package org.pojo;

import org.base.BaseAkash;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailpojo extends BaseAkash {
	public gmailpojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "identifierId")
	private WebElement gmemailfield;
	@FindBy(name = "password")
	private WebElement gmpasswardfield;

	public WebElement getgmemailfield() {
		return gmemailfield;
	}

	public WebElement getgmpasswardfield() {
		return gmpasswardfield;
	}
}
