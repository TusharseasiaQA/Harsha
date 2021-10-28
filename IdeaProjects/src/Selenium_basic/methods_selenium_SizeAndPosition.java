package Selenium_basic;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



public class methods_selenium_SizeAndPosition {
     public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
            Dimension d = new Dimension(150, 200);
            driver.manage().window().setSize(d);
            Point p = new Point(200, 140);
            driver.manage().window().setPosition(p);
            System.out.println(driver.manage().window().getPosition());
            System.out.println(driver.manage().window().getSize());
            System.out.println(driver.getWindowHandle());
            System.out.println("hi");
            driver.close();
        }
    }


