package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    private static WebDriver driver;

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

//}
//
//
//    private static final ThreadLocal<WebDriver> driverHolder = new ThreadLocal<>();
//
//    public static WebDriver getDriver() {
//        return driverHolder.get();
//    }
//
//    public static void setWebDriver(WebDriver value) {
//        driverHolder.set(value);
//    }
//}