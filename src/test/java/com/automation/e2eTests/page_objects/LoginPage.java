package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class LoginPage extends BasePage {
	/* Retrieve elementweblogin */
	@FindBy(how = How.ID, using = "sign-in-email-input")
	private static WebElement username;

	@FindBy(how = How.ID, using = "sign-in-password-input")
	private static WebElement password;

	@FindBy(how = How.ID, using = "button-container-softbox")
	private static WebElement btnlogin;
	
	@FindBy(how = How.XPATH, using = "//*[contains(normalize-space(text()),'Accéder à votre compte')]")
	private static WebElement verifdeconnect;

	public LoginPage() {
		super(Setup.getDriver());
	}

	public static WebElement getusername() {
		return username;
	}

	public static WebElement getpassword() {
		return password;
	}

	public static WebElement getbtnlogin() {
		return btnlogin;
		
	}
	public static WebElement getverifdeconnect() {
		return verifdeconnect;}
	
}
