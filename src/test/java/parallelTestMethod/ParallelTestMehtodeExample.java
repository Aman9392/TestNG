package parallelTestMethod;

import org.testng.annotations.Test;

public class ParallelTestMehtodeExample {
    @Test(threadPoolSize = 4 , invocationCount = 8)
    void testCase(){
        System.out.println("Running The TestCase With Thread Id :"+Thread.currentThread().getId());
    }
}
