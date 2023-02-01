import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMailRu extends BaseKlone{
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
        Thread.sleep(8000);
        incomingMessagesPageTest.clickDraftButton();
        if (draftPageTest.numberOfMessageInDraft()>0){
            Assertions.assertTrue(true);
            System.out.println("the draft isn't empty ");
        }
        else{
            Assertions.assertFalse(false);
            System.out.println("the draft is empty");
        }
    }
}
