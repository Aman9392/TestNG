package testNGIExecutoionListener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class IExexcutionListenerTestCaseExample {
    @BeforeSuite
    void beforSuite(){
        System.out.println("Before Suite");
    }

    @Test
    void myTestCase(){
        System.out.println("Test");
    }

    @AfterClass
    void afterSuite(){
        System.out.println("After Suite");
    }
}
