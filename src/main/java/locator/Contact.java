package locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
    public static WebDriver driver;

    public Contact(WebDriver driver){
        PageFactory.initElements(driver, this);
        Contact.driver = driver;
    }

    @FindBy(xpath = "//a[.='Contact']")
    private WebElement btn;

    @FindBy(id = "recipient-email")
    private WebElement email;

    @FindBy(id = "recipient-name")
    private WebElement name;

    @FindBy(id = "message-text")
    private WebElement text;

    @FindBy(xpath = "//button[.='Send message']")
    private WebElement message;

    public void setBtn(){
        btn.click();
    }

    public void setEmail(String mail){
        email.sendKeys(mail);
    }

    public void setName(String recipi){
        name.sendKeys(recipi);
    }

    public void setText(String message){
        text.sendKeys(message);
    }

    public void setMessage(){
        message.click();
    }

    public String alert(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
}