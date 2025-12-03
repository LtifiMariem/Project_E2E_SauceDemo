package com.automation.e2eTests.step_definitions;

import com.automation.e2eTests.page_objects.LoginPage;
import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Setup;
import com.automation.e2eTests.utils.Validations;
import com.automation.e2eTests.utils.Wait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public LoginPage loginPage;
	public Wait wait;
	public Validations validation;

	public LoginStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();

		validation = new Validations();
		wait = new Wait(Setup.getDriver());
	}

	/* ============ LOGIN SIMPLE ============ */
	@Given("Je me connecte sur l application SauceDemo")
	public void jeMeConnecteSurLApplicationSauceDemo() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisis le nom de utilisateur")
	public void jeSaisisLeNomDeUtilisateur() {

		seleniumUtils.writeText(LoginPage.getusername(), configFileReader.getProperties("home.username"));
	}

	@And("Je tape le mot de passe")
	public void jeTapeLeMotDePasse() {
		seleniumUtils.writeText(LoginPage.getpassword(), configFileReader.getProperties("home.password"));
	}

	@When("Je clique sur Login")
	public void jeCliqueSurLogin() throws InterruptedException {
		seleniumUtils.click(LoginPage.getbtnlogin());

	}

	@Then("Redirection vers la page d acceuil avec la liste des produits {string}")
	public void RedirectionVersLaPageDacceuilAvecLaListeDesProduits(String expectedtext) {
		validation.assertEquals(LoginPage.gettitle(),expectedtext);

	}
	
	/* ============ LOGIN INVALID ============ */
	@When("Je saisis le nom de utilisateur {string}")
	public void jeSaisisNomDeUtilisateurIncorrect(String userinvalid ) {
		seleniumUtils.writeText(LoginPage.getusername(), userinvalid);
	}
	
	
	@Then("Un message d erreur {string} doit s afficher")
	public void unMessageDErreurDoitSAfficher(String expectedErrormsg) {
		validation.assertEquals(LoginPage.geterrormessage(), expectedErrormsg);
	}

	/* ============ SCENARIO OUTLINE ============ */
	
	@When("Je saisis le username {string}")
    public void saisirUsername(String username) {
		seleniumUtils.writeText(LoginPage.getusername(), username);
    }

    @And("Je tape le mot de passe {string}")
    public void JeTapeLeMotDePasse (String password) {
    	seleniumUtils.writeText(LoginPage.getpassword(), password);
    }

    @Then("Je vérifie le résultat {string}")
	public void jeVerifieLeResultat(String result) {
		if (result.equalsIgnoreCase("Home Page")) {
			validation.assertTrue(LoginPage.gettitle(), "Products"); 
			// "Products" est le titre affiché sur la page d'accueil de SauceDemo
		} else if (result.equalsIgnoreCase("error")) {
			validation.assertTrue(LoginPage.geterrormessage(), "Epic sadface");
			// texte partiel de l'erreur, comme "Epic sadface: Sorry, this user has been locked out."
		}

    }
}



