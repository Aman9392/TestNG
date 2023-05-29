package parallelsimTestNg;

import org.testng.annotations.Test;

public class ParallelClassesExampleOne {
    @Test
    void testCaseFive(){
        System.out.println("Running Testcase Five There run  With Thread Id :"+Thread.currentThread().getId());
    }

    @Test
    void testCaseSix(){
        System.out.println("Running Testcase Six There  run With Thread Id :"+Thread.currentThread().getId());
    }

    @Test
    void testCaseSeven(){
        System.out.println("Running Testcase Seven There run With Thread Id :"+Thread.currentThread().getId());
    }

    @Test
    void testCaseEight(){
        System.out.println("Running Testcase Eight There run With Thread Id :"+Thread.currentThread().getId());
    }
}
