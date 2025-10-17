package com.automation.e2eTests.step_definitions;

import java.time.Duration;

import org.openqa.selenium.By;

import com.automation.e2eTests.page_objects.HomePage;
import com.automation.e2eTests.page_objects.LoginPage;

import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Setup;
import com.automation.e2eTests.utils.Validations;
import com.automation.e2eTests.utils.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public LoginPage loginPage;
	public HomePage homePage;
	public Wait wait;
	public Validations validation;

	public LoginStepDefinition() {
		seleniumUtils = new SeleniumUtils(); //
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
		homePage = new HomePage();
		validation = new Validations();
		wait = new Wait(Setup.getDriver());
	}

	/* login */

	@Given("Je me connecte sur le site proservices")
	public void jeMeConnecteSurLeSiteProservices() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisis l adresse email")
	public void jeSaisisLAdresseEmail() {
		seleniumUtils.writeText(LoginPage.getusername(), configFileReader.getProperties("home.username"));

	}

	@When("Je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
		seleniumUtils.writeText(LoginPage.getpassword(), configFileReader.getProperties("home.password"));
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		wait.forPresenceOfElements(Duration.ofSeconds(10), By.id("button-container-softbox"), "Bouton Login");
		Wait.waitUntilClickable(Setup.getDriver(), By.id("button-container-softbox"));
		seleniumUtils.click(LoginPage.getbtnlogin());
	}

	/* logout */
	@Then("Je me redirige vers la page de connexion {string}")
	public void jeMeRedirigeVersLaPageDeConnexion(String verifdeconnect) {
		validation.assertEquals(LoginPage.getverifdeconnect(), "Accéder à votre compte");
	}

}
