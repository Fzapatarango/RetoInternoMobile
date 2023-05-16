package com.exito.appcompania.automation.questions;

import com.exito.appcompania.automation.models.Product;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

@AllArgsConstructor
public class ProductIs implements Question<Boolean> {

    private Product product;

    public static ProductIs inCart(Product product) {
        return new ProductIs(product);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Ensure.that(actor.recall("PRODUCT_NAME").toString()).contains(product.getProduct());
        return true;
    }
}
