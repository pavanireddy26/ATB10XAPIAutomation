package org.example.ex_07_DELETE_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting014_DELETE_NonBDDStyle {


    @Description("Verify the Delete Request for the Restful Booker APIs")
    @Test
    public void test_Delete_Non_BDD(){

    String token = "4e1bb381e828699";
    String bookingid = "4787";



        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        //requestSpecification.auth().basic("admin" , "password123");

        requestSpecification.cookie("token",token);


        Response response = requestSpecification.when().delete();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }
































}
