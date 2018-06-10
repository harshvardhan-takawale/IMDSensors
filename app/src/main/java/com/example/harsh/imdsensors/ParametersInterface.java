package com.example.harsh.imdsensors;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ParametersInterface {
    @GET("/channels/489462/fields/1.json")
    Call<ParamModel> getParam(
      @Query("api_key") String apikey,
      @Query("results") String param1);

}
