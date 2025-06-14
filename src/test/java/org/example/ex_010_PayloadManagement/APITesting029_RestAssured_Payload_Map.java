package org.example.ex_010_PayloadManagement;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import static org.apache.http.client.methods.RequestBuilder.put;

public class APITesting029_RestAssured_Payload_Map {



    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;




    @Test
    public void test_POST() {

//
//        String payloadPOST = "{\n" +
//                "  \"firstname\": \"pramod\",\n" +
//                "  \"lastname\": \"dutta\",\n" +
//                "  \"totalprice\": 111,\n" +
//                "  \"depositpaid\": true,\n" +
//                "  \"bookingdates\": {\n" +
//                "    \"checkin\": \"2018-01-01\",\n" +
//                "    \"checkout\": \"2019-01-01\"\n" +
//                "  },\n" +
//                "  \"additionalneeds\": \"Breakfast\"\n" +
//                "}";
//

        Map<String , Object> jsonBodyUsingMap = new LinkedHashMap();
        jsonBodyUsingMap.put("firstname","pramod");
        jsonBodyUsingMap.put("lastname","Dutta");
        jsonBodyUsingMap.put("totalprice",123);
        jsonBodyUsingMap.put("depositpaid",false);


        Map<String , Object> bookingDatesMap = new LinkedHashMap();
        bookingDatesMap.put("checkin" ,"2018-01-01");
        bookingDatesMap.put("checkout" ,"2019-01-01");

       jsonBodyUsingMap.put("bookingdates",bookingDatesMap);
       jsonBodyUsingMap.put("additionalneeds" ,"Breakfast");
        System.out.println(jsonBodyUsingMap);









    }























}
