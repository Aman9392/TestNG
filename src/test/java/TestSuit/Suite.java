package TestSuit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Suite {
    @BeforeSuite
    public void MyBeforeSuit(){
        System.out.println("Starting Gradel Start");
    }
    @AfterSuite
    public void MyAfterSuit(){
        System.out.println("Stoping Gradel End");
    }
    @BeforeTest
    public void MyBeforeTest(){
        System.out.println("Starting Gradel BeforeTest Start");
    }
    @AfterTest
    public void MyAftertest(){
        System.out.println("Stoping Gradel Aftertest End");
    }
}