package com.tresit.cl.pages.sms;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class EnvioUnitarioSmsPage extends PageObject {


    @FindBy( xpath = "//span[ contains( @class , 'item-label ng-tns-c93-10')]")
    protected WebElementFacade itemLabelSms;

    @FindBy( xpath = "//span[ contains( @class , 'item-label ng-tns-c93-16')]")
    protected WebElementFacade itemLabelEnvioUnitario;

    @FindBy( xpath = "//button/span/span[ text() = 'Nuevo mensaje' ]")
    protected WebElementFacade btn_nuevoMensaje;

    @FindBy( id = "mat-input-2")
    protected WebElementFacade txt_telefono;

    @FindBy( id = "mat-input-3")
    protected WebElementFacade txt_mensaje;

    @FindBy( xpath = "//button/span[ text() = 'Gestionar ' ]")
    protected WebElementFacade btn_gestionar;

    @FindBy( xpath = "//button[@class='swal2-confirm swal2-styled' ]")
    protected WebElementFacade btn_confirmar;





}
