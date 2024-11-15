package com.tresit.cl.pages.login;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPages extends PageObject {

    @FindBy( xpath= "/html/body/app-root/app-auth-layout/div/div/div/app-login-page/form/div[1]/input")
    protected WebElementFacade txt_username;

    @FindBy( xpath= "/html/body/app-root/app-auth-layout/div/div/div/app-login-page/form/div[2]/input")
    protected WebElementFacade txt_password;

    @FindBy( xpath = "/html/body/app-root/app-auth-layout/div/div/div/app-login-page/form/div[3]/div/button")
    protected WebElementFacade btn_login;

    

}

    
