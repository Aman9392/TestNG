package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
   @Test
    void MyTest() {
       try {
           Assert.assertTrue(checkbigger(10, 5));
       }catch(Throwable t) {
           System.out.println("End of My  TestNG");
       }
   }
    @Test
    void MyTestTwo(){
        Assert.assertTrue(checkbigger(10, 5));

    }
    public boolean checkbigger(int x, int y) {
        boolean result;
        if (x > y) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
