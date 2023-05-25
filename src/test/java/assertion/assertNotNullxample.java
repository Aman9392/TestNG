package assertion;

import org.testng.annotations.Test;


import static org.testng.Assert.assertNotNull;

public class assertNotNullxample {
    String str1 = null;
    String str2 = "abc";
    @Test
    void MyAssertNotNuLlTest(){
        assertNotNull(str2);
    }
    @Test
    void MyAssertNotNuLlTestWithMessage(){
        assertNotNull(str2 , "The String Is Not Null");
    }
    @Test
    void MyAssertNotNuLlTestFail(){
        assertNotNull(str1);
    }
    @Test
    void MyAssertNotNuLlTestWithMessageFail(){
        assertNotNull(str1 , "The String Is Not Null");
    }
}
