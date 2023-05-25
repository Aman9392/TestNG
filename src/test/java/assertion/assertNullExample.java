package assertion;

import org.testng.annotations.Test;
import static org.testng.Assert.assertNull;

public class assertNullExample {
    String str1 = null;
    String str2 = "abc";
    @Test
    void MyAssertNuLlTest(){
       assertNull(str1);
    }
    @Test
    void MyAssertNuLlTestWithMessage(){
        assertNull(str1 , "The String Is Not Null");
    }
    @Test
    void MyAssertNuLlTestFail(){
        assertNull(str2);
    }
    @Test
    void MyAssertNuLlTestWithMessageFail(){
        assertNull(str2 , "The String Is Not Null");
    }
}
