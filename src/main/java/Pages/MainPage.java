package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Base{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By enterButton = By.xpath("//div[@data-testid='mailbox']//button");

    public MainPage enterButtonMain(){
        driver.findElement(enterButton).click();
        return this;
    }
}
