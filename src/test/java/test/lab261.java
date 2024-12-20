package test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class lab261 {
    //1000 group thes testcases
    //smoke , sanity
    //before After we can do something

    @Test
    public void getRequest() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);
    }

    @Test
    public void getRequest2() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);

    }
}


