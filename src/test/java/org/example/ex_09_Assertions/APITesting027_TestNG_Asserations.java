package org.example.ex_09_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting027_TestNG_Asserations {
//55%
    //Hard Assertions

    @Test
    public void test_hardAssertExample(){
        System.out.println("Start of the Program");
        Boolean is_neeru_male=false;
        Assert.assertEquals("pramod","Pramod");
        System.out.println("End of the program");
    }





    // Softassertion

    @Test
    public void test_SoftAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("End of the program");
        softAssert.assertAll();
    }









}
