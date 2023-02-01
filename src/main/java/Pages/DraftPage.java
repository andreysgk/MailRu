package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DraftPage extends Base{
    public DraftPage(WebDriver driver) {
        super(driver);
    }
    private final By listDraftsLocator = By.xpath("//div[@class='llc__background']");

    public int numberOfMessageInDraft(){
        List<WebElement> list = driver.findElements(listDraftsLocator);
        int sizeDraft = list.size();
        return sizeDraft;

    }

}
