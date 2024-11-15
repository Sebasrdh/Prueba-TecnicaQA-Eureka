package com.tresit.cl.definitions.sms;

import com.tresit.cl.steps.sms.LoginSmsStep;
import com.tresit.cl.steps.validations.ValidationsSmsStep;
import com.tresit.cl.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginSmsDef {


    @Steps( shared = true )
    WebSite url;

    @Steps( shared = true )
    LoginSmsStep smsStep;

    @Steps( shared = true )
    ValidationsSmsStep validationsSmsStep;

    @Given("El ususario entra a la plataforma SMS")
    public void userNavegateToPlataformaSMS() {
        url.navigateTo( "https://qa.front.sms.3it.cl/login");
    }


    @When("ingresa credenciales validas en la plataforma")
    public void whenLoginWithValidCredentials() {
        smsStep.typeUserName("Administrador" );
        smsStep.typePassword(":!natT+q35o_" );
        smsStep.clickButtonSubmit();
    }


    @Then("aplicacion muestra el dashboard de la plataforma")
    public void aplicacionMuestraElDashboardDeLaPlataforma() {
        Assert.assertTrue( validationsSmsStep.wellcomeTextIsDisplayed() );
    }


    @When("ingresa credenciales invalidas en la plataforma")
    public void ingresaCredencialesInvalidasEnLaPlataforma() {
        smsStep.typeUserName("Administrador" );
        smsStep.typePassword("123456" );
        smsStep.clickButtonSubmit();
    }


    @Then("aplicacion muestra mensaje de error")
    public void aplicacionMuestraMensajeDeError() {
        Assert.assertTrue( validationsSmsStep.errorMessageIsDisplated() );
    }



    @When("presiona opcion cambio de clave")
    public void presionaOpcionCambioClave() {
        smsStep.clickButtonRecuperar();
    }

    @And("el sistema le solicita el correo electronico")
    public void elSistemaLeSolicitaElCorreoElectronico() {
        smsStep.typeEmailUser("alex.avila@3it.cl");
    }

    @And("usuario presiona boton envio link recuperacion")
    public void usuarioPresionaBotonEnvioLinkRecuperacion() {
        smsStep.clickButtonEnviarLink();
    }

    @Then("correo enviado correctamente")
    public void correoEnviadoCorrectamente() {
        Assert.assertTrue( validationsSmsStep.errorEnvioEmailOkIsDisplated() );
    }



}
