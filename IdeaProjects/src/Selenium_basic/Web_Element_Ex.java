package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Web_Element_Ex {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.opencart.com/index.php?route=account/register");
            driver.manage().window().maximize();
            Select drpCountry = new Select(driver.findElement(By.id("input-country")));

            //Selectiong an option without using above methods
            List<WebElement> all_Options= drpCountry.getOptions();
            /*for(WebElement option:all_Options)
            {


                    System.out.println(option.getText());

            }*/
            for(int i=0;i<all_Options.size();i++)
            {


                System.out.println(all_Options.get(i).getText());

            }

            System.out.println("Size of drop down "+ all_Options.size());
        }

    }



