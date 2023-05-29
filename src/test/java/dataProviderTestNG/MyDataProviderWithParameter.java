package dataProviderTestNG;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class MyDataProviderWithParameter {
    @DataProvider(name = "NumberInputs")
    public Object[][] getDataFromDataProvider(Method m) {
        if (m.getName().equalsIgnoreCase("SumOfTwoNumberMethodOne")) {
            return new Object[][]
                    {
                            {22, 33},
                            {45, 56}
                    };
        }else{
            return new Object[][]
                    {
                            {10, 40},
                            {30, 20}
                    };
        }
    }
}
