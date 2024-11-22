package com.tresit.cl.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy( xpath = "//*[@id=\"loop-container\"]/div/article/div[1]/h1")
    protected WebElementFacade lbl_product;

    @FindBy( xpath = "//h3[@data-test='error' and text()='Epic sadface: Username and password do not match any user in this service']")
    protected WebElementFacade lbl_errorMessage;

    @FindBy( xpath = "//div[@class='cart_item']")
    protected List<WebElementFacade> productsList;

    @FindBy( xpath = "//h2[@data-test='complete-header']")
    protected WebElementFacade lbl_order;

}
