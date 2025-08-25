package oop;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchData {
    private static final String apiUrl = "https://api.github.com/users/google";

    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(apiUrl)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Respond body: " + response.body());

        } catch (IOException | InterruptedException e) {
            System.err.println("Error making http request: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
