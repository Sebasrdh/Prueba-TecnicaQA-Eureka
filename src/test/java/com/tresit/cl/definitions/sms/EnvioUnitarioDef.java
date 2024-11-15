package com.tresit.cl.definitions.sms;

import com.tresit.cl.pages.sms.EnvioUnitarioSmsPage;
import com.tresit.cl.steps.sms.EnvioUnitarioSmsStep;
import com.tresit.cl.steps.validations.ValidationsSmsStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class EnvioUnitarioDef {


    @Steps( shared = true )
    EnvioUnitarioSmsStep envioUnitario;

    @Steps( shared = true )
    ValidationsSmsStep validationsSms;

    @And("ingresa a la opcion SMS")
    public void ingresaOpcionSms(){
        envioUnitario.clickOpcionSMS();
    }

    @And("ingresa a la opcion Envio Unitario")
    public void ingresaALaOpcionEnvioUnitario() {
        envioUnitario.clickEnvioUnitario();
    }

    @And("click en nuevo mensaje")
    public void clickEnNuevoMensaje() {
        envioUnitario.clickNuevoMensaje();
    }

    @And("ingressa informacion del mensaje")
    public void ingressaInformacionDelMensaje() {
        envioUnitario.ingresDatosMensaje( "998241849" , "mensaje enviado desde automatizcion");
    }

    @And("click en boton gestionar")
    public void clickEnBotonGestionar() {
        envioUnitario.clickBottonGestionar();
    }


    @And("click en boton confirmar")
    public void clickEnBotonConfirmar() {
        envioUnitario.clickBottonConfirmar();
    }

    @Then("Muestra Mensaje Enviado")
    public void muestraMensajeEnviado() {
        Assert.assertTrue(validationsSms.validarMensajeEnviado() );
    }

}
