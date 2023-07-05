package org.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleFb extends BaseClass {

	public static void main(String[] args) {
		
		launchbrowser();
		
		launchUrl("https://en-gb.facebook.com/");
		
		WindowMaximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		passText("Selenium", email);
		
		WebElement pass = driver.findElement(By.name("pass"));
		passText("Inmakes", pass);
	}
}
