package com.exito.appcompania.automation.stepdefinitions;

import com.exito.appcompania.automation.questions.IsLogged;
import com.exito.appcompania.automation.tasks.LogIn;
import com.exito.appcompania.automation.utils.ReadFiles;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LogInStepDefinitions {
    @When("{string} logs in with credentials")
    public void logsInWithCredentials(String user) {
        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.onExitoApp(ReadFiles.readUser(user)));
    }

    @Then("{string} should see a greeding")
    public void shouldSeeGreeting(String user) {
        OnStage.theActorInTheSpotlight().should(seeThat(IsLogged.onExitoApp(ReadFiles.readUser(user))));
    }
}
