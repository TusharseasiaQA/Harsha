package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginPage {
    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
//here we are initializing elements of rdriver

    }
//    @FindBy(id = "Email")//Syntax 1
//    @CacheLookup
//    WebElement textEmail;
    @FindBy(how= How.ID,using="Email")//syntax 2
    WebElement textEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement textPassword;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath = "//a[@class='nav-link']")
    @CacheLookup
    WebElement lnkLogout;

    public void setUserName(String uname)
    {
        textEmail.clear();
        textEmail.sendKeys(uname);
    }
    public void setTextPassword(String pwd)
    {
        textPassword.clear();
        textPassword.sendKeys(pwd);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }
    public void clickLogout()
    {
        lnkLogout.click();
    }


}
