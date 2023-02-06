import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMailRu extends BaseTest {
    @Test
    public void moveMessageToDraft(){
        pageManager.mainPageTest.enterButtonMain();
        pageManager.loginPageTest.iframeLoginPage()
                .usernameLoginPage("kiril1batsilev@mail.ru")
                .nextButtonClick()
                .passwordLoginPage("karabas22barabas")
                .signInButtonLoginPage();
        pageManager.incomingMessagesPageTest.closeCalendar()
                .sendMessageToDraft()
                .clickDraftButton();
        Assertions.assertEquals("Cat",pageManager.draftPageTest.listSubject(0));


    }
}
