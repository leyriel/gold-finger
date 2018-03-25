package com.example.leyri.health;
import com.loopj.android.http.*;

public class Client {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static AsyncHttpClient RestClient = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        RestClient.get(baseURI(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        RestClient.post(baseURI(url), params, responseHandler);
    }

    private static String baseURI(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

}
