package Pages;

import common.Application;
import common.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.MainSteps;

import java.io.File;
import java.io.IOException;

//class with main page methods
public class Page {

    private static int periodElementWait = Integer.parseInt(Application.getProperty("periodLoadWait"));

    public static void waitWhileElemIsVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(MainSteps.getDriver(), periodElementWait);
        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

    //returns absolute path to file
    public static String getAbsolutePath(String path) throws IOException {
            return new File("src/test/resources/data/" + path).getCanonicalPath();
    }



}
