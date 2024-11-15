package com.tresit.cl.definitions.login;

import org.junit.Assert;

import com.tresit.cl.steps.login.LoginStep;
import com.tresit.cl.steps.validations.LoginValidationsStep;
import com.tresit.cl.utilities.website.WebSite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class LoginDef {


    @Steps( shared = true )
    WebSite url;

    @Steps( shared = true )
    LoginStep login;

    @Steps( shared = true )
    LoginValidationsStep validate;


    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo( "http://localhost:4200/#/auth/login" );
    }

    @When("ingresa credenciales validas")
    public void whenLoginWithValidCredentials() {
        login.typeUsername( "login1" );
        login.typePassword( "login1" );
        login.clickLogin();
    }

    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductsModule() {
        Assert.assertTrue( validate.titleIsVisible() );
    }


    // @When("ingresa credenciales invalidas")
    // public void whenLoginWithInValidCredentials() {
    //     login.typeUsername( "standard_user" );
    //     login.typePassword( "123456" );
    //     login.clickLogin();
    // }

    // @Then("la aplicacion devie mostrar un mensaje de error")
    // public void systemShowErrorMessaje() {
    //     Assert.assertTrue( validate.errorMesaggeIsDisplayed() );
    // }

}
