package dataProviderTestNG;

import org.testng.annotations.Test;

public class DataProviderInSeprateClassExample {
    @Test(dataProvider = "NumberInputs" ,dataProviderClass = MyDataProvider.class)
    public void  SumOfTwoNumber(int num1 , int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of Two Number Are:" + sum);
    }

}
