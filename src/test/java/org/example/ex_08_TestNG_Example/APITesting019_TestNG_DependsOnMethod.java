package org.example.ex_08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting019_TestNG_DependsOnMethod {


    @Test
    public void serveStartedOK(){
        System.out.println("I will run first");
        Assert.assertTrue(true);    // statement

    }
@Test(dependsOnMethods = "serveStartedOK")
    public void method1(){
        System.out.println("method1");
        Assert.assertTrue(true);    // statemen

    }

@Test(dependsOnMethods = "serveStartedOK")
    public void method2(){
        System.out.println("method2");
        Assert.assertTrue(true);    // statement

    }



}
