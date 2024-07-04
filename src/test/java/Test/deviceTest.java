package Test;

import baseUrl.BaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.Data;
import pojos.Devic;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class deviceTest extends BaseUrl {


    @Test
    public void test() {

        // Set Url
        spec.pathParam("first", "objects");

        // Set Expected data
        Data data = new Data(2023,7999.99,  "Apple ARM A7", "1 TB");
        Devic payload = new Devic( "Apple Max Pro 1TB", data);

        // Send request and get respnse
        Response response = given(spec).body(payload).when().post("{first}");
        response.prettyPrint();

        // Sample Response Validation
        response.then().assertThat()
                .body("id", notNullValue())
                .body("name", equalTo("Apple Max Pro 1TB"))
                .body("createdAt", notNullValue())
                .body("data.year", equalTo(2023))
                .body("data.price", equalTo(7999.99f))
                .body("data.'CPU model'", equalTo("Apple ARM A7"))
                .body("data.'Hard disk size'", equalTo("1 TB"));


        // Do Assertions
        Devic actualData = response.as(Devic.class);

        assertEquals(payload.getName(), actualData.getName());
        assertEquals(payload.getData().getPrice(), actualData.getData().getPrice());
        assertEquals(payload.getData().getYear(), actualData.getData().getYear());
        assertEquals(payload.getData().getCpuModel(), actualData.getData().getCpuModel());
        assertEquals(payload.getData().getHardDiskSize(), actualData.getData().getHardDiskSize());

        // Validate id and createdAt are not null
        assertNotNull(actualData.getId(), "ID should not be null");
        assertNotNull(actualData.getCreatedAt(), "CreatedAt should not be null");


        // Adding validation
        if (response.path("id") != null && response.path("createdAt") != null) {
            System.out.println("ID and createdAt are not null");
        } else {
            System.out.println("ID or createdAt is null");
        }
    }

}
