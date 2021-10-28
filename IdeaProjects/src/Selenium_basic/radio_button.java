package Selenium_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class radio_button {



        public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();

            driver.get("https://demo.nopcommerce.com/register");

            driver.manage().window().maximize();


            WebElement radio_male=driver.findElement(By.id("gender-male"));
            WebElement radiofemale=driver.findElement(By.id("gender-female"));


            System.out.println(radio_male.isDisplayed());
            System.out.println(radio_male.isEnabled());
            if(radiofemale.isSelected())
            {
                radio_male.click();
                System.out.println("male selected");
            }
            else
            {
                radiofemale.click();
                System.out.println("female selected");
            }

            //How many radio button is displayed on a page
            //we call the method size() to find the total number of radio button
//            System.out.println(driver.findElements(By.xpath("//*[@type='radio']")).size());
            System.out.println(driver.findElements(By.xpath("//*[@type='radio']")).size());

                       //How many radio button is displayed on a page of particular section
            //          System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());  //we call the method size() to find the total number of radio button


        }

    }

