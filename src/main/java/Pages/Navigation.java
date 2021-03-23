package Pages;

import common.WebDriverFactory;
import steps.MainSteps;

import java.util.ArrayList;

//class with navigation metods
public class Navigation extends Page {

    public static void navigateToUrl(String url) {
        MainSteps.getDriver().navigate().to(url);
    }

    public static void switchToBrowserLink(int index) {
        ArrayList<String> tabs_windows = new ArrayList<String>(MainSteps.getDriver().getWindowHandles());
        MainSteps.getDriver().switchTo().window(tabs_windows.get(index));
    }
}
