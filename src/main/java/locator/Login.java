package locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public static WebDriver driver;

    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
        Login.driver = driver;
    }

    @FindBy(id = "nava")
    private WebElement navbar;

    @FindBy(xpath = "//a[.='Log in']")
    private WebElement btnLogin;

    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement pass;

    @FindBy(xpath = "//button[.='Log in']")
    private WebElement btn;

    @FindBy(id = "nameofuser")
    private WebElement user;

    public boolean setNavbar(){
        navbar.isDisplayed();
        return true;
    }

    public void setBtnLogin(){
        btnLogin.click();
    }

    public void setLogin(String lgn){
        login.sendKeys(lgn);
    }

    public void setPass(String pas){
        pass.sendKeys(pas);
    }

    public void setBtn(){
        btn.click();
    }

    public boolean setUser(){
        user.isDisplayed();
        return true;
    }

    public void alert(){
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
}