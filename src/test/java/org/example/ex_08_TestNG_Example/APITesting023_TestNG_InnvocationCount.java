package org.example.ex_08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting023_TestNG_InnvocationCount {


    @Test(invocationCount = 3)
    public void test01(){
        Assert.assertTrue(true);
    }

}
