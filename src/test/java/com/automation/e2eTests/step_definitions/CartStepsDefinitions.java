package com.automation.e2eTests.step_definitions;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import com.automation.e2eTests.page_objects.CartPage;
import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Setup;
import com.automation.e2eTests.utils.Validations;
import com.automation.e2eTests.utils.Wait;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepsDefinitions {
	public SeleniumUtils seleniumUtils; 
	public ConfigFileReader configFileReader;
	public CartPage cartPage; 
	public Wait wait; 
	public Validations validation; 
	public CartStepsDefinitions() { 
		seleniumUtils = new SeleniumUtils(); 
		configFileReader = new ConfigFileReader(); 
		cartPage = new CartPage(); 
		validation = new Validations(); 
		wait = new Wait(Setup.getDriver()); 
		} 
	/* add product to a cart */ 
	@When("Je clique sur add to cart pour ajouter le produit Sauce Labs Backpack au panier") 
	public void jeCliqueSurAddToCartPourAjouterLeProduitSauceLabsBackpackAuPanier() { 
		seleniumUtils.click(CartPage.getaddToCartButton()); } 
	@Then("Je vérifie que le panier doit contenir {int} produit") 
	public void jeVerifieQueLePanierDoitContenirProduit(Integer expectedCount) { 
		
		wait.forElementToBeDisplayed(Duration.ofSeconds(5), CartPage.getShoppingCartBadge(), "Badge du panier"); 

		WebElement shoppingCartBadge = CartPage.getShoppingCartBadge(); 
		validation.verifyCartBadgeCount(shoppingCartBadge, String.valueOf(expectedCount)); 
		} 
	}

