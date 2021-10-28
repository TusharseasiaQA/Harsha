package Selenium_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class Check_boxes {


        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();


            driver.get("https://itera-qa.azurewebsites.net/home/automation");
            driver.manage().window().maximize();

            Thread.sleep(3000);
            //1. Select specific checkbox
            //driver.findElement(By.id("monday")).click();
            //printing total num of checkboxes on page
            System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
            //ptinting total only days of week checkboxes
            System.out.println(driver.findElements(By.xpath("//*[@type='checkbox' and contains(@id,'day')]")).size());
            //selecting all the checkboxes
            List<WebElement> chkboxes=driver.findElements(By.xpath("//*[@type='checkbox' and contains(@id,'day')]"));
            /*for( int i=0;i<chkboxes.size();i++)
            {
                chkboxes.get(i).click();
            }*/
            //using for each
           /*for(WebElement chbox:chkboxes)
            {
                chbox.click();
            }*/
           //selecting multiple checkboxes: monday and sunday
            for(WebElement chbox:chkboxes)
            {
                if(chbox.getAttribute("id").equals("monday")||chbox.getAttribute("id").equals("sunday")) {
                    chbox.click();
                }
            }
            //To de-select the check box we will use same click method:
            chkboxes.get(0).click();

            // to sget the id attribute direct from the list we use this---chkboxes.get(1).getAttribute("id");


        }

    }





