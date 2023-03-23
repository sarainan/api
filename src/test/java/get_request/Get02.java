package get_request;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class Get02 {

    /*
        Given
            https://restful-booker.herokuapp.com/booking/0
        When
            User send a GET Request to the url
        Then
            HTTP Status code should be 404
        And
            Status Line should be HTTP/1.1 404 Not Found
        And
            Response body contains "Not Found"
        And
            Response body does not contain "TechProEd"
        And
            Server is "Cowboy"
     */



    @Test
    public void get02(){
        //Set the url
        String url ="https://restful-booker.herokuapp.com/booking/0";



        //SEnd the request and get the response
        Response response= given().when().get(url);
        response.prettyPrint();

        //do assertion
        response.then().assertThat().statusCode(404).statusLine("HTTP/1.1 404 Not Found");

        //How to assert if response body contains any data
//        Response body contains "Not Found"

        assertEquals("Not Found", response.asString()); //asserequals checks if the expected data and actual data matches

       // Response body does not contain "TechProEd"
        assertFalse(response.asString().contains("TechproEdu "));// this method passes if the value paranthesis is false
         assertTrue(response.header("Server").contains("Cowboy"));
         assertEquals("Cowboy", response.header("Server"));
    }

}
