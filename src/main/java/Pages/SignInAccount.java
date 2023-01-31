package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInAccount extends Base{
    public SignInAccount(WebDriver driver) {
        super(driver);
    }
    private final By userName = By.xpath("//div[@class='login-row username']//input[@name='username']");
     private final By enterPasswordButton = By.xpath("//div[@class='login-row']//button[@type='submit']/span");
     private final By iframe = By.xpath("//iframe[@class='iframe-0-2-16']");

     public SignInAccount ifrm(){
         WebElement Iframe = driver.findElement(iframe);
         driver.switchTo().frame(Iframe);
         return this;
     }

    public SignInAccount nameUser(String name){
        driver.findElement(userName).sendKeys(name);
        return this;
    }
    public SignInAccount enterBUtton(){
        driver.findElement(enterPasswordButton).click();
        return this;
    }
}
