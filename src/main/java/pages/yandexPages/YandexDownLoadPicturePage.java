package pages.yandexPages;

import pages.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class YandexDownLoadPicturePage extends Page {

    @FindBy(xpath = "//button[@class = 'cbir-panel__upload-link'][text() = 'Выберите файл']")
    public WebElement ensurePageLoadedElement;

    @FindBy(name = "upfile")
    public WebElement inputFileElement;

    public void ensurePageOpen() {
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }

    public  void downloadFile(String path) throws IOException {
        inputFileElement.sendKeys(getAbsolutePath(path));

    }
}
