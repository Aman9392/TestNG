package assertion;

import org.testng.annotations.Test;

public class TimeOutTestMethod {

        @Test(timeOut = 10000)
        void MyTestOne() throws InterruptedException {
            System.out.println("Running Test One");

            Thread.sleep(6000);
            System.out.println("Ending Test One");
        }
        @Test
        void MyTestTwo() throws InterruptedException {
            System.out.println("Running Test Two");

            Thread.sleep(6000);
            System.out.println("Ending Test Two");
        }
}



