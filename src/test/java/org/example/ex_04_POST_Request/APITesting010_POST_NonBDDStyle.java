package org.example.ex_04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting010_POST_NonBDDStyle {


    RequestSpecification r ;
    Response response;
    ValidatableResponse vr;


    @Description("Verify the POST req Positive")
    @Test
    public void test_POST_NonBDDStyle_Create_Token() {
      //URL,METHOD,PAYLOAD /body/header
      //Auth?

       String payload = "{\n" +
               "    \"username\" : \"admin\",\n" +
               "    \"password\" : \"password123\"\n" +
               "}";

       //Precondtions - Preparing Request -URL,Header,Auth..  == part -1

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("auth");

        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println("----part -2-----");
        //Making HTTP request  = part -2
        response =r.when().log().all().post();

        System.out.println("---------part -3-------");
        //verification - part-3

        vr = response.then().log().all();
        vr.statusCode(200);








    }












}
