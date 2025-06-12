package org.example.ex_02_RA_TestNg_AllureReport;


import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting006_TC_TestNG_Fix {

    @Test
    @Description("TC#1 Verify that the valid pincode gives 200 OK")
    public void test_GET_Positive_TC1() {

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110048")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description("TC#2 Verify that an invalid pincode returns error")
    public void test_GET_Negative_TC2() {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/-1")
                .when()
                .get()
                .then().log().all().statusCode(404); // <--- likely 404, not 200
    }
    @Test
    @Description("TC#3 Verify that another invalid pincode returns error")
    public void test_GET_Negative_TC3() {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/$")
                .when()
                .get()
                .then().log().all().statusCode(404); // <--- again, likely 404
    }
}













