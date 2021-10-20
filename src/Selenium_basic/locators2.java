package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\www.rediffmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
        //driver.findElement(By.linkText("Create Account")).click();
        //driver.findElement(By.cssSelector("a[title='Create Rediffmail Account']")).click();
       driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("harsha");
        //driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("harsha");
        driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("harsha.kapila");
        //driver.findElement(By.xpath("//input[containts(@name,'btnchkavail')]")).click();
        driver.findElement(By.xpath("//input[@value='Check availability']")).click();

    }
}
