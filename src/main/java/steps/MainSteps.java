package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;

import java.io.IOException;

public class MainSteps {

    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();


    @Before
    public void setUp() {
        if (DRIVER.get() == null) {
            WebDriverManager.chromedriver().setup();
            DRIVER.set(new ChromeDriver());
        }
    }

    public static WebDriver getDriver(){
        return DRIVER.get();
    }

    @After
    public void tearDown() {
        if (DRIVER.get() != null) {
            DRIVER.remove();
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

