package org.example.ex_08_TestNG_Example;

import org.testng.annotations.*;

public class APITesting025_TestNG_AllAnnotations {



    @BeforeSuite
    void demo1(){
        System.out.println("Read the data from the SQL");
    }


    @BeforeTest
    void demo2(){
        System.out.println("Data in matrix, TC Before");
    }



    @BeforeClass
    void demo3(){
        System.out.println("Before Class");
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
