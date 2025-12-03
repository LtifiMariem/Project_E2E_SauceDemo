package com.automation.e2eTests.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class CartPage extends BasePage {

	/* Retrieve elementweb */
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	private static WebElement addToCartButton;
	@FindBy(how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
	private static WebElement shoppingCartBadge;

	public CartPage() {
		super(Setup.getDriver());
	}

	/* Recuperation dynamic button */
	public WebElement getAddToCartButton(String productName) {
		String formattedName = productName.toLowerCase().replace(" ", "-");
		String buttonId = "add-to-cart-" + formattedName;
		return Setup.getDriver().findElement(By.id(buttonId));
	}
	public static WebElement getaddToCartButton() {
		return addToCartButton;
		}
	

	public static WebElement getShoppingCartBadge() {
		return shoppingCartBadge;
	}

}
