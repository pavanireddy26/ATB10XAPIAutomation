package org.example.ex_08_TestNG_Example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting020_TestNG_Parameter {



    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("I am demo1 TC");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome Browser");
        }

        if(value.equalsIgnoreCase("Firefox")){
            System.out.println("start the Firefox Browser");
        }





    }


















}
