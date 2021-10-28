/*package Selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Windows_ex2 {
    public static void main(String args[])
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".blinkingText")).click();
		Thread.sleep(3000);


    Set<String>wb = driver.getWindowHandles();                //Set is an interface//
    Iterator<String>it = wb.iterator();                       //Iterator is an interface//
    String pid = it.next();
    String cid = it.next();
		driver.switchTo().window(cid);
		Thread.sleep(3000);
*/
  /*  String gt = driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(gt);
    String emailid = gt.split("at")[1].trim().split(" ")[0];
		System.out.println(emailid);

		driver.switchTo().window(pid);

		driver.findElement(By.id("username")).sendKeys(emailid);
		Thread.sleep(3000);
}*/
