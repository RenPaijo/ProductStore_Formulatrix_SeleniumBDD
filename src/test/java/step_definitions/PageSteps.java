package step_definitions;

import org.openqa.selenium.WebDriver;

public class PageSteps {
    private final WebDriver driver;

    public PageSteps(){
        super();
        this.driver = Hooks.webDriver;
    }
}
