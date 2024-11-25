package com.tresit.cl;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta de tus features
        glue = {
                "com.tresit.cl.definitions.pruebaEureka", // Paquete de las definiciones
                "com.tresit.cl.steps.website",          // Ruta de tus steps
        },
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@Website" // Asegúrate de usar las etiquetas adecuadas
)
public class Runner {


}
