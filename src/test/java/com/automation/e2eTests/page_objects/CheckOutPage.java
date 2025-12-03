package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;
import com.automation.e2eTests.utils.Wait;

public class CheckOutPage extends BasePage {
	public Wait wait;

	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	private static WebElement containerCart;
	// @FindBy(how = How.XPATH, using = "//span[@data-test='title']")
	// private static WebElement yourCart;

	@FindBy(how = How.XPATH, using = "//*[@id='checkout']")
	private static WebElement btnCheckout;

	/* renseigne */
	@FindBy(how = How.ID, using = "first-name")
	private static WebElement firstNameField;

	@FindBy(how = How.ID, using = "last-name")
	private static WebElement lastNameField;

	@FindBy(how = How.ID, using = "postal-code")
	private static WebElement postalCodeField;

	@FindBy(how = How.ID, using = "continue")
	private static WebElement continueButton;

	// last
	@FindBy(how = How.XPATH, using = "//button[@data-test='finish']")
	private static WebElement btnFinish;

	@FindBy(how = How.XPATH, using = "//h2[@data-test='complete-header']")
	private static WebElement confirmMessage;

	@FindBy(how = How.ID, using = "back-to-products")
	private static WebElement backHomebtn;

	public CheckOutPage() {

		super(Setup.getDriver());
		wait = new Wait(Setup.getDriver());
	}

	/* === Getters === */

	public static WebElement getcontainerCart() {
		return containerCart;
	}

	// public void waitForYourCart() {
	// wait.forElementToBeDisplayed(Duration.ofSeconds(5),
	// CheckOutPage.getyourCart(), "YourCart");
	// }

	// public static WebElement getyourCart() {
	// return yourCart;
	// }

	public static WebElement getbtnCheckout() {
		return btnCheckout;
	}

	public static WebElement getFirstNameField() {
		return firstNameField;
	}

	public static WebElement getLastNameField() {
		return lastNameField;
	}

	public static WebElement getPostalCodeField() {
		return postalCodeField;
	}

	public static WebElement getContinueButton() {
		return continueButton;
	}

	public static WebElement getFinish() {
		return btnFinish;
	}

	public static WebElement getMessageConfirmation() {

		return confirmMessage;

	}

	public static WebElement getBackHomeButton() {
		return backHomebtn;
	}

}
