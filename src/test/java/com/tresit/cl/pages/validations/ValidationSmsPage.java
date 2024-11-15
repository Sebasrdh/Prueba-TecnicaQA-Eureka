package com.tresit.cl.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationSmsPage extends PageObject {

    @FindBy( xpath = "//h2[contains( @class , 'headline m-0' ) ]")
    protected WebElementFacade lbl_wellcome;

    @FindBy( xpath = "//h2[@id='swal2-title']")
    protected WebElementFacade lbl_mensajeEnviado;

    @FindBy( xpath = "//div[@id='swal2-html-container']")
    protected WebElementFacade lbl_mensajeEnviadoCorrectamente;

    @FindBy( xpath = "//div[@id='swal2-html-container' and contains( text() , 'Usuario y/o contraseña no válidos')]")
    protected WebElementFacade lbl_loginErrorMessage;

    @FindBy( xpath = "//h2[@id='swal2-title' and contains( text() , 'Correo enviado')]")
    protected WebElementFacade lbl_mensajeEnvioOk;

}
