package org.example.ex_09_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;

public class APITesting026_TestNG_RestAssured_Asseration {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;


    @Test
    public void test_POST() {


        String payloadPOST = "{\n" +
                "  \"firstname\": \"pramod\",\n" +
                "  \"lastname\": \"dutta\",\n" +
                "  \"totalprice\": 111,\n" +
                "  \"depositpaid\": true,\n" +
                "  \"bookingdates\": {\n" +
                "    \"checkin\": \"2018-01-01\",\n" +
                "    \"checkout\": \"2019-01-01\"\n" +
                "  },\n" +
                "  \"additionalneeds\": \"Breakfast\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/" + bookingId);
        requestSpecification.contentType(ContentType.JSON);



        Response response = requestSpecification.when().post();


        //Get validate response to perfor validation
        ValidatableResponse validatableResponse = response.then().log().all();

     //Rest Assured
        validatableResponse.statusCode(200);



        //Rest assured --> import org.hamcrest.Matchers;
        //firstname ==Pramod.lastname ==Dutta,
        //booking shouldnt be null


        validatableResponse.body("booking.firstname" ,Matchers.equalTo("pramod"));
        validatableResponse.body("booking.lastname" ,Matchers.equalTo("Dutta"));
        validatableResponse.body("booking.depositpaid" ,Matchers.equalTo(false));
        validatableResponse.body("bookingid" ,Matchers.notNullValue());




















    }


}


