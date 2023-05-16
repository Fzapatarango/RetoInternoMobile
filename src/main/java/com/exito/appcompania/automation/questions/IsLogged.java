package com.exito.appcompania.automation.questions;

import com.exito.appcompania.automation.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.appcompania.automation.userinterfaces.LogInPage.LBL_GREETING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IsLogged implements Question<Boolean> {

    public static IsLogged onExitoApp(User user){ return new IsLogged(user) ;}
    private User user;
    @Override
    public Boolean answeredBy(Actor actor) {
        Ensure.that(
                actor.recall("GREETING").toString()).contains(user.getName());
        return true;
    }
}
