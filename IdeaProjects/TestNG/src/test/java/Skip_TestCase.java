import com.sun.prism.shader.Solid_ImagePattern_Loader;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import static java.lang.Boolean.TRUE;

public class Skip_TestCase {
    boolean flag=true;
    @Test
    public void test0() {
        System.out.println("this is  a test0");
    }

    @Test(enabled = false)
    public void test1() {
        System.out.println("this is  a test1");
    }

    @Test
    public void test2() {

        System.out.println("This is a test2");
        Assert.assertEquals("a","a");//this will be ignored
        throw new SkipException("do not execute");//This is always put after all the statments,in the end
    }

    @Test
    public void test3() {
        System.out.println("This is a test3");
        if(flag==true)
        {
            System.out.println("executing based on condition");

        }
        else
        {
            System.out.println("Skipped");
        }
    }

}
