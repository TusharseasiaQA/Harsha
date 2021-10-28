package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class close_quit {


        public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
            FirefoxDriver d = new FirefoxDriver();
            d.get("http://omayo.blogspot.com/");
            d.findElement(By.linkText("Open a popup window")).click();
            //d.close();
            d.quit();
        }
    }

