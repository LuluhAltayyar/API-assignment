package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;


public class BaseUrl {

    protected RequestSpecification spec;
    @BeforeMethod
    public void setUp(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://api.restful-api.dev").setContentType(ContentType.JSON)
                .build();
    }
}
