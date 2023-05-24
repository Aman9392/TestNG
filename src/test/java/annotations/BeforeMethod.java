package annotations;

import org.testng.annotations.Test;

public class BeforeMethod {
    @Test
    public void TestMethod(){
        System.out.println("I am inside The TestMethod");
    }
    @Test
    public void TestMethodTwo(){
        System.out.println("I am inside The TestMethod Two");
    }
    @org.testng.annotations.BeforeMethod
    public void MyBeforeMethod(){
        System.out.println("I am inside The BeforeMethod");
    }
}
