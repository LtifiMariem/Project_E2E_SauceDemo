package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

/*HomePage/dashboard apres conx (btn dashboard Avatar, notif, */

public class HomePage extends BasePage {
	// Localisation du totalTikets sur la page Home
	@FindBy(how = How.ID, using = "SoftTyp3")
	private static WebElement totalTikets;

	/* logout web element */
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'MuiAvatar-root') and text()='p']")
	private static WebElement BtnAvatar;

	@FindBy(how = How.ID, using = "Default3")
	private static WebElement BtnDeconnecter;

	// btn CreationTicket
	@FindBy(how = How.ID, using = "SoftButton1")
	private static WebElement BtnCreationTicket;

	public HomePage() {
		super(Setup.getDriver());
	}

	public static WebElement getTotalTikets() {
		return totalTikets;
	}

	public static WebElement getBtnAvatar() {
		return BtnAvatar;
	}

	public static WebElement getBtnDeconnecter() {
		return BtnDeconnecter;
	}

	public static WebElement getBtnCreationTicket() {
		return BtnCreationTicket;
	}
}
