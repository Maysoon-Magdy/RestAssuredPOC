package BDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class getRequest {
    public static void main(String[] args) {
        //pretty print => getting response body in the return of the run , in case of response we separate it in response.  line
        //get() => the API Method
        // response interface
        Response response =
                RestAssured .given() .baseUri("https://jsonplaceholder.typicode.com/posts/1")
                .when().get();

        //print
        response.prettyPrint();

        //assertion on status code & status line
        response.then().statusCode(200);//.and().statusLine("");

        //assert on status line
        response.then().statusLine("HTTP/1.1 200 OK");

        //assert on response body parameter (Using Matcher)
        //Matcher will be my parameter path based on the body structure
        response.then().body("userId", Matchers.equalTo(1));
    }
}
