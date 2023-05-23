package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
    @Test
    void Login(){
        System.out.println("Login");
    }
    @Test
    void Register(){
        System.out.println("Register");
    }
    @Test
    void SingUp(){
        System.out.println("Singup");
        Assert.assertEquals(1 ,1);
    }
}
