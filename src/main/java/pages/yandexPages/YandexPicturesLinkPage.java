package pages.yandexPages;

import pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.Driver;

//pictures link
public class YandexPicturesLinkPage extends Page {

    @FindBy(xpath = "//div[@class = 'input__cbir-button input__button']")
    public WebElement ensurePageLoaded;

    @FindBy(xpath = "//div[@class = 'input__cbir-button input__button']/button")
    public WebElement downloadByBictureButton;

    @FindBy(xpath = "//div[@class = 'CbirItem-Title'][text() = 'Кажется, на изображении']")
    public WebElement pictureResultsElement;

    public void ensurePageLoaded() {
        waitWhileElemIsVisible(ensurePageLoaded);
    }
    public void clickOnDownloadButton() {
        downloadByBictureButton.click();
    }

    public void verifyPictureIs(String pictureName, String state) {
        waitWhileElemIsVisible(pictureResultsElement);
        if(state.equals("present")){
            WebElement element = Driver.getDriver().findElement(By.xpath("//div[@class = 'CbirItem-Title'][text() = 'Кажется, на изображении']/..//span[contains(text(), '"+pictureName+"')]"));
            waitWhileElemIsVisible(element);
        } else {
            //negative test
        }
    }
}
