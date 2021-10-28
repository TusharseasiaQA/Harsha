package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Fluent_wait {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\www.google.com");
        driver.manage().window().maximize();
        //fluent wait declaration
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(5));
        wait.ignoring(Exception.class);

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        //driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
        //usage of fluent wait
        /*WebElement W=wait.until(Function<WebDriver,WebElement>)
        {
            public WebElement apply(WebDriver driver)
            {
                return driver.findElement(By.xpath("//h3[text()='Selenium']"));
            }
        }

    }*/
    }
    }
