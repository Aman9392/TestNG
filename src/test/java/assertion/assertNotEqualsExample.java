package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class assertNotEqualsExample {
    @Test
    public void MyTestAssertNotEqualsBoolean() {
        Assert.assertNotEquals(checkbigger(5, 10), true);
    }

    @Test
    public void MyTestAssertNotEqualsInteger() {
        Assert.assertNotEquals(multiply(5, 10), 50);
    }

    @Test
    public void MyTestAssertNotEqualsString() {
        Assert.assertNotEquals(Greetings("Aman"), "Aman");
    }

    public String Greetings(String message) {
        return message;
    }

    public int multiply(int x, int y) {
        return x * y;
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

    @Test
    public void MyTestAssertNotEqualsBooleanWithStringMessage() {
        Assert.assertNotEquals(checkbigger(5, 10), true, "First Number Not Grater then Sucond number");
    }

    @Test
    public void MyTestAssertNotEqualsIntegerWithStringMessage() {
        Assert.assertNotEquals(multiply(5, 10), 50, "Multipilication is not correct");
    }

    @Test
    public void MyTestAssertNotEqualsStringWithStringMessage() {
        Assert.assertNotEquals(Greetings("Aman"), "Aman", "Message dos'nt Match");
    }
}
