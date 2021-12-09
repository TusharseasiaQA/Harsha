import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Login_test {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        System.out.println(driver.getTitle());


    }
}
