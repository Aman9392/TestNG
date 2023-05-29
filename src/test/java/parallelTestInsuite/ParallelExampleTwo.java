package parallelTestInsuite;

import org.testng.annotations.Test;

public class ParallelExampleTwo {
    @Test
    void testCaseOne(){
        System.out.println("Running Testcase one There run  With Thread Id :"+Thread.currentThread().getId());
    }

    @Test
    void testCaseTwo(){
        System.out.println("Running Testcase Two There  run With Thread Id :"+Thread.currentThread().getId());
    }

    @Test
    void testCaseThree(){
        System.out.println("Running Testcase Three There run With Thread Id :"+Thread.currentThread().getId());
    }

    @Test
    void testCaseFour(){
        System.out.println("Running Testcase Four There run With Thread Id :"+Thread.currentThread().getId());
    }
}
