package tech.marcandreher.twitterapi;

import okhttp3.OkHttpClient;

public class TwitterAPIClient {

    private final String OEMBED_URL = "https://publish.twitter.com/oembed";

    private OkHttpClient httpClient;

    public TwitterAPIClient() {
        httpClient = new OkHttpClient();
    }

    
    
}
