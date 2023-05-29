package advancedFeatureTestNG;

import org.testng.annotations.Test;
public class DependsOnGroupAndMethodsTestExample {
    @Test(dependsOnGroups = "Group1")
    void MyTestA(){
        System.out.println("My Test A");
    }

    @Test(groups = "Group1")
    void MyTestB(){
        System.out.println("My Test B");

    }

    @Test(groups = "Group1" ,dependsOnMethods = "MyTestD")
    void MyTestC(){
        System.out.println("My Test C");
    }

    @Test
    void MyTestD(){
        System.out.println("My Test D");
    }
}
