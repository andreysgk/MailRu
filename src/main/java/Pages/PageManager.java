package Pages;

import org.openqa.selenium.WebDriver;

public class PageManager {
    public MainPage mainPageTest;
    public LoginPage loginPageTest;
    public IncomingMessagesPage incomingMessagesPageTest;
    public DraftPage draftPageTest;
    public PageManager(WebDriver driver){
        mainPageTest = new MainPage(driver);
        loginPageTest = new LoginPage(driver);
        incomingMessagesPageTest = new IncomingMessagesPage(driver);
        draftPageTest = new DraftPage(driver);
    }
}
