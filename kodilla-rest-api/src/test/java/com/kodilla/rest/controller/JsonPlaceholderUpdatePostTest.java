import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class JsonPlaceholderUpdatePostTest {

    @Test
    void updatePostUsingMapTest() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Map<String, Object> updatedPostData = new HashMap<>();
        updatedPostData.put("id", 1);
        updatedPostData.put("title", "Updated title");
        updatedPostData.put("body", "Updated body");
        updatedPostData.put("userId", 1);

        given()
                .header("Content-Type", "application/json")
                .body(updatedPostData)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("Updated title"))
                .body("body", equalTo("Updated body"))
                .body("userId", equalTo(1));
    }
}

