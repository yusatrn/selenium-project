package base;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {
    static WebDriver webDriver=null;
    final static Logger logger = Logger.getLogger(BaseTest.class);

    @Before
    public void setUp(){
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
        EdgeOptions options= new EdgeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");

        setWebDriver(new EdgeDriver(options));
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
    }

    public static WebDriver getWebDriver() {
        return  webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver=webDriver;
    }
    public void tearDown(){
        getWebDriver().quit();
    }
}
