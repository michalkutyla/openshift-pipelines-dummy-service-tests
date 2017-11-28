package org.kutyla.openshift;

import org.junit.Test;
import org.kutyla.openshift.testenv.EnvironmentFactory;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicAcceptanceTest {

    private String baseUrl = EnvironmentFactory.getEnvironment().getHttpBaseUrl();

    @Test
    public void statusTest() {
        given()
                .baseUri(baseUrl)
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .body(containsString("I'm allright."));
    }

}