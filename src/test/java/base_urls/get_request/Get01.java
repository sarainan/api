package base_urls.get_request;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get01 {

  /*
        Given
            https://restful-booker.herokuapp.com/booking/10
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */

    @Test
    public void get01(){

      //set the url
        String url = "https://restful-booker.herokuapp.com/booking/10";


        //send the request
        Response response =given().when().get(url);
        response.prettyPrint();

        //do assertion
        response.
                then().

                assertThat(). // without assethat it also works, it is traditional
                statusCode(200).//HTTP Status Code should be 200
                contentType("application/json").//Content Type should be JSON
                statusLine("HTTP/1.1 200 OK"); //Status Line should be HTTP/1.1 200 OK

    }



}
