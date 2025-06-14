package org.example.ex_08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting018_TestNG_Groups {
    //sanity =1 TC
    //Reg =3 TC
    //p1 =1

@Test(groups = {"sanity" , "reg"},priority = 1)
    public  void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);

    }
@Test(groups= {"p1" ,"reg"},priority = -1)
    public  void test_regRun(){
        System.out.println("Reg");
        Assert.assertTrue(false);

    }
@Test(groups ={"p1" ,"reg"},priority = 0)
    public  void test_smokeRun(){
        System.out.println("smoke");
        Assert.assertTrue(false);

    }




















}
