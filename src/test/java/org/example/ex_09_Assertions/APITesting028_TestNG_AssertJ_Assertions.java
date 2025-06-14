package org.example.ex_09_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.Assertions.*;

public class APITesting028_TestNG_AssertJ_Assertions {


    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;


    @Test
    public void test_POST() {


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


        validatableResponse.body("booking.firstname", Matchers.equalTo("pramod"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Dutta"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(false));
        validatableResponse.body("bookingid", Matchers.notNullValue());



        //TestNgAssertion
        //softAssert vs
        //HardAssert
        //This means that if any assertion fails,
        // the remaining satements in that test method will not be executed

        bookingId = response.then().extract().path("bookingId");
       String firstname = response.then().extract().path("booking.firstname");
       String lastname = response.then().extract().path("booking.lastname");





        //TestNgAssertion
        //softAssert vs
        //HardAssert
        //This means that if any assertion fails,
        // the remaining satements in that test method will not be executed


        Assert.assertNotNull(bookingId);
        Assert.assertEquals(firstname  ,"PRAMOD");
        Assert.assertEquals(lastname  ,"Dutta");


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(firstname,"jim");
        softAssert.assertAll();


    // AssertJ (3rd -Lib to Assertions)

        assertThat(bookingId).isNotNull().isNotZero().isPositive();
        assertThat(firstname).isEqualTo("pramod").isNotEmpty().isNotBlank();

        // String  s " " ; // empty
        // String s2 = " " : //blnk





















    }

























    }
