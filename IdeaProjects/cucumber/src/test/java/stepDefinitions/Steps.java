package stepDefinitions;
import com.sun.deploy.security.SelectableSecurityManager;
import io.cucumber.java.nl.Stel;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import pageObjects.LoginPage;

public class Steps {
    WebDriver driver;
    public LoginPage lp;
    @Given("user launch Chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

       lp=new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String uname, String pwd) {
        lp.setUserName(uname);
        lp.setTextPassword(pwd);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        lp.clickLogin();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
//        if (driver.getPageSource().contains("Login was unsuccessful"))
//            driver.quit();
//        else
//        {
            if(driver.getTitle().equalsIgnoreCase(title))
            System.out.println("matched");
            else
                System.out.println("failed");
        }



    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        lp.clickLogout();
    }


    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }


}
