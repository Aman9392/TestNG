package assertion;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;

public class assertFalseExample {
    @Test
    public void MyTestAssertFalse() {
        assertFalse(checkbigger(7 ,5));
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
    public void MyTestAssertFalseWithStringMessage(){
        assertFalse(checkbigger( 8,7), "First Number Grater  then Sucond number");
    }
}
