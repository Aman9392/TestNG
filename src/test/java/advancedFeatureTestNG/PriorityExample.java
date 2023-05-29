package advancedFeatureTestNG;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    void MyTestOne(){
        System.out.println(" I am One");
    }

    @Test(priority = 2)
    void MyTestTwo(){
        System.out.println(" I am Two");
    }

    @Test(priority = 3)
    void MyTestThree(){
        System.out.println(" I am Three");
    }
}
