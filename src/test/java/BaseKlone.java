import Common.BasicSetting;
import Pages.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public class BaseKlone {
    protected WebDriver driver = BasicSetting.createDriver();
    protected Base BaseT = new Base(driver);
    protected MainPage mainPageTest = new MainPage(driver);
    protected LoginPage loginPageTest = new LoginPage(driver);
    protected IncomingMessagesPage incomingMessagesPageTest = new IncomingMessagesPage(driver);
    protected DraftPage draftPageTest = new DraftPage(driver);

   /* @AfterEach
    public void closePage() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }*/



}
