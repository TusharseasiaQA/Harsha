package Selenium_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Drop_down {

             public static void main(String[] args) throws InterruptedException {

                 System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
                 WebDriver driver=new ChromeDriver();
                 driver.get("https://www.opencart.com/index.php?route=account/register");
                 driver.manage().window().maximize();

                 Thread.sleep(3000);
                 Select drpCountry = new Select(driver.findElement(By.id("input-country")));
                 //drpCountry.selectByVisibleText("Cuba");
                 //drpCountry.selectByIndex(1);
                 drpCountry.selectByValue("5");
                //Selectiong an option without using above methods
                 List<WebElement> all_Options= drpCountry.getOptions();
                         for(WebElement option:all_Options)
                 {
                     if(option.getText().equals("Cuba"))
                     {
                         option.click();
                     }
                 }
                         System.out.println("Size of drop down "+ all_Options.size());
                 /*

                 //Selecting Items in a Multiple SELECT elements
                 driver.get("http://jsbin.com/osebed/2");
                 Select fruits = new Select(driver.findElement(By.id("fruits")));
                 fruits.selectByVisibleText("Banana");
                 fruits.selectByIndex(1);
*/
             }

         }

