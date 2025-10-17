package com.automation.e2eTests.step_definitions;

import java.time.Duration;

import org.openqa.selenium.By;

import com.automation.e2eTests.page_objects.HomePage;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Setup;
import com.automation.e2eTests.utils.Validations;
import com.automation.e2eTests.utils.Wait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {
	// declaration objects
	public SeleniumUtils seleniumUtils;
	public HomePage homePage;
	public Validations validations;
	public Wait wait;

	// constructeur
	public HomeStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		homePage = new HomePage();
		validations = new Validations();
		wait = new Wait(Setup.getDriver());
	}

	@Then("Je me redirige vers la page Home{string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
		wait.forPresenceOfElements(Duration.ofSeconds(10), By.id("SoftTyp3"), "Total des tickets");
		validations.assertEquals(HomePage.getTotalTikets(), "Total des tickets");

	}

	// btnAvatar
	@When("Je clique sur Avatar droite en haut")
	public void JeCliqueSurAvatarDroiteEnHaut() {

		// Clic via SeleniumUtils (ou clic normal)
		seleniumUtils.safeClick(HomePage.getBtnAvatar(), "Avatar");

		wait.forElementToBeDisplayed(Duration.ofSeconds(10), HomePage.getBtnDeconnecter(), "Bouton Déconnecter");
	}

	// btnDeconnecter
	@And("Je clique sur se déconnecter")
	public void JeCliqueSurSeDéconnecter() {
		seleniumUtils.click(HomePage.getBtnDeconnecter());

	}

	// btnCreationTickets
	@Then("Je clique sur le bouton creation ticket")
	public void JeCliqueSurLeBoutonCreationTicket() {
		seleniumUtils.click(HomePage.getBtnCreationTicket());
	}
}
