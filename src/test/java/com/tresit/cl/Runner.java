package com.tresit.cl;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.tresit.cl.definitions",
        tags = "@pruebalogin1"
)
public class Runner {


}
