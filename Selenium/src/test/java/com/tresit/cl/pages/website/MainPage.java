package com.tresit.cl.pages.website;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends PageObject {
    public String getPageTitle() {
      return getDriver().getTitle();
    }

    @FindBy(tagName = "h1")
    protected List<WebElementFacade> h1Tags;

    @FindBy(tagName = "p")
    protected List<WebElementFacade> pTags;

    @FindBy(xpath = "//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[1]/div/p[2]")
    protected WebElementFacade ufValue;

    @FindBy(xpath = "//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[2]/div/p[2]")
    protected WebElementFacade utmValue;

    @FindBy(xpath = "//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[4]/div/p[2]")
    protected WebElementFacade dollarValue;

    @FindBy(xpath = "//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[6]/div/p[2]")
    protected WebElementFacade euroValue;
}