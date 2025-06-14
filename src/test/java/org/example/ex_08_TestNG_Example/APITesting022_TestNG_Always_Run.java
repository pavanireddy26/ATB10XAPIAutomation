package org.example.ex_08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting022_TestNG_Always_Run {



    @Test
    public void test01(){
        Assert.assertTrue(true);
    }


    @Test(alwaysRun = true,enabled = false)
    public void test02(){
        Assert.assertTrue(true);
    }




    @Test
    public void test03(){
        Assert.assertTrue(true);
    }





















}
