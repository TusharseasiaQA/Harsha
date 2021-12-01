import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionEx {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
       // WebDriverManager.firefoxdriver().setup();
        //WebDriver driver= new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

    }
    @Test
    void logoTest()
    {
       WebElement el=driver.findElement(By.xpath("//div[@id='divLogo']"));
        Assert.assertTrue(el.isDisplayed(),"logo not displayed");
        //Assert.assertFalse(el.isDisplayed(),"logo not displayed");
    }
    @Test
    void titleTest()
    {
      Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

        @AfterClass
    void teardown()
    {
        driver.quit();
    }
}
