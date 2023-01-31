import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMainPage extends BaseKlone{
    @BeforeEach
    public void urlMain(){
        driver.get("https://mail.ru/");
    }
    @Test
    public void enterButtonnMain(){
        mainPage.enterButtonMain();
        signInAccount
                .ifrm()
                .enterBUtton();
    }
    @Test
    public void log(){
        mainPage.enterButtonMain();
        signInAccount
                .ifrm()
                .nameUser("sss");
    }
}
