package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class IncomingMessagesPage extends Base{
    public IncomingMessagesPage(WebDriver driver) {
        super(driver);
    }
    private final By listMessagesLocator = By.xpath("//div[@class='llc__content']");
    private final By listLeftPanelLocator = By.xpath("//div[@class='nav__folder-name nav__folder-name_shared']");
    private final By draftButtonLocator = By.xpath("//div[text()='Черновики']");

    public IncomingMessagesPage moveMessage(int numberMessage, int cellNumberLeftPanel){
        List<WebElement> list = driver.findElements(listMessagesLocator);
        WebElement first = list.get(numberMessage);
        List<WebElement> list2 = driver.findElements(listLeftPanelLocator);
        WebElement second = list2.get(cellNumberLeftPanel);
        new Actions(driver)
                .dragAndDrop(first,second)
                .perform();
        return this;
    }
    public IncomingMessagesPage clickDraftButton(){
        driver.findElement(draftButtonLocator).click();
        return this;
    }
}
