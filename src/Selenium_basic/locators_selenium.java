package Selenium_basic;


     import org.openqa.selenium.By;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class locators_selenium {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
        FirefoxDriver d = new FirefoxDriver();
        d.get("http:\\www.google.com");
        d.manage().window().maximize();
        Thread.sleep(1000L);
        d.findElement(By.linkText("Gmail")).click();
        Thread.sleep(1000L);
        d.findElement(By.className("laptop-desktop-only")).click();
        Thread.sleep(1000L);
        d.findElement(By.id("firstName")).sendKeys(new CharSequence[]{"Harsha"});
        d.findElement(By.id("lastName")).sendKeys(new CharSequence[]{"Kapila"});
        d.findElement(By.className("whsOnd zHQkBf")).sendKeys("harshakapila");//not working
        d.findElement(By.className("VfPpkd-vQzf8d")).click();

    }
}
