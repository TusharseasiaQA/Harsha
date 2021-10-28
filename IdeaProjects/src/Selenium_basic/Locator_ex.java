package Selenium_basic;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class Locator_ex {
        public Locator_ex() {
        }

        public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
            FirefoxDriver d = new FirefoxDriver();
            d.get("http:\\www.gmail.com");
            d.manage().window().maximize();
            d.findElement(By.id("identifierId")).sendKeys("harshakapila87@gmail.com");
            d.findElement(By.id("identifierNext")).click();
        }
    }


