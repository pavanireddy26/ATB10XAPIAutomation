package org.example.ex_03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_GET_Non_BDDStyle {

    RequestSpecification r;
    Response response ;
    ValidatableResponse vr;


    @Description("Verify the GET Positive")
    @Test
    public void test_GET_Non_BDDStyle(){
        String pincode ="560048";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        response = r.when().log().all().get();

        vr=response.then().log().all().statusCode(200);


    }

    @Description("Verify the GET Negative : -1 Input")
    @Test
   public void test_test_GET_Non_BDDStyleGET_negative(){

        String pincode ="560048";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        response = r.when().log().all().get();

        vr=response.then().log().all().statusCode(200);


    }


}
