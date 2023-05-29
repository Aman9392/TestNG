package advancedFeatureTestNG;

import org.testng.annotations.Test;

public class DependsOnInheritedMethodExample extends ParentClassExample {
    @Test(dependsOnMethods = "MyTestE" )
    void MyTestA(){
        System.out.println("My Test A");
    }

    @Test
    void MyTestB(){
        System.out.println("My Test B");
    }
}
