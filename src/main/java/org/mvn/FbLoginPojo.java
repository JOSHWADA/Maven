package org.mvn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLoginPojo  {
	
	//1 non parameterized constructor
	
	public FbLoginPojo() {

	
	}
	
	//2 private web element
	// WebElement email= driver.findElement(By.id("email"));
	
		@FindBy(id="email")
		
		private WebElement email;
		
		@FindBy( xpath ="//input[@aria-label='Password']")
		
		private WebElement Password;
		
		@FindBy (name="login")
		
		private WebElement loginBtn;
		
		//3 Getters to access webelements outside the class

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		
		
		
}
