package assertion;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class assertEqualsExample {
    @Test
    public void MyTestAssertEqualsBoolean() {
        assertEquals(checkbigger(10 ,5), true);
    }

    @Test
    public void MyTestAssertEqualsInteger() {
        assertEquals(multiply(10 ,5), 50);
    }

    @Test
    public void MyTestAssertEqualsString() {
       assertEquals(Greetings("Aman"),"Aman");
    }
    public String Greetings(String message){
       return message;
    }
    public int multiply(int x , int y){
        return x*y;
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
    public void MyTestAssertEqualsBooleanWithStringMessage(){
        assertEquals(checkbigger(10 ,5),true , "First Number Grater  then Sucond number");
    }

    @Test
    public void MyTestAssertEqualsIntegerWithStringMessage(){
        assertEquals(multiply(10 ,5),50 , "Multipilication is not correct");
    }

    @Test
    public void MyTestAssertEqualsStringWithStringMessage(){
       assertEquals(Greetings("Aman"),"Aman", "Message dos'nt Match");
    }
}
