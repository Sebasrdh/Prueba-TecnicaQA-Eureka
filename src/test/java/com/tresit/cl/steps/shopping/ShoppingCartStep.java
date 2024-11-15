package com.tresit.cl.steps.shopping;

import com.tresit.cl.pages.shopping.ShoppingCartPage;
import net.serenitybdd.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Click en checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    @Step("Ingresr nombre")
    public void typeFirstName( String firstName ){
        txt_firstName.sendKeys( firstName );
    }

    @Step("Ingresr Apellido")
    public void typeLastName( String lastName ){
        txt_lastName.sendKeys( lastName );
    }

    @Step("Ingresr codigo postal")
    public void typePostalCode( String postalCode ){
        txt_postalCode.sendKeys( postalCode );
    }

    @Step("Click en continuar")
    public void clickContinueButton(){
        continueButton.click();
    }

    @Step("Click en finalizar")
    public void clickFinishButton(){
        finishButton.click();
    }

}
