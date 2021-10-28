package Selenium_basic;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class xpath {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\opensource-demo.orangehrmlive.com");
        //locating using relative xpath
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        //locating using absolute xpath
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
        //Using "and"
         driver.findElement(By.xpath("//input[@name='Submit' and @class='button']")).click();
        //using "or"
      driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails' or @name= 'harhsa']")).click();
        //using contains
    driver.findElement(By.xpath("//input[ contains(@id,'btnS')]")).click();
        //using starts-with
        //driver.findElement(By.xpath("//input[ starts-with(@id,'btn')]")).click();
        driver.findElement(By.xpath("//input[ contains(@id,'btnS')]")).click();//it can be used dynamic situations
    }
}