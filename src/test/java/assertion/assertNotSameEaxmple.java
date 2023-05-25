package assertion;

import org.testng.annotations.Test;
import static org.testng.Assert.assertNotSame;


public class assertNotSameEaxmple {
    String str1 = "abc";
    String str2 = "abc";
    @Test
    void MyAssertNotSameTest(){
        assertNotSame(str1 , str2);
    }
    @Test
    void MyAssertNotSameTestWithMessage(){
        assertNotSame(str1 , str2 ,"strings are Not Same");
    }
}

