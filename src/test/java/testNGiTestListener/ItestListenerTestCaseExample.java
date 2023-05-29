package testNGiTestListener;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ItestListenerTestCaseExample {
    int i;

    @BeforeTest
    void beforeTest() {
        System.out.println("In BeforeTest");
    }

    //passing Test
    @Test
    void MyTestOne() {
        System.out.println("In My Test One Method");
    }

    //Failing Test
    @Test
    void MyTestTwo() {
        System.out.println("In My Test Two Method");
        assertTrue(false);
    }

    //skipping Test
    @Test
    void MyTestThree() {
        throw new SkipException("MyTest Two Is Skipped");
    }

    //onTestFinishButWithSuccessPercentage Test
    @Test(successPercentage = 80, invocationCount = 5)
    void MyTestFour() {
        i++;
        System.out.println("My Test Four Method , invocation count is :" + i);
        if (i == 1 | i == 2) {
            System.out.println("Fail My Test Four");
            assertTrue(false);
        } else {
            System.out.println("Pass My Test Four");
            assertTrue(true);
        }
    }

    @AfterTest
    void afterTest() {
        System.out.println("In After Test");
    }

}
