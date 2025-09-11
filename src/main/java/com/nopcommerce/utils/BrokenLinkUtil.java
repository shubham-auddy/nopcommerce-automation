package com.nopcommerce.utils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.openqa.selenium.WebElement;

public class BrokenLinkUtil {

    private static final HttpClient client = HttpClient.newHttpClient();

    // Pass WebElement, extract href, check if broken
    public static boolean isLinkBroken(WebElement element) {
        String url = element.getAttribute("href");
        
        // Skip null, empty, or javascript/mailto links
        if (url == null || url.isEmpty() || url.startsWith("javascript") || url.startsWith("mailto")) {
            return false;
        }

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .method("HEAD", HttpRequest.BodyPublishers.noBody())
                    .build();

            HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
            int status = response.statusCode();
            return status >= 400;
        } catch (Exception e) {
            return true; // treat errors as broken
        }
    }
}