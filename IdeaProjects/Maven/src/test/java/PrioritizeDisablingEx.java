import org.testng.annotations.Test;

public class PrioritizeDisablingEx {
    @Test(priority = 1,enabled=false)
    void setup()
    {
        System.out.println("Opening browser");
       // Assert.fail();
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("Closing a browser");
    }
}
