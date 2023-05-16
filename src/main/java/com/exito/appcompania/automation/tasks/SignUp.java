package com.exito.appcompania.automation.tasks;

import com.exito.appcompania.automation.interactions.tap;
import com.exito.appcompania.automation.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.exito.appcompania.automation.userinterfaces.SignUpPage.*;


@AllArgsConstructor
public class SignUp implements Task {

    private User user;

    public static SignUp ExitoApp(User user) {
        return Tasks.instrumented(SignUp.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REGISTER),
                Enter.theValue(user.getName()).into(INPUT_NAME),
                Enter.theValue(user.getLastname()).into(INPUT_LASTNAME),
                Enter.theValue(user.getId()).into(INPUT_ID),
                Enter.theValue(user.getYear()).into(LST_YEAR),
                Click.on(LST_YEAR).then(tap.onCoordinates(181, 1210)),
                Enter.theValue(user.getMonth()).into(LST_MONTH),
                Click.on(LST_MONTH).then(tap.onCoordinates(553, 1210)),
                Enter.theValue(user.getDay()).into(LST_DAY),
                Click.on(LST_DAY).then(tap.onCoordinates(777, 1210)),
                Enter.theValue(user.getCellphone()).into(INPUT_CELLPHONE),
                Enter.theValue(user.getEmail()).into(INPUT_EMAIL),
                tap.onCoordinates(105, 1616),
                tap.onCoordinates(111, 1692),
                Click.on(BTN_ACCEPT_REGISTER)

        );

    }
}

