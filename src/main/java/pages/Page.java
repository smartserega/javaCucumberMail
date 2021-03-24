package pages;

import common.Application;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Driver;

import java.io.File;
import java.io.IOException;

public class Page {

    private static int periodElementWait = Integer.parseInt(Application.getProperty("periodLoadWait"));

    public static void waitWhileElemIsVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), periodElementWait);
        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

    //returns absolute path to file
    public static String getAbsolutePath(String path) throws IOException {
            return new File("src/test/resources/data/" + path).getCanonicalPath();
    }



}
