package advancedFeatureTestNG;

import org.testng.annotations.Test;

public class ParentClassExample {
    @Test(dependsOnMethods = "MyTestF" )
    void MyTestE(){
        System.out.println("My Test E");
    }

    @Test
    void MyTestF(){
        System.out.println("My Test F");
    }
}
