package com.example.harsh.imdsensors;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String baseurl = "https://api.thingspeak.com";
    public static Retrofit retrofit = null;

    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(baseurl).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
