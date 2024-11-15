package com.tresit.cl.steps.validations;

import com.tresit.cl.pages.validations.ValidationSmsPage;
import net.serenitybdd.annotations.Step;

public class ValidationsSmsStep extends ValidationSmsPage {


    @Step("Validar que estoy en la plataforma")
    public Boolean wellcomeTextIsDisplayed(){
        return lbl_wellcome.isDisplayed();
    }


    @Step("Validar mensaje de exito")
    public Boolean validarMensajeEnviado(){
        return lbl_mensajeEnviado.isDisplayed()
                && lbl_mensajeEnviadoCorrectamente.isDisplayed();
    }


    public boolean errorMessageIsDisplated() {
        return lbl_loginErrorMessage.isDisplayed();
    }

    public boolean errorEnvioEmailOkIsDisplated() {
        return lbl_mensajeEnvioOk.isDisplayed();
    }
}
