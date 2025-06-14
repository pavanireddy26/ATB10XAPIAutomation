package org.example.ex_06_Patch_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting013_Patch_NonBDDStyle {








    @Description("Verify the PATCH Request for the Restful Booker APIs")
    @Test
    public void test_Patch_Non_BDD(){

        String token = "4e1bb381e828699";
        String bookingid = "4787";

        String payloadPATCH = "{\n" +
                "  \"firstname\" : \"pramod\",\n" +
                "  \"lastname\" : \"Brown\"\n" +
                "}";




        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        //requestSpecification.auth().basic("admin" , "password123");

        requestSpecification.cookie("token",token);
        requestSpecification.body(payloadPATCH).log().all();


        Response response = requestSpecification.when().patch();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }
























}
