package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Login;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private static WebDriver webDriver;

    public LoginSteps(){
        super();
        webDriver = Hooks.webDriver;
    }

    @Given("User already on product store web")
    public void userAlreadyOnProductStoreWeb() {
        Login login = new Login(webDriver);
        Assert.assertTrue(login.setNavbar());
    }

    @When("User input {string} as username and {string} as password on login menu")
    public void userInputAsUsernameAndAsPassword(String user, String pass) throws InterruptedException {
        Login login = new Login(webDriver);
        login.setBtnLogin();
        Thread.sleep(2000);
        login.setLogin(user);
        login.setPass(pass);
    }

    @And("Click login button")
    public void clickLoginButton() throws InterruptedException {
        Login login = new Login(webDriver);
        login.setBtn();
        Thread.sleep(3000);
    }

    @Then("User already login on product store web")
    public void userAlreadyLoginOnProductStoreWeb() {
        Login login = new Login(webDriver);
        Assert.assertTrue(login.setUser());
    }

//    Negative
    @Then("Displays an alert")
    public void displaysAnErrorAlert() throws InterruptedException {
        Login login = new Login(webDriver);
        Thread.sleep(3000);
        login.alert();
        Thread.sleep(3000);
    }
}
