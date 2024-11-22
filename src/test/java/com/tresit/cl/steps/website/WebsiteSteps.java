package com.tresit.cl.steps.website;

import com.tresit.cl.pages.website.MainPage;
import net.serenitybdd.annotations.Step;
//import net.thucydides.core.annotations.Step;

public class WebsiteSteps extends MainPage {

    @Step("Ingresar Usuario")
    public void typeUsername( String username ){
        txt_username.sendKeys( username );
    }

    @Step("Ingresar Contraceña")
    public void typePassword( String password  ){
        txt_password.sendKeys( password );
    }


    @Step("Click en el boton login")
    public void clickLogin( ){
        btn_login.click();
    }


}
