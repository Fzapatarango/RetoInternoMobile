package com.exito.appcompania.automation.stepdefinitions.hooks;

import com.exito.appcompania.automation.utils.DriverManager;
import io.cucumber.java.BeforeAll;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class DriverHook {
    @BeforeAll
    public static void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverManager.startExitoapp())));
        OnStage.theActorCalled("Automation");
    }

}
