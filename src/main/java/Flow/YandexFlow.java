package Flow;

import Pages.YandexPages.YandexDownLoadPicturePage;
import Pages.YandexPages.YandexHomePage;
import Pages.YandexPages.YandexPicturesLinkPage;
import common.WebDriverFactory;
import org.openqa.selenium.support.PageFactory;
import steps.MainSteps;

import java.io.IOException;

public class YandexFlow {
    private static YandexHomePage yandexHomePage = PageFactory.initElements(
            MainSteps.getDriver(), YandexHomePage.class
    );

    private static YandexPicturesLinkPage yandexPicturesPage= PageFactory.initElements(
            MainSteps.getDriver(), YandexPicturesLinkPage.class
    );

    private static YandexDownLoadPicturePage downLoadPicturePage= PageFactory.initElements(
            MainSteps.getDriver(), YandexDownLoadPicturePage.class
    );

    public static void openServicesLink(String link) {
        yandexHomePage.ensurePageOpen();
        yandexHomePage.openServicesLink(link);
    }

    public static void downloadPicture(String path) throws IOException {
        yandexPicturesPage.ensurePageLoaded();
        yandexPicturesPage.clickOnDownloadButton();
        downLoadPicturePage.ensurePageOpen();
        downLoadPicturePage.downloadFile(path);
    }

    public static void verifyPictureIs(String pictureName, String state) {
        yandexPicturesPage.verifyPictureIs(pictureName, state);
    }
}
