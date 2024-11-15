package com.tresit.cl.pages.shopping;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageObject {

    @FindBy( id = "checkout" )
    protected WebElementFacade checkoutButton;

    @FindBy( id = "first-name" )
    protected WebElementFacade txt_firstName;

    @FindBy( id = "last-name" )
    protected WebElementFacade txt_lastName;

    @FindBy( id = "postal-code" )
    protected WebElementFacade txt_postalCode;

    @FindBy( id = "continue" )
    protected WebElementFacade continueButton;

    @FindBy( id = "finish" )
    protected WebElementFacade finishButton;

}
