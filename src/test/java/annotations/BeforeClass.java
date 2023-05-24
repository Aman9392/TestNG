package annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClass {
   @org.testng.annotations.BeforeClass
    public void BeforeClassExample(){
       System.out.println("I am Before The Class");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am Before Method");
    }
    @Test
    public void TestMethod(){
        System.out.println("I am Test One");
    }
    @Test
    public void TestTwo(){
        System.out.println("I am Test Two");
    }
}
