import org.testng.annotations.*;


public class AnnotationsEx {
    @Test
    void test1() {
        System.out.println("This is test 1");
    }

    @Test
    void test2() {
        System.out.println("This is test 2");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Runs before every method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("Runs after every method");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("Runs before class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("Runs after class");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("Runs before test");
    }

    @AfterTest
    void aftertest() {
        System.out.println("Runs after test");
    }

    @BeforeSuite
    void beforeTestSuite() {
        System.out.println("Runs before testsuite");
    }

    @AfterSuite
    void aftertestSuite() {
        System.out.println("Runs after testsuite");
    }
}
