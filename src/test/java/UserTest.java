import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UserTest {
    @Test
    void singleUser() {
        given()
                .spec(SpecsBase.request)
                .when()
                .get("/users/2")
                .then()
                .spec(SpecsBase.responseSpec)
                .log().body();

    }
}
