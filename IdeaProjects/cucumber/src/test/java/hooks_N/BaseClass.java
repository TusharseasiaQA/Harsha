package hooks_N;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.Prop_Utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static WebDriver driver;
    static String flag= "false";
    public static final String username = "oauth-harshakapila87-78ef4";
    public static final String Access_Key = "57031830-a1e3-48b1-9717-43e6180c5dff";
    public static final String url = "https://oauth-harshakapila87-78ef4:57031830-a1e3-48b1-9717-43e6180c5dff@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    static  DesiredCapabilities capabilities= new DesiredCapabilities();
@Before
    //before every scenario it runs
    public static void setDriver() throws IOException {
        if (flag.equalsIgnoreCase("true"))
        {
            switch (Prop_Utils.get_Property("Browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("\nEnter valid browser from the list : chrome,firefox,edge");
                    break;
            }


        }
        else
            {
            capabilities.setCapability("BrowserName", "Chrome");
            capabilities.setCapability("version", "85");
            capabilities.setCapability("platform", "windows 7");
            System.out.println(capabilities);
            driver = new RemoteWebDriver(new URL(url), capabilities);
        }

    }

    public static WebDriver getDriver()
    {
        return driver;
    }


    @After
    //after every scenaRIO
    public void tearDown() {
        driver.close();
    }

}
