package Pages.YandexPages;

import Pages.Page;
import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.MainSteps;

//yandex home page
public class YandexHomePage extends Page {

    @FindBy(xpath = "//a[text() = 'Сделать стартовой']")
    public WebElement ensurePageLoadedElement;

    public void ensurePageOpen() {
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }

    public void openServicesLink(String link) {
        WebElement linkElement = MainSteps.getDriver().findElement(By.xpath("//div[contains(@class , services-new__item-title)][text() = '"+link+"']"));
        linkElement.click();
    }
}
