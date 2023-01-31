package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By usernameFieldLocator = By.xpath("//div[@class='login-row username']//input[@name='username']");
    private final By signInButtonLocator = By.xpath("//div[@class='login-row']//button[@type='submit']/span");
    private final By iframeLocator = By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']");
    private final By passwordFieldLocator = By.xpath("//div[@class='login-row password']//input[@type='password']");




     public LoginPage iframeLoginPage(){
         WebElement element = driver.findElement(iframeLocator);
         driver.switchTo().frame(element);
         return this;
     }

    public LoginPage usernameLoginPage(String name){
        driver.findElement(usernameFieldLocator).sendKeys(name);
        return this;
    }
    public LoginPage signInButtonLoginPage(){
        driver.findElement(signInButtonLocator).click();
        return this;
    }
    public LoginPage passwordLoginPage(String password){
         driver.findElement(passwordFieldLocator).sendKeys(password);
         return this;
    }
}
