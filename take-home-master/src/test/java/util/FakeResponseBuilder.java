package util;

import io.restassured.builder.ResponseBuilder;
import io.restassured.response.Response;

public class FakeResponseBuilder {

    public static Response createFakeResponse() {


        int id = 123; // Replace with your desired dynamic ID
        String text = "Some string"; // Replace with your desired dynamic text


        // Build the fake response
        ResponseBuilder responseBuilder = new ResponseBuilder()
                .setStatusCode(200)
                .setContentType("ContentType.JSON")
                .setBody("{\"id\": " + id + ", \"text\": \"" + text + "\"}");

        return responseBuilder.build();


    }

    public static void main(String[] args) {
        Response fakeResponse = createFakeResponse();
        fakeResponse.prettyPrint();

    }
}
