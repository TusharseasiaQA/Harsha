package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Switching_Windows {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        //System.out.println(driver.getTitle());
        Set<String> s=driver.getWindowHandles();//return ids of all the windows opened
        //Set consists of multiple values of type string
        for(String i:s)
        {
            System.out.println(i);
            String t=driver.switchTo().window(i).getTitle();
            System.out.println(t);
            if(t.contains("Frames & windows"))
            {
                driver.close();
            }
        }
    }
}