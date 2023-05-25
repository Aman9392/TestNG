package assertion;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class asserttrueExample {
    @Test
    public void MyTestAssertTrue(){
      assertTrue(checkbigger(7 ,6));
    }
    public  boolean checkbigger(int x , int y){
         boolean result;
         if(x>y){
             result = true ;
         }else{
             result = false;
        }
         return  result;
    }
    @Test
    public void MyTestAsseertTruetWithStringMessage(){
        assertTrue(checkbigger(5 ,6),"First Number Smaller  then Sucond number");
    }
}
