package BDD;

import io.restassured.RestAssured;

public class getRequest_QueryParameter {
    public static void main(String[] args) {
        // BDD Style (Behaviour driven development) - framework : cucumber - keywords : given / when / then
        // add query parameters with the same request (UserID = 1)

        RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .basePath("/posts")
                .queryParam("userID",1)
                .when()
                .get().prettyPrint();

    }
}
