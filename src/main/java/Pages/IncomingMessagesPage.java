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
    private final By writeMessageLocator = By.xpath("//span[@class='compose-button__txt']");
    private final By closeCalendarLocator = By.xpath("//*[@id=\"ph-whiteline\"]/div/div[1]/div[1]/div/a/div[3]/div");
    private final By subjectMessageLocator = By.xpath("//input[@name='Subject']");
    private final By saveButtonLocator = By.xpath("//span[text()='Сохранить']");
    private final By closeWindowWriteMessageLocator = By.xpath("//button[@title='Закрыть']");
    public IncomingMessagesPage moveMessage(int numberMessage, int cellNumberLeftPanel){
        waitVisibility(listMessagesLocator);
        List<WebElement> list = driver.findElements(listMessagesLocator);
        WebElement first = list.get(numberMessage);
        waitVisibility(listLeftPanelLocator);
        List<WebElement> list2 = driver.findElements(listLeftPanelLocator);
        WebElement second = list2.get(cellNumberLeftPanel);
        new Actions(driver)
                .dragAndDrop(first,second)
                .perform();
        return this;
    }

    public IncomingMessagesPage clickDraftButton(){
        waitVisibility(draftButtonLocator);
        driver.findElement(draftButtonLocator).click();
        return this;
    }
    public IncomingMessagesPage closeCalendar(){
        waitVisibility(writeMessageLocator);
        driver.findElement(closeCalendarLocator).click();
        return this;
    }
    public IncomingMessagesPage clickWriteLetterButton(){
        waitVisibility(writeMessageLocator);
        driver.findElement(writeMessageLocator).click();
        return this;
    }
    public IncomingMessagesPage subjectMessage(String subject){
        waitVisibility(subjectMessageLocator);
        driver.findElement(subjectMessageLocator).sendKeys(subject);
        return this;
    }
    public IncomingMessagesPage clickSaveButton(){
        waitVisibility(saveButtonLocator);
        driver.findElement(saveButtonLocator).click();
        return this;
    }
    public IncomingMessagesPage closeWindowWriteLesson(){
        waitVisibility(closeWindowWriteMessageLocator);
        driver.findElement(closeWindowWriteMessageLocator).click();
        return this;
    }
    public IncomingMessagesPage sendMessageToDraft(){
        clickWriteLetterButton();
        subjectMessage("Cat");
        clickSaveButton();
        closeWindowWriteLesson();
        return this;
    }


}
