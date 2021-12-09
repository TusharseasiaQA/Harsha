import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyAlwaysrun {
    @Test
    void start()
    {

        Assert.fail();
        System.out.println("Starting a car");
    }
    @Test(dependsOnMethods={"start"},alwaysRun=true)
    void Drive()
    {
        System.out.println("Driving a car");
    }
    @Test(dependsOnMethods={"Drive","start"})
    void stop()
    {
        System.out.println("Stoping a car");
    }
    @Test(dependsOnMethods={"stop"})
    void park()
    {
        System.out.println("Parking a car");
    }
}
