package step_definitions;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Contact;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ContactSteps {
    private WebDriver webDriver;

    public ContactSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as Contact email {string} as Contact name and {string} as message")
    public void userInputAsContactEmailAsContactNameAndAsMessage(String email, String name, String message) throws InterruptedException {
        Contact contact = new Contact(webDriver);
        contact.setBtn();
        Thread.sleep(3000);
        contact.setEmail(email);
        contact.setName(name);
        contact.setText(message);
    }

    @And("Click send message button")
    public void clickSendMessageButton() {
        Contact contact = new Contact(webDriver);
        contact.setMessage();
    }

    @Then("Displays an alert that {string}")
    public void displaysAnAlertThat(String alert) throws InterruptedException {
        Thread.sleep(3000);
        Contact contact = new Contact(webDriver);
        Assert.assertEquals(alert, contact.alert());
    }
}
