package flow;

import pages.yandexPages.YandexDownLoadPicturePage;
import pages.yandexPages.YandexHomePage;
import pages.yandexPages.YandexPicturesLinkPage;
import org.openqa.selenium.support.PageFactory;
import steps.Driver;

import java.io.IOException;

public class YandexFlow {
    private static YandexHomePage yandexHomePage = PageFactory.initElements(
            Driver.getDriver(), YandexHomePage.class
    );

    private static YandexPicturesLinkPage yandexPicturesPage= PageFactory.initElements(
            Driver.getDriver(), YandexPicturesLinkPage.class
    );

    private static YandexDownLoadPicturePage downLoadPicturePage= PageFactory.initElements(
            Driver.getDriver(), YandexDownLoadPicturePage.class
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
