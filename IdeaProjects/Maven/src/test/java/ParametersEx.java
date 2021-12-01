import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {


    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "URL"})
    void setup(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

        }
        driver.get(app);
        driver.manage().window().maximize();


    }

    @Test
    void logoTest() {
        WebElement el = driver.findElement(By.xpath("//div[@id='divLogo']"));
        Assert.assertTrue(el.isDisplayed(), "logo not displayed");
        //Assert.assertFalse(el.isDisplayed(),"logo not displayed");
    }

    @Test
    void titleTest() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    void teardown() {
        driver.quit();
    }


}
