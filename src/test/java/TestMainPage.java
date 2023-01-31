import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMainPage extends BaseKlone{
    @BeforeEach
    public void urlMain(){
        driver.get("https://mail.ru/");
    }
    @Test
    public void moveMessageToDraft() throws InterruptedException {
        mainPageTest.enterButtonMain();
        loginPageTest
                .iframeLoginPage()
                .usernameLoginPage("kiril1batsilev@mail.ru")
                .signInButtonLoginPage()
                .passwordLoginPage("karabas22barabas")
                .signInButtonLoginPage();
        driver.get("https://e.mail.ru/inbox/");
        Thread.sleep(5000);
        incomingMessagesPageTest.moveMessage(0,8);
    }
}
