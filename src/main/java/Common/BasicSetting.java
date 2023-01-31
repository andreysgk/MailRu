package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BasicSetting {
    public static WebDriver createDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\raphi\\browsers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}
