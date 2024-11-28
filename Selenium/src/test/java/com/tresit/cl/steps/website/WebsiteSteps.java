package com.tresit.cl.steps.website;

import com.tresit.cl.pages.website.MainPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import java.time.Duration;


public class WebsiteSteps extends MainPage {
    private MainPage mainPage;

    @Step("Mostrar la cantidad de etiquetas H1 y sus textos")
    public void displayH1TagsInfo() {
        System.out.println("Cantidad de etiquetas H1: " + h1Tags.size());
        for (WebElementFacade h1Tag : h1Tags) {
            System.out.println("Texto de H1: " + h1Tag.getText());
        }
    }

    @Step("Mostrar la cantidad de etiquetas de párrafo (<p>)")
    public void displayPTagCount() {
        System.out.println("Cantidad de etiquetas de párrafo: " + pTags.size());
    }

    @Step("Abrir la página principal y verificar el título '{0}'")
    public void verifySiteTitle(String expectedTitle) {
        mainPage.open();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualTitle = mainPage.getPageTitle();
        System.out.println("Título obtenido: " + actualTitle);
        Assert.assertEquals("Error en el título", expectedTitle, actualTitle);
    }

    @Step("Mostrar los valores económicos")
    public void displayEconomicValues() {
        System.out.println("UF: " + ufValue.getText());
        System.out.println("UTM: " + utmValue.getText());
        System.out.println("Dólar observado: " + dollarValue.getText());
        System.out.println("Euro: " + euroValue.getText());
    }
}