package com.exito.appcompania.automation.interactions;

import com.exito.appcompania.automation.utils.DriverManager;
import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;


@AllArgsConstructor
public class tap implements Interaction {
    private int x, y;

    public static tap onCoordinates(int coordinatex, int coordinatey){
        return Tasks.instrumented(tap.class, coordinatex, coordinatey);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));

    }
}
