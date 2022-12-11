package NonBDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequest {
    public static void main(String[] args) {
        RestAssured.baseURI= "https://jsonplaceholder.typicode.com/posts";
        RequestSpecification request = RestAssured.given();
        request.header("Content-type" , "application/json;charset=UTF-8");
        request.body("{ \"title\": \"foo\",\"body\": \"bar\", \"userId\" : 1} ");
        Response response = request.post();
        response.prettyPrint();

    }


}
