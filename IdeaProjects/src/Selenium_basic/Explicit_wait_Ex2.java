package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//explicit wait is element specific,it waits for a particular element unlike implicit wait which waits for all the elements
public class Explicit_wait_Ex2 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://avibra1.qa.hellolori.com/info");
        driver.manage().window().maximize();
        WebElement W=Waitforelement( driver,By.xpath("//h1[text()='Avibra Basic Device Care (test)']"),10);
        String s = W.getText();
        System.out.println(s);
    }
    public static WebElement Waitforelement(WebDriver driver, By locator, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement w=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return w;

    }
}
