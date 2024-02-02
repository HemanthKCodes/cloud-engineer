package api;


import util.FakeResponseBuilder;
import io.restassured.response.Response;


public class GameAPI {

    private static final String baseUri = "http://localhost:8080";

    public static Response getSpecificGameDetails(String gameName) {

        //return given().baseUri(baseUri).queryParam("name", gameName).get("/game");
        return FakeResponseBuilder.createFakeResponse();
    }

    public static Response getDefaultGameDetails() {

        //return given().baseUri(baseUri).get("/game");
        return FakeResponseBuilder.createFakeResponse();
    }
}
