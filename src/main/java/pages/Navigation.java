package pages;

import steps.Driver;

import java.util.ArrayList;

public class Navigation extends Page {

    public static void navigateToUrl(String url) {
        Driver.getDriver().navigate().to(url);
    }

    public static void switchToBrowserLink(int index) {
        ArrayList<String> tabs_windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs_windows.get(index));
    }
}
