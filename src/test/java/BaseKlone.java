import Common.BasicSetting;
import Pages.Base;
import Pages.MainPage;
import Pages.SignInAccount;
import org.openqa.selenium.WebDriver;

public class BaseKlone {
    protected WebDriver driver = BasicSetting.createDriver();
    protected Base BaseT = new Base(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected SignInAccount signInAccount = new SignInAccount(driver);
}
