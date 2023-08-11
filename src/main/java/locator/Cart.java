package locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
    public static WebDriver driver;

    public Cart(WebDriver driver){
        PageFactory.initElements(driver, this);
        Cart.driver = driver;
    }

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    private WebElement laptop;

    @FindBy(css = ".btn-success")
    private WebElement btn;

    @FindBy(xpath = "//a[.='Cart']")
    private WebElement cart;

    @FindBy(css = ".btn-success")
    private WebElement success;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "card")
    private WebElement card;

    @FindBy(xpath = "//button[.='Purchase']")
    private WebElement btnPurchase;

    @FindBy(css = ".confirm")
    private WebElement confirm;

    public void setLaptop(){
        laptop.click();
    }

    public void setBtn(){
        btn.click();
    }

    public void alert(){
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    public void setCart(){
        cart.click();
    }

    public void setSuccess(){
        success.click();
    }

    public boolean setSuccess2(){
        return success.isEnabled();
    }

    public void setName(String nama){
        name.sendKeys(nama);
    }

    public void setCard(String credit){
        card.sendKeys(credit);
    }

    public void setBtnPurchase(){
        btnPurchase.click();
    }

    public void setConfirm(){
        confirm.click();
    }
}