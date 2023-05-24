package annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterMethod {
    @BeforeMethod
    public void MyBeforeMethod(){
        System.out.println("I am inside The BeforeMethod");
    }
    @Test
    public void TestMethod(){
        System.out.println("I am inside The TestMethod");
    }
    @Test
    public void TestMethodTwo(){
        System.out.println("I am inside The TestMethod Two");
    }
    @org.testng.annotations.AfterMethod
    public void MyAfterMethod(){
        System.out.println("I am Inside The AfterMethod");
    }
}
