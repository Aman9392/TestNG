package testNG;

import TestSuit.Suite;
import org.testng.annotations.Test;

public class Test1 extends Suite {
    @Test
    void First(){
        System.out.println("First");
    }
    @Test
    void Second(){
        System.out.println("Second");
    }
    @Test
    void Third(){
        System.out.println("Third");
    }
}
