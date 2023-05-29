package advancedFeatureTestNG;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DependsOnMultipleMethodsExample {
    @Test(dependsOnMethods = {"MyTestB" , "MyTestC"})
    void MyTestA(){
        System.out.println("My Test A");
        //1st failure
        //assertTrue(false);
    }

    @Test
    void MyTestB(){
        System.out.println("My Test B");
        //2nd failure
        //assertTrue(false);
    }

    @Test(dependsOnMethods = "MyTestD")
    void MyTestC(){
        System.out.println("My Test C");
    }

    @Test
    void MyTestD(){
        System.out.println("My Test D");
    }
}
