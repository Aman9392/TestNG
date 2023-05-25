package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    void MyTest() {
        SoftAssert softAssertion = new SoftAssert();
//        Assert.assertTrue(checkbigger(10, 5));
        softAssertion.assertTrue(checkbigger(5, 10));
        System.out.println("End of My TestNG");
        softAssertion.assertAll();
    }

    @Test
    void MyTestTwo() {
        Assert.assertTrue(checkbigger(10, 5));

    }

    public boolean checkbigger(int x, int y) {
        boolean result;
        if (x > y) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
