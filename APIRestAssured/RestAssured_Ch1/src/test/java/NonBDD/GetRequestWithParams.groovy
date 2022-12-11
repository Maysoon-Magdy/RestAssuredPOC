package NonBDD

import io.restassured.RestAssured
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

class GetRequestWithParams {
    static void main(String[] args) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
        RequestSpecification request = RestAssured.given()
        request.queryParam("userId","1")
        Response response =  request.get();

        response.prettyPrint();

    }
}
