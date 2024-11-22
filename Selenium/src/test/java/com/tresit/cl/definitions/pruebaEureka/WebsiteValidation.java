package com.tresit.cl.definitions.pruebaEureka;

import org.junit.Assert;

import com.tresit.cl.steps.website.WebsiteSteps;
import com.tresit.cl.steps.validations.WebsiteValidationsStep;
import com.tresit.cl.utilities.website.WebSite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class WebsiteValidation {


    @Steps( shared = true )
    WebSite url;

    @Steps( shared = true )
    WebsiteSteps login;

    @Steps( shared = true )
    WebsiteValidationsStep validate;


    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo( "http://www.bcentral.cl" );
    }

    @When("ingresa credenciales validas")
    public void whenLoginWithValidCredentials() {
        login.typeUsername( "student" );
        login.typePassword( "Password123" );
        login.clickLogin();
    }

    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductsModule() {
        Assert.assertTrue( validate.titleIsVisible() );
    }

}
