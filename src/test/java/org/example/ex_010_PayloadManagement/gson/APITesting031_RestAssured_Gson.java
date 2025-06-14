package org.example.ex_010_PayloadManagement.gson;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.ex_010_PayloadManagement.ai_03.Booking;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class APITesting031_RestAssured_Gson {

    //GSON - is google library -which will convert your class to JSON
    //JSON to class
    //JSON is a plain text in key and value pair to  transfer from client


    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    @Test
    public void test_Create_Booking_Positive(){


        //step 1
        //URL -> Base URI +base path
        //Header
        //body
        //Auth - No


        //step 2
        // prepare the payload (object -> JSON String)
        // send the request

        //step 3
        //validate response (JSON String -> object)
        // Firstname
        //status code
        // time reponnse



Booking booking  = new Booking();
booking .setFirstname("pramod");
booking.setLastname("Dutta");
booking.setTotalprice(112);
booking.setDepositpaid(true);

Bookingdates bookingdates = new Bookingdates();
bookingdates.setCheckin("2024-02-01");
bookingdates.setCheckout("2024-02-01");
booking.setBookingdates(bookingdates);
booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);


        //java object -> JSON

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);




     //   {"firstname":"pramod","lastname":"Dutta","totalprice":112,"depositpaid":true,"additionalneeds":"Breakfast"}




        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/" + booking);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonStringBooking).log().all();



        Response response = requestSpecification.when().post();
        String  jsonResponseString = response.asString();


        //Get validate response to perfor validation
        ValidatableResponse validatableResponse = response.then().log().all();

;        //Rest Assured
        validatableResponse.statusCode(200);

//case1 - extract -Direct Extraction
        String  firstname1 = response.then().extract().path("booking.firstname");
        System.out.println(firstname1);


        Assert.assertEquals(firstname1,"pramod");
        Assert.assertEquals(firstname1,"pramod");


        assertThat(firstname1).isNotNull().isNotEmpty().isNotBlank().isEqualTo("pramod");


        // case2 -jsonpath.getString("")  json path extraction


        JsonPath jsonpath = new JsonPath(response.asString());
        String bookingId = jsonpath.getString("bookingid");
        String firstname = jsonpath.getString("booking.firstname");
























    }





















}
