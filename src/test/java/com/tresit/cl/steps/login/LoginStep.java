package com.tresit.cl.steps.login;

import com.tresit.cl.pages.login.LoginPages;
import net.serenitybdd.annotations.Step;
//import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPages {

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
