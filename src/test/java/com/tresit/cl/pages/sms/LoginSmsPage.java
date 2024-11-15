package com.tresit.cl.pages.sms;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginSmsPage extends PageObject {


    @FindBy( id = "mat-input-0")
    protected WebElementFacade txt_username;
    @FindBy( id = "mat-input-1")
    protected WebElementFacade txt_password;
    @FindBy( xpath = "//button[@type='submit']")
    protected WebElementFacade btn_ingresar;

    @FindBy( xpath = "//a[@class='caption ng-tns-c151-1']")
    protected WebElementFacade btn_recuperarContrasegna;

    @FindBy( id = "mat-input-2")
    protected WebElementFacade txt_emailUser;

    @FindBy( xpath = "//button[@type='button']")
    protected WebElementFacade btn_sendLink;



}
