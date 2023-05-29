package dataProviderTestNG;

import org.testng.annotations.Test;

public class DataProviderClassWithMethodParameter {
    @Test(dataProvider = "NumberInputs" ,dataProviderClass = MyDataProviderWithParameter.class)
    public void  SumOfTwoNumberMethodOne(int num1 , int num2) {
        System.out.println("Entry OF SumOfTwoNumberMethodOne");
        int sum = num1 + num2;
        System.out.println("Sum of Two Number Are:" + sum);
        System.out.println("Exit OF SumOfTwoNumberMethodOne");
    }
    @Test(dataProvider = "NumberInputs" ,dataProviderClass = MyDataProviderWithParameter.class)
    public void  SumOfTwoNumberMethodTwo(int num1 , int num2) {
        System.out.println("Entry OF SumOfTwoNumberMethodTwo");
        int sum = num1 + num2;
        System.out.println("Sum of Two Number Are:" + sum);
        System.out.println("Exit OF SumOfTwoNumberMethodTwo");
    }
}
