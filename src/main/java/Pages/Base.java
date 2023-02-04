package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    protected WebDriver driver;
    protected WebDriverWait wait;
    public Base(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void waitVisibility(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
