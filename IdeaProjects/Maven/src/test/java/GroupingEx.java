import org.testng.annotations.Test;

public class GroupingEx {
    @Test(groups={"smoke"})
    void test1()
    {
        System.out.println("Running test1");
    }
    @Test(groups={"smoke"})
    void test2()
    {
        System.out.println("Running test2");
    }
    @Test(groups={"smoke"})
    void test3()
    {
        System.out.println("Running test3");
    }
    @Test(groups={"regression"})
    void test4()
    {
        System.out.println("Running test4");
    }
    @Test(groups={"regression"})
    void test5()
    {
        System.out.println("Running test5");
    }
    @Test(groups={"smoke","regression"})
    void test6()
    {
        System.out.println("Running test6");
    }
}
