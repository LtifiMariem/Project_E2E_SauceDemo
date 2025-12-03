package com.automation.e2eTests.step_definitions;

import java.time.Duration;

import com.automation.e2eTests.page_objects.CheckOutPage;

import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Setup;
import com.automation.e2eTests.utils.Validations;
import com.automation.e2eTests.utils.Wait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStepsDefinitions {
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validation;
	public CheckOutPage checkOutPage;
	public Wait wait;

	public CheckOutStepsDefinitions() {
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validation = new Validations();
		checkOutPage = new CheckOutPage();
		wait = new Wait(Setup.getDriver());
	}

	@When("Je clique sur le panier")
	public void JeCliqueSurLePanier() {

		seleniumUtils.safeClick(CheckOutPage.getcontainerCart(), "Bouton panier");

		wait.forElementToBeDisplayed(Duration.ofSeconds(10), CheckOutPage.getbtnCheckout(), "Bouton checkout");
	}
	// Then Redirection vers la page "Your Cart"
	// @Then("Redirection vers la page {string}")
	// public void RedirectionVersLaPage(String txtYourCart) {

	// validation.assertEquals(CheckOutPage.getyourCart(), txtYourCart);

	// }

	@And("Je clique sur checkout")
	public void jeCliqueSurCheckout() {
		// checkOutPage.waitForCheckoutButton(); // Attente explicite sur le bouton
		seleniumUtils.click(CheckOutPage.getbtnCheckout());

	}

	/* fill out customer information */

	@And("Je renseigne le prénom {string}")
	public void JeRenseigneLePrénom(String firstName) {

		seleniumUtils.writeText(CheckOutPage.getFirstNameField(), firstName);
	}

	@And("Je renseigne le nom {string}")
	public void JeRenseigneLeNom(String lastName) {
		seleniumUtils.writeText(CheckOutPage.getLastNameField(), lastName);
	}

	@And("Je renseigne le code postal {int}")
	public void JeRenseigneLeCodePostal(Integer postalCode) {
		seleniumUtils.writeText(CheckOutPage.getPostalCodeField(), String.valueOf(postalCode));

	}

	@And("Je clique sur le bouton Continue")
	public void JeCliqueSurLeBoutonContinue() {
		seleniumUtils.click(CheckOutPage.getContinueButton());

	}

	// confirmation
	@Then("Je clique sur le bouton Finish")
	public void jeCliqueSurLeBoutonFinish() {
		seleniumUtils.click(CheckOutPage.getFinish());

	}

	@Then("La page de confirmation de commande doit s afficher avec le message {string}")
	public void laPageDeConfirmationDeCommandeDoitSAfficherAvecLeMessage(String txtFinishOrder) {

		validation.assertEquals(CheckOutPage.getMessageConfirmation(), txtFinishOrder);
	}

	@Then("Je clique sur le bouton Back Home")
	public void jeCliqueSurLeBoutonBackHome() {
		seleniumUtils.click(CheckOutPage.getBackHomeButton());
	}

}
