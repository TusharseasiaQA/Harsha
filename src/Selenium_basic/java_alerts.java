package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class java_alerts {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
        FirefoxDriver d = new FirefoxDriver();
        d.get("https://the-internet.herokuapp.com/javascript_alerts");
        d.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Thread.sleep(2000);
        d.switchTo().alert().accept();
        d.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Thread.sleep(2000);
        System.out.println(d.switchTo().alert().getText());
        /*d.switchTo().alert().dismiss();
        d.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Thread.sleep(2000);
        d.switchTo().alert().sendKeys("hi");
        Thread.sleep(2000);
        d.switchTo().alert().accept();*/

    }
}

