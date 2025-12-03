
# 🧪 SauceDemo – Automated E2E Testing Framework
**Selenium WebDriver | Cucumber BDD | JUnit | Page Object Model | Maven**

This project is a **complete E2E automation framework** developed to test the **SauceDemo** application.

The goal of this framework is to provide a scalable, maintainable, and easy-to-use structure for end-to-end UI test automation.

---

## 🚀 Features


✔ **Complete Automation of User Journeys (SauceDemo)**
✔ **POM (Page Object Model) Architecture**
✔ **Cucumber BDD + Gherkin** for improved readability
✔ **JUnit** for test execution
✔ **Centralized WebDriver Management (Setup/TearDown)**
✔ **Reusable Utilities** (waits, validations, uploads, date utilities, select lists, etc.)
✔ **Scalable and Enterprise-Ready Structure**
✔ **HTML Execution Reports + Logs**
✔ **CI/CD Compatible (Jenkins, GitHub Actions)**

---

## 🏗️ Project Structure

```

.
├── src
│ ├── spec
│ │ └── features
│ │ └── feature_file
│ │ ├── login.feature
│ ├── login_outline.feature
│ ├── cart.feature
│ └── CheckOut.feature
│
│ ├── test
│ │ ├── java/com/automation/e2eTests
│ │ │ ├── page_objects # Classes POM
│ │ │ ├── step_definitions # Définitions des étapes Cucumber
│ │ │ ├── utils # Utilitaires et fonctions d'assistance
│ │ │ └── RunWebSuiteTest.java
│ │ └── resources/configs
│ │ └── env_config.properties
│
├── pom.xml
└── README.md

---


---

## 🧩 Exemples de Fonctionnalités (BDD Gherkin)

### **login.feature**
```gherkin
Feature: Login to SauceDemo

  Scenario: Valid login
    Given I am on the SauceDemo login page
    When I enter valid credentials
    And I click on the Login button
    Then I should access the products page

🔍 Example Step Definition

@When("I enter valid credentials")
public void enterValidCredentials() {
    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
}

🏗️ Architecture (Design Patterns)
✔ Page Object Model (POM)

→ Each page of the application has its own dedicated class.

→ Encapsulation of actions and locators.

→ Highly maintainable.

✔ Utilities Layer

→ Generic class for:

Explicit waits

Validations

List selection

File uploads

Date management

✔ Setup / Teardown

→ Browser initialization
→ Configuration file loading
→ Cleanup after each scenario



## ⚙️ Prerequisites

- **Java 11+**
- **Maven 3.6+**
- Browser drivers (e.g. ChromeDriver, GeckoDriver, EdgeDriver)
- IDE ( Eclipse with Java )

---

