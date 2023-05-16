package com.exito.appcompania.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage {

    public static final Target BTN_REGISTER = Target.the("Register button")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_registrarse"));

    public static final Target INPUT_NAME = Target.the("input user name")
            .located(By.xpath("//*[@class='android.widget.EditText' and @text='Nombres']"));

    public static final Target INPUT_LASTNAME = Target.the("input user lastname")
            .located(By.xpath("//*[@class='android.widget.EditText' and @text='Apellidos']"));
    public static final Target INPUT_ID = Target.the("input user id")
            .located(By.xpath("//*[@class='android.widget.EditText' and @text='Número de documento']"));
    public static final Target LST_YEAR = Target.the("droplist user birth year")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_anio_registro"));

    public static final Target LST_YEAR_OPTION = Target.the("droplist user birth year option")
            .located(By.xpath("//android.widget.ListView/android.widget.CheckedTextView[@text='2001']"));
    public static final Target LST_MONTH = Target.the("droplist user birth month")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_mes_registro"));

    public static final Target LST_DAY = Target.the("droplist user birthday")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_dia_registro"));

    public static final Target INPUT_CELLPHONE = Target.the("input user cellphone")
            .located(By.id("com.exito.appcompania:id/TextInputEditText_tel"));


    public static final Target INPUT_EMAIL = Target.the("input user email")
            .located(By.xpath("//*[@class='android.widget.EditText' and @text='Correo electrónico']"));

    public static final Target BTN_TERMS_CONDITIONS = Target.the("Checkbox button to accept terms and conditions")
            .located(By.xpath("//*[@class='android.widget.CheckBox' and @text='Acepto términos y condiciones']"));

    public static final Target BTN_ACCEPT_REGISTER = Target.the("Register button")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_registrar"));

}