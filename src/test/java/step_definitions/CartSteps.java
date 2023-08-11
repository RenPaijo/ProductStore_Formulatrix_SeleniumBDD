package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.Cart;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click the item to be purchased for the example Sony vaio i5")
    public void clickOneOfThem() throws InterruptedException {
        Cart cart = new Cart(webDriver);
        cart.setLaptop();
        Thread.sleep(3000);
    }

    @Then("add to cart")
    public void addToCart() throws InterruptedException {
        Cart cart = new Cart(webDriver);
        cart.setBtn();
        Thread.sleep(2000);
        cart.alert();
        Thread.sleep(2000);
    }

    @And("Go to cart page")
    public void goToCartPage() {
        Cart cart = new Cart(webDriver);
        cart.setCart();
    }

    @And("Place order")
    public void placeOrder() throws InterruptedException {
        Cart cart = new Cart(webDriver);
        cart.setSuccess();
        Thread.sleep(1000);
    }

    @Then("Proceed to payment, {string} as name and {string} as credit card")
    public void proceedToPaymentAsNameAndAsCard(String name, String card) throws InterruptedException {
        Cart cart = new Cart(webDriver);
        cart.setName(name);
        cart.setCard(card);
        cart.setBtnPurchase();
        Thread.sleep(2000);
    }

    @Then("Confirm the purchase")
    public void confirmThePurchase() {
        Cart cart = new Cart(webDriver);
        cart.setConfirm();
    }

    @Then("Place order button should be disabled")
    public void placeOrderButtonShouldBeDisabled() {
        Cart cart = new Cart(webDriver);
        Assert.assertFalse(cart.setSuccess2());
    }
}
