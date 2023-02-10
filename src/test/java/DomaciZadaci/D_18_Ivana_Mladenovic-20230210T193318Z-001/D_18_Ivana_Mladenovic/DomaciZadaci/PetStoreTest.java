package DomaciZadaci;

import DomaciZadaci.Payload.Body;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static DomaciZadaci.Payload.Body.createBody;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;

public class PetStoreTest {

    @Test
    public void HealthCheck(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                       .when().get("/swagger")
                        .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void placeAnOrder(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"petId\": 0,\n" +
                        "  \"quantity\": 0,\n" +
                        "  \"shipDate\": \"2023-01-28T16:44:57.904Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .when().post("/store/order")
                .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void placeAnOrder1(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(Body.createBody())
                .when().post("/store/order")
                .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void userLogin(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/user/login")
                .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void createUser(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(Body.createUser())
                .when().post("/user")
                .then().log().all()
                .assertThat().statusCode(200);

    }
}
