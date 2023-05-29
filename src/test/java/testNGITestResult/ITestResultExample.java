package testNGITestResult;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class ITestResultExample {
    @Test
    void MyTestA(){
        System.out.println("I Am In MyTestA");
        assertTrue(true);
    }

    @Test
    void MyTestB(){
        System.out.println("I Am In MyTestB");
        assertTrue(false);
    }
    @AfterMethod
    void getStatus(ITestResult myTestStatus){
        if(myTestStatus.getStatus()== ITestResult.SUCCESS){
            System.out.println("Pass: Method Name is"+myTestStatus.getMethod().getMethodName());
        }else if (myTestStatus.getStatus()==ITestResult.FAILURE){
            System.out.println("Fail: Method Name is"+myTestStatus.getMethod().getMethodName());
        }
    }
}


