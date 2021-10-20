package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class css {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
        // using tagname and attribute
        //driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
        //driver.findElement(By.cssSelector("*[name='txtPassword']")).sendKeys("admin123");//* can be used if tagname is not known
        //driver.findElement(By.cssSelector("[class='button']")).click();// tagname is optional and can be omitted
        //using # for id attribute
        driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("*[name='txtPassword']")).sendKeys("admin123");
        //using . for class attribute
        driver.findElement(By.cssSelector("input.button")).click();//By.cssSelector(".button")) both ways are correct, same with #
        //$ is used to enter any suffix of the word to match the particular attribute value
        driver.findElement(By.cssSelector("a[id$='viewMyDetails']")).click();
        //^ is used to enter any prefix of the word to match the particular attribute value
        driver.findElement(By.cssSelector("input[id^='btn']")).click();
        //here div is the parent node and input is the child node...we can traverse from parent to child
        driver.findElement(By.cssSelector("div input[name='personal[txtEmpFirstName]']")).clear();
        driver.findElement(By.cssSelector("li>input[name='personal[txtEmpFirstName]']")).sendKeys("rahil");

        //* is used to match any substring
        driver.findElement(By.cssSelector("input[name*='txtEmpMiddleName']")).clear();
        driver.findElement(By.cssSelector("input[name*='txtEmpMiddleName']")).sendKeys("Marwah");


    }
}
