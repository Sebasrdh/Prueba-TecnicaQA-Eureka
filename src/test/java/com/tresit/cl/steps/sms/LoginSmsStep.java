package com.tresit.cl.steps.sms;

import com.tresit.cl.pages.sms.LoginSmsPage;
import net.serenitybdd.annotations.Step;

public class LoginSmsStep extends LoginSmsPage {


    @Step("Ingresa Nombre de Usuario")
    public void typeUserName( String username ){
        txt_username.sendKeys( username);
    }

    @Step("Ingresa la password")
    public void typePassword( String password ){
        txt_password.sendKeys(password);
    }

    @Step("Click en boton submit")
    public void clickButtonSubmit(){
        btn_ingresar.click();
    }

    @Step("click boton recuperar contraseña")
    public void clickButtonRecuperar() {
        btn_recuperarContrasegna.click();
    }

    @Step("ingresa email del usuario")
    public void typeEmailUser( String emailUser ){
        txt_emailUser.sendKeys( emailUser );
    }

    @Step("click botton enviar link recuperacion")
    public void clickButtonEnviarLink() {
        btn_sendLink.click();
    }
}


