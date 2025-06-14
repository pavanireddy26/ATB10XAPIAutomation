package org.example.ex_08_TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting016_All_Annotation_Example {


    //PUT Request-
     //1.get token
    //2.BookingId
    //3.test_PUT( which will use the above two method)
    //4. close all things

    @BeforeTest
    public void getTokens(){
        System.out.println("1");
    }


  @BeforeTest
    public void getBookingId(){
      System.out.println("2");
  }



    @Test
    public void test_PUT(){
        System.out.println("3");
    }

@AfterTest
  public void closeAllThings(){
    System.out.println("close");
}

























}
