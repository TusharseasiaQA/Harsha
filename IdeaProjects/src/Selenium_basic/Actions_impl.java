package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_impl {


    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@name='Submit' and @class='button']")).click();

        WebElement w= driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
        WebElement x= driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
        WebElement y= driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
       //mousehover action
        act.moveToElement(w).moveToElement(x).click(y).build().perform();
        WebElement a= driver.findElement(By.id("searchSystemUser_userName"));
        act.click(a).keyDown(Keys.SHIFT).sendKeys("HArsha").build().perform();//build().perform();
        //WebElement b= driver.findElement(By.id('searchSystemUser_userType'));

        //act.click(a).keyDown(Keys.SHIFT).sendKeys("HArsha").build().perform();
    }
}