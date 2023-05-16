package com.exito.appcompania.automation.tasks;


import com.exito.appcompania.automation.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.appcompania.automation.userinterfaces.LogInPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class LogIn implements Task {

    private User user;

    public static LogIn onExitoApp(User user) {
        return Tasks.instrumented(LogIn.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // WaitUntil.the(BTN_LOGIN, isVisible()).forNoMoreThan(2).seconds(),
                Click.on(BTN_LOGIN),
                Enter.theValue(user.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_CONFIRM_LOGIN),
                WaitUntil.the(LBL_GREETING, isVisible()).forNoMoreThan(5).seconds()
                //tap.onCoordinates(911, 1553)
        );
        actor.remember("GREETING", LBL_GREETING.resolveFor(actor).getText());
    }
}
