package org.pojo;

import org.base.BaseAkash;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPojo extends BaseAkash {
	public FlipPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement flemailfield;
	@FindBy(xpath = "//button[text()='Request OTP']")
	private WebElement flloginbtn;

	public WebElement getFlemailfield() {
		return flemailfield;
	}

	public WebElement getFlloginbtn() {
		return flloginbtn;
	}
}
