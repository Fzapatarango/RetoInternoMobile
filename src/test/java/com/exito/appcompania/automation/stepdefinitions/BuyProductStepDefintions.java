package com.exito.appcompania.automation.stepdefinitions;

import com.exito.appcompania.automation.questions.ProductIs;
import com.exito.appcompania.automation.tasks.BuyAProduct;
import com.exito.appcompania.automation.utils.ReadFiles;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BuyProductStepDefintions {
    @When("user buys a {string}")
    public void userBuysA(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuyAProduct.onExitoApp(ReadFiles.readProduct(product)));
    }

    @Then("should see the {string} in the cart")
    public void shouldSeeTheInTheCart(String product) {
        OnStage.theActorInTheSpotlight().should(seeThat(ProductIs.inCart(ReadFiles.readProduct(product))));
    }
}
