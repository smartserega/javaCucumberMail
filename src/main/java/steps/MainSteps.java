package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSteps {

    private static WebDriver driver;

    @Before
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void tearDown() {
        if (getDriver() != null) {
            driver.quit();
        }
    }
}
//
//
//    @Before
//    public void setUpBrowser() {
//        //     WebDriverFactory webDriverFactory = new WebDriverFactory();
////        WebDriverFactory.setDriver();
////        webdriver.set(WebDriverFactory.getDriver());
//
//        if (webdriver.get() == null) {
//            WebDriverFactory.setDriver();;
//        }
//    }
//
//    @After
//    public void after() {
//        if (webdriver.get() == null) {
//            webdriver.remove();
//        }
//    }
//
//}

