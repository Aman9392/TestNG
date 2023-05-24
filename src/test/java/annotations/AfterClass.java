package annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterClass {
    @Test
    public  void TestMethodOne(){
        System.out.println("I Am inside The  TestMethod One");
    }
    @org.testng.annotations.AfterClass
    public  void MyAfterClass(){
        System.out.println("I Am inside The AfterClass");
    }
    @BeforeClass
    public  void MyBeforeClass(){
        System.out.println("I Am inside The BeforeClass");
    }
    @BeforeMethod
    public  void MyBeforeMethod(){
        System.out.println("I Am inside The BeforeMethod");
    }
    @Test
    public  void TestMethodThree(){
        System.out.println("I Am inside The  TestMethod Three");
    }
    @Test
    public  void TestMethodTwo(){
        System.out.println("I Am inside The  TestMethod Two");
    }
}
