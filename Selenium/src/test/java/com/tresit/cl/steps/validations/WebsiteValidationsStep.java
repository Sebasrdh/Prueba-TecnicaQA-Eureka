package com.tresit.cl.steps.validations;

import com.tresit.cl.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.annotations.Step;

public class WebsiteValidationsStep extends ValidationPage {

    @Step("Validar visualizacion del module de productos")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }


    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMesaggeIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }

    @Step("Validar los productos listados en el carrito")
    public Boolean productsAreDisplayed(){
        for(WebElementFacade product:productsList ){
            if( product.isDisplayed() ){
                return true;
            }
        }
        return false;
    }

    @Step("Validar que le carrito este vacio de productos")
    public Boolean shopingCartIsEmpty(){
        for(WebElementFacade product:productsList ){
            if( !product.isDisplayed() ){
                return false;
            }
        }
        return true;
    }

    @Step("Validar finalizacion de orden")
    public Boolean orderTextIsDisplayed(){
        return lbl_order.isDisplayed();
    }

}
