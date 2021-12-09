package stepDefination_N;

import Pageobject_N.LoginPage;
import hooks_N.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import util.Prop_Utils;

import java.io.IOException;

public class LoginDefination {
    LoginPage loginPage;
    public WebDriver driver;
    //Prop_Utils prop;

    @Given("^User is on login page$")
    public void userIsOnLoginPage() throws IOException
    {
        //System.out.println(Prop_Utils.get_Property("Browser"));
        driver= BaseClass.getDriver();
        driver.get(Prop_Utils.get_Property("url"));
        driver.manage().window().maximize();
        //BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage();

    }

    @When("^User fill valid credentials and click on login button$")
    public void userFillValidCredentialsAndClickOnLoginButton() throws IOException {
        loginPage.enterUsernameInTextField(Prop_Utils.get_Property("username"));
        loginPage.enterPasswordInTextField(Prop_Utils.get_Property("Password"));
        loginPage.clickOnLoginBtn();
    }

    @Then("^Verify user is logged in$")
    public void verifyUserIsLoggedIn() throws IOException {
        String expectedWelcomeText = Prop_Utils.get_Property("WelcomeText");
        Assert.assertTrue(loginPage.getWelcomeText().contains(expectedWelcomeText));
    }


    @When("^User fill username as \"([^\"]*)\" and password as \"([^\"]*)\" and click on login button$")
    public void userFillUsernameAsAndPasswordAsAndClickOnLoginButton(String username, String password) {
        loginPage.enterUsernameInTextField(username);
        loginPage.enterPasswordInTextField(password);
        loginPage.clickOnLoginBtn();
    }

    @Then("^Verify the error message \"([^\"]*)\"$")
    public void verifyTheErrorMessage(String expectedErrorMessage) {
        Assert.assertEquals("Test Failed", expectedErrorMessage, loginPage.getErrorMessage());

    }
}
