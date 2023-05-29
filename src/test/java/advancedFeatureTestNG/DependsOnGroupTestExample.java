package advancedFeatureTestNG;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
public class DependsOnGroupTestExample {
    @Test(dependsOnGroups = "Group1")
    void MyTestA(){
        System.out.println("My Test A");
        //assertTrue(false);
    }

    @Test(groups = "Group1")
    void MyTestB(){
        System.out.println("My Test B");
        assertTrue(false);
    }

    @Test(groups = "Group1")
    void MyTestC(){
        System.out.println("My Test C");
    }
}
