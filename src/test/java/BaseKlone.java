import Common.BasicSetting;
import Pages.Base;
import Pages.IncomingMessagesPage;
import Pages.MainPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BaseKlone {
    protected WebDriver driver = BasicSetting.createDriver();
    protected Base BaseT = new Base(driver);
    protected MainPage mainPageTest = new MainPage(driver);
    protected LoginPage loginPageTest = new LoginPage(driver);
    protected IncomingMessagesPage incomingMessagesPageTest = new IncomingMessagesPage(driver);
}
