package com.automation.e2eTests;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = { "src/spec/features" }, 
plugin = { "pretty", "html:target/report/cucumber-report.html","json:target/report/cucumber-report.json" },
		// glue = {"/selenuim.cucumber/src/test/java/com/automation/e2eTests/step_definitions"},
		tags = (""), 
		monochrome = true, 
		snippets = CAMELCASE
)
public class RunWebSuiteTest {
}
