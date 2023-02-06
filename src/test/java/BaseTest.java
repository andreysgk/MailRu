import Pages.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    PageManager pageManager;
    String urlToTest = "https://mail.ru/";

    @BeforeAll
    public static void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raphi\\browsers\\chromedriver.exe");
    }
    @BeforeEach
    public void urlMain(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(urlToTest);
        pageManager = new PageManager(driver);
    }

  /*  @AfterEach
    public void close(){
        driver.close();
    }*/


}
