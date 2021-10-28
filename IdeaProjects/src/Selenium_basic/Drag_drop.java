package Selenium_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {


    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        Actions act= new Actions(driver);
        WebElement src= driver.findElement(By.id("box1"));
        WebElement dest= driver.findElement(By.id("box101"));
        act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
        //act.dragAndDrop(src,dest).build().perform();
//source box1    dest box101
    }
}