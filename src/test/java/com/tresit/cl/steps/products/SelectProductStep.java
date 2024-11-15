package com.tresit.cl.steps.products;

import com.tresit.cl.pages.products.SelectProductPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SelectProductStep extends SelectProductPage {

    @Step("agregar productos al carrito de compras")
    public void addProducts( int quantity ) {
        for(int i = 0 ; i < quantity ; i++ ){
            Actions act = new Actions( getDriver() );
            act.click( products.get(i) ).perform();
        }
    }


    @Step("da click en el icono del carrito")
    public void clickShoppingCartIcon(  ) {
        shoppingCartIcon.click();
    }


}
