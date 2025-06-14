package org.example.ex_05_PUT_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.basic;

public class APITesting012_PUT_NonBDDStyle {


    //token,booking id
    //public void get_token()
    //public void get_booking_id(){}


    @Description("Verify the PUT Request for the Restful Booker APIs")
    @Test
    public void test_PUT_Non_BDD(){

        String token = "b3ce4ede25e5d6e";
        String bookingid = "441";

        String payloadPUT = "{\n" +
                "  \"firstname\": \"pramod\",\n" +
                "  \"lastname\": \"Dutta\",\n" +
                "  \"totalprice\": 111,\n" +
                "  \"depositpaid\": true,\n" +
                "  \"bookingdates\": {\n" +
                "    \"checkin\": \"2018-01-01\",\n" +
                "    \"checkout\": \"2019-01-01\"\n" +
                "  },\n" +
                "  \"additionalneeds\": \"Breakfast\"\n" +
                "}";




        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        //requestSpecification.auth().basic("admin" , "password123");

        requestSpecification.cookie("token",token);
       requestSpecification.body(payloadPUT).log().all();


        Response response = requestSpecification.when().put();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }














}
