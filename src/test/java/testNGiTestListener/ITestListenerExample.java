package testNGiTestListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class ITestListenerExample implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        // onStart() Invoked after the test class is instantiated and before any configuration
        // Method is called
        System.out.println("In onStart method of ITestListener Test name is :" + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        //onTestStart() This Method will always be invoked each Time Before a test method will
        // be invoked
        System.out.println("In onTestStart method of ITestListener Method name is :" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // onTestSuccess() This Method will always be invoked each time a test succeed or passes
        System.out.println("In onTestSuccess method of ITestListener Method Name is :" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // onTestFailure() This Method will always be Invoked each time a test case fail
        System.out.println("In onTestFailure method of ITestListener Method Name is :" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // onTestSkipped() This Method will always be Invoked each time a test case Skipped
        System.out.println("In onTestSkipped method of ITestListener Method Name is :" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // onTestFailedButWithinSuccessPercentage() This Method will always be Invoked each time a test case fail
        // but is  within success percentage
        System.out.println("In onTestFailedButWithinSuccessPercentage method of ITestListener Method Name is :" + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // onFinish() This Method will always be Invoked after all the tests hava run and all their configuration
        // methods have been called
        System.out.println("In onFinish method of ITestListener Test name is :" + context.getName());
    }

}
