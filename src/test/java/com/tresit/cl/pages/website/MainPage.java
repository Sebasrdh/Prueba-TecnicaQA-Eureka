package com.tresit.cl.pages.website;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainPage extends PageObject {

    @FindBy( id= "username")
    protected WebElementFacade txt_username;

    @FindBy( id= "password")
    protected WebElementFacade txt_password;

    @FindBy( id = "submit")
    protected WebElementFacade btn_login;

    

}

    
