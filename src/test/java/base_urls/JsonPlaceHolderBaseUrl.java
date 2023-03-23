package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class JsonPlaceHolderBaseUrl {

    RequestSpecification spec;

    public void setup(){
        spec =new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/todos/23").build();


    }

}
