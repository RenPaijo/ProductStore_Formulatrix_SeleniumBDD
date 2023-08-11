package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import locator.SignUp;
import org.openqa.selenium.WebDriver;

public class SignUpSteps {
    private WebDriver webDriver;

    public SignUpSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as username and {string} as password on sign up menu")
    public void userInputAsUsernameAndAsPasswordOnSignUpMenu(String user, String pass) throws InterruptedException {
        SignUp signUp = new SignUp(webDriver);
        signUp.setBtnSign();
        Thread.sleep(3000);
        signUp.setUser(user);
        signUp.setPass(pass);
    }

    @And("Click sign up button")
    public void clickSignUpButton() {
        SignUp signUp = new SignUp(webDriver);
        signUp.setBtn();
    }
}
