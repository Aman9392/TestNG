package assertion;

import org.testng.annotations.Test;

public class DisabledTestExample {
    @Test(enabled = false)
    void MyTestOne(){
        System.out.println("Running Test One");
    }
    @Test
    void MyTestTwo(){
        System.out.println("Running Test Two");
    }
}
