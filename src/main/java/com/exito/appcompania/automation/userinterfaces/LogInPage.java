package com.exito.appcompania.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage {

    public static final Target BTN_LOGIN = Target.the("LOGIN button")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_ingresar"));

    public static final Target INPUT_EMAIL = Target.the("user email input")
            .located(By.id("com.exito.appcompania:id/TextInputEditText_email"));

    public static final Target INPUT_PASSWORD = Target.the("user password input")
            .located(By.xpath("//*[@class='android.widget.EditText' and @text='Contraseña']"));

    public static final Target BTN_CONFIRM_LOGIN = Target.the("Confirm login button")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_ingresar"));

    public static final Target BTN_CLOSE_VIDEO = Target.the("Close info video")
            .located(By.id("com.exito.appcompania:id/imageview_close"));

    public static final Target LBL_GREETING = Target.the("Label greeting in exito app")
            .located(By.id("com.exito.appcompania:id/textView_user_name"));

}
