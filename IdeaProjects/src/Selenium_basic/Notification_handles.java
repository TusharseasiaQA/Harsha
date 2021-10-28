package Selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Notification_handles
{
    public static void main(String[] args) throws Exception {
        ChromeOptions opt=new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
        //opt.addArguments("--disable-notifications");
        //open firefox and type "about:config" to get options for firefox
        Map < String, Object > contentSettings = new HashMap< String, Object > ();
        Map < String, Object > profile = new HashMap < String, Object > ();
        Map< String, Object > prefs = new HashMap< String, Object >();
        contentSettings.put("notifications", 1);//0-ask,1-enable,2-block, geolocation for location
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        opt.setExperimentalOption("prefs",prefs);
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.irctc.co.in/nget/train-search");


        driver.manage().window().maximize();

        //Thread.sleep(10000);
        //driver.switchTo().alert().accept();
        //System.out.println("completed");

    }
}

