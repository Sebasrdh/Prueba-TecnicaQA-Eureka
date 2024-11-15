package com.tresit.cl.steps.sms;

import com.tresit.cl.pages.sms.EnvioUnitarioSmsPage;
import net.serenitybdd.annotations.Step;

public class EnvioUnitarioSmsStep extends EnvioUnitarioSmsPage {


    @Step("opcion sms")
    public void clickOpcionSMS(){
        itemLabelSms.waitUntilPresent();
        itemLabelSms.click();
    }

    @Step("opcion Envio unitario")
    public void clickEnvioUnitario(){
        itemLabelEnvioUnitario.click();
    }


    @Step("boton nuevo mensaje")
    public void clickNuevoMensaje(){
        btn_nuevoMensaje.click();
    }


    @Step("Ingresa datos del mensaje")
    public void ingresDatosMensaje( String telefono , String mensaje ){
        txt_telefono.sendKeys( telefono );
        txt_mensaje.sendKeys( mensaje );
    }

    @Step("presiona boton gestionar")
    public void clickBottonGestionar(){
        btn_gestionar.click();
    }

    @Step("presiona boton confirmar")
    public void clickBottonConfirmar(){
        btn_confirmar.click();
    }

}
