package org.mvn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipLogin {

	public FlipLogin() {
	}
	
	@FindBy(xpath="//a[@class='_1_3w1N']")
	
	private WebElement Login;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	
	private WebElement MobileNum;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	
	private WebElement OtpReq;

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getMobileNum() {
		return MobileNum;
	}

	public WebElement getOtpReq() {
		return OtpReq;
	}
	
	
}
