package com.tresit.cl.definitions.pruebaEureka;

import org.junit.Assert;

import com.tresit.cl.steps.website.WebsiteSteps;
import com.tresit.cl.utilities.website.WebSite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class WebsiteValidation {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    WebsiteSteps websiteSteps;


    @When("el usuario navega al sitio web")
    public void el_usuario_navega_al_sitio_web() {
        url.navigateTo("http://www.bcentral.cl");
    }

    @Then("la aplicacion debe mostrar la cantidad de etiquetas H1 y sus textos")
    public void la_aplicacion_debe_mostrar_la_cantidad_de_etiquetas_h1_y_sus_textos() {
        websiteSteps.displayH1TagsInfo();
    }

    @Then("la aplicacion debe mostrar la cantidad de etiquetas de párrafo p")
    public void la_aplicacion_debe_mostrar_la_cantidad_de_etiquetas_de_parrafo_p() {
        websiteSteps.displayPTagCount();
    }

    @Then("el título del sitio debe ser {string}")
    public void el_titulo_del_sitio_debe_ser(String expectedTitle) {
        websiteSteps.verifySiteTitle(expectedTitle);
    }

    @Then("la aplicacion debe mostrar los valores encontrados en la UF, UTM, Dólar observado y Euro")
    public void la_aplicacion_debe_mostrar_los_valores_encontrados_en_la_UF_UTM_Dolar_observado_y_Euro() {
        websiteSteps.displayEconomicValues();
    }
}