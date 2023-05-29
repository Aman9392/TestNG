package dataProviderTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test(dataProvider = "NumberInputs")
    public void  SumOfTwoNumber(int num1 , int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of Two Number Are:" + sum);
    }

    @DataProvider(name = "NumberInputs")
    public Object[][] getDataFromDataProvider() {
        return new Object[][]
                {
                        {22,33},
                        {45,56}
                };
    }
}
