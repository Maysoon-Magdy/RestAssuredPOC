package BDD;

import io.restassured.RestAssured;

public class postRequest {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .basePath("/posts")
                .body("{ \"title\": \"foo\",\"body\": \"bar\", \"userId\" : 1} ")
                .header("Content-type" , "application/json;charset=UTF-8")
                .when()
                .post().prettyPrint();

    }


}
