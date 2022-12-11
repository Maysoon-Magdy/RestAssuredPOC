package NonBDD

import io.restassured.RestAssured
import io.restassured.path.json.JsonPath
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification
import org.apache.tools.ant.taskdefs.optional.sos.SOS
import org.testng.Assert
import java.util.concurrent.TimeUnit

class GetRequest {
    static void main(String[] args) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/1";
        RequestSpecification request = RestAssured.given()
        Response response =  request.get();
        response.prettyPrint();
        long responseTime = response.getTimeIn(TimeUnit.MILLISECONDS);
        int statusCode = response.getStatusCode();
        String statusLine = response.statusLine();
        //json path
        JsonPath path = response.jsonPath();
        // if your parameter inside a json array use object number ex`: data[1].id
        // if your response is array of objects , use the object number ex:  [0].id
        String id = path.getString("id");

        //Assert using testNG
        Assert.assertEquals(statusCode,200);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        Assert.assertTrue(responseTime<2000);
    }
}
