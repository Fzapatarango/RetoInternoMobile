package com.exito.appcompania.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buyProduct.feature",
        glue = "com.exito.appcompania.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuyProductRunner {
}
