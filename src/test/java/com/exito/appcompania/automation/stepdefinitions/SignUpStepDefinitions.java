package com.exito.appcompania.automation.stepdefinitions;


import com.exito.appcompania.automation.tasks.SignUp;
import com.exito.appcompania.automation.utils.ReadFiles;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class SignUpStepDefinitions {
    @When("{string} signs up with credentials")
    public void signsUp(String user) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.ExitoApp(ReadFiles.readUser(user)));
    }

}
