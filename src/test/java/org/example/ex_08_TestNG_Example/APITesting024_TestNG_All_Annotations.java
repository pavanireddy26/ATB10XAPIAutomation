package org.example.ex_08_TestNG_Example;

import org.testng.annotations.*;


public class APITesting024_TestNG_All_Annotations {


    @BeforeSuite
    void demo1(){
        System.out.println("Before suite");
    }


    @BeforeTest
    void demo2(){
        System.out.println("Before Test");
    }



    @BeforeClass
    void demo3(){
        System.out.println("Before Class");
    }





    @BeforeMethod
    void demo4(){
        System.out.println("Before Method");
    }




    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }


    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }


    @AfterSuite
    void demo9(){
        System.out.println("After suite");
    }













}
