package Selenium_basic;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

import java.io.File;
//import FileUtils.*;


public class Screenshot {
    public static void main(String[] args) throws Exception {


        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File src= screenshot.getScreenshotAs(OutputType.FILE);
        File dst= new File(".\\harsha\\Screenshot.png");

        FileUtils.copyFile(src, dst);
        driver.close();
    }
}