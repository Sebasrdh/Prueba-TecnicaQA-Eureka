package com.tresit.cl.definitions.shopping;

import com.tresit.cl.steps.products.SelectProductStep;
import com.tresit.cl.steps.shopping.ShoppingCartStep;
import com.tresit.cl.steps.validations.LoginValidationsStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {


    @Steps(shared = true)
    SelectProductStep selectProductStep;
    @Steps(shared = true)
    LoginValidationsStep validationsStep;
    @Steps(shared = true)
    ShoppingCartStep shoppingCartStep;

    @And( "agregar productos al carrito de compras" )
    public void userAddProducts() {
        selectProductStep.addProducts( 3 );
    }

    @And( "da click en el icono del carrito" )
    public void userClickShoppingCartIcon() {
        selectProductStep.clickShoppingCartIcon();
    }

    @Then("el sistema debería listar los productos agregados en el carrito de compras")
    public void systemListProducts() {
        Assert.assertTrue( validationsStep.productsAreDisplayed() );
    }

    @Then("el sistema debería mostrar la cesta sin productos")
    public void systemShowEmptyShoppingCart() {
        Assert.assertTrue( validationsStep.shopingCartIsEmpty() );
    }


    @When("completa todo el registro de la orden")
    public void userCompleteOrder(){
        shoppingCartStep.clickCheckoutButton();;
        shoppingCartStep.typeFirstName("ALEX");
        shoppingCartStep.typeLastName("AVILA");
        shoppingCartStep.typePostalCode("34567890");
        shoppingCartStep.clickContinueButton();
        shoppingCartStep.clickFinishButton();
    }


    @Then("el sistema debeira processar la compra")
    public void systemProcesShoppingCart() {
        Assert.assertTrue( validationsStep.orderTextIsDisplayed() );
    }

}
