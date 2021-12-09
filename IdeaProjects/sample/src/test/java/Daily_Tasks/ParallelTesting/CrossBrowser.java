package Daily_Tasks.ParallelTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowser {
    WebDriver driver;
    @Test
    void logotest()
    {
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");
         //driver.manage().window().maximize();
         WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
         Assert.assertTrue(logo.isDisplayed());
    }}
//    @Test
//    void HomePageTitleTest()
//    {
////        WebDriverManager.chromedriver().setup();
////        driver= new ChromeDriver();
////        driver.get("https://opensource-demo.orangehrmlive.com/");
//        //driver.manage().window().maximize();
//        WebDriverManager.edgedriver().setup();
//        driver= new EdgeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        String title= driver.getTitle();
//        Assert.assertEquals(title,"OrangeHRM");
//    }
    //@AfterMethod
    //void teardown()

      //  driver.quit();


