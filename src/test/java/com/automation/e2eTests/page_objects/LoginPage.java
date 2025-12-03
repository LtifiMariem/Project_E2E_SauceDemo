package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class LoginPage extends BasePage {
	/* Retrieve elementweblogin */
	@FindBy(how = How.ID, using = "user-name")
	private static WebElement user;

	@FindBy(how = How.ID, using = "password")
	private static WebElement pw;

	@FindBy(how = How.ID, using = "login-button")
	private static WebElement btnlogin;
	
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	private static WebElement title;

	@FindBy(xpath = "//h3[@data-test='error']")
	private static WebElement errormessage;

	public LoginPage() {
		super(Setup.getDriver());
	}

	public static WebElement getusername() {
		return user;
	}

	public static WebElement getpassword() {
		return pw;
	}
	public static WebElement getbtnlogin() {
		return btnlogin;
		
	}
	public static WebElement gettitle() {
		return title ;
		}
	
	public static WebElement geterrormessage() {
		return errormessage ;
		}
}

