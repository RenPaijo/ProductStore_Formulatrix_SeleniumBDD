package locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
    public static WebDriver driver;

    public SignUp(WebDriver driver){
        PageFactory.initElements(driver, this);
        SignUp.driver = driver;
    }

    @FindBy(xpath = "//a[.='Sign up']")
    private WebElement btnSign;

    @FindBy(id = "sign-username")
    private WebElement user;

    @FindBy(id = "sign-password")
    private WebElement pass;

    @FindBy(xpath = "//button[.='Sign up']")
    private WebElement btn;

    @FindBy(xpath = "//div[@id='signInModal']//button[@class='btn btn-secondary']")
    private WebElement btnClose;

    public void setBtnSign(){
        btnSign.click();
    }

    public void setUser(String name){
        user.sendKeys(name);
    }

    public void setPass(String word){
        pass.sendKeys(word);
    }

    public void setBtn(){
        btn.click();
    }
}