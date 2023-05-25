package assertion;

import org.testng.annotations.Test;
import static org.testng.Assert.assertSame;

public class assertSameExample {
    String str1 = "abcd";
    String str2 = "abc";
    @Test
    void MyAssertSameTest(){
        assertSame(str1 , str2);
    }
    @Test
    void MyAssertSameTestWithMessage(){
        assertSame(str1 , str2 ,"strings are Not Smae");
    }

}
