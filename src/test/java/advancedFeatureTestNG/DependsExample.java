package advancedFeatureTestNG;

import org.testng.annotations.Test;

public class DependsExample {
    @Test(dependsOnMethods = "TestC")
    void TestA(){
        System.out.println("Test A");
    }

    @Test
    void TestB(){
        System.out.println("Test B");
    }

    @Test(dependsOnMethods = "TestA")
    void TestC(){
        System.out.println("Test C");
    }
}
