package org.example.ex_03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting008_GET_BDDStyle {

    @Test
    @Description("TC#2 Verify that an invalid pincode gives error")
    public void test_GET_Negative_TC2() {
        String pin_code = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    @Description("TC#3 Verify that another invalid pincode gives error")
    public void test_GET_Positive_TC3() {
        String pin_code = "388620";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}