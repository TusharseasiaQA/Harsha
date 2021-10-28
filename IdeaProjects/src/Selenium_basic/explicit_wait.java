package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class explicit_wait {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://avibra1.qa.hellolori.com/info");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String S =driver.findElement(By.xpath("//h1[text()='Avibra Basic Device Care (test)']")).getText();
        System.out.println(S);
        //explicit wait is element specific
        //it waits for a particular element unlike implicit wait which waits for all the elements
        //WebDriverWait wait= new WebDriverWait(driver,5);
        //String s=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Avibra Basic Device Care (test)']"))).getText();
        //System.out.println(s);


}}
