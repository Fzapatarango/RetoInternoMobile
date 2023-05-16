package com.exito.appcompania.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyProductsPage {

    public static final Target BTN_SEE_MORE = Target.the("See more button")
            .located(By.id("com.exito.appcompania:id/textView_title_halls_see_more"));

    public static final Target BTN_RECEIVE_HOME = Target.the("Receive in home button")
            .located(By.id("com.exito.appcompania:id/appCompatTextView_item_title"));

    public static final Target BTN_SELECT_DIRECTION = Target.the("select actual direction button")
            .located(By.id("com.exito.appcompania:id/appCompatButton_continue"));

    public static final Target BTN_CATEGORY = Target.the("select category button")
            .locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target BTN_SUBCATEGORY = Target.the("select subcategory button")
            .locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target BTN_PRODUCT = Target.the("select product button")
            .locatedBy("//android.widget.TextView[@text='Celular SAMSUNG Galaxy M13 128 GB Azul']");

        public static final Target BTN_CART = Target.the("add to cart button")
            .located(By.id("com.exito.appcompania:id/add_to_cart_button"));

    public static final Target BTN_VIEW_CART = Target.the("View cart button")
            .located(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"));

    public static final Target LBL_PRODUCT = Target.the("Product label in cart")
            .locatedBy("(//android.view.View[@content-desc='Celular SAMSUNG Galaxy M13 128 GB Azul'])[2]/android.widget.TextView");

}
