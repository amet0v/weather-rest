package com.ametov.weather_rest.service;

import com.ametov.weather_rest.dto.CurrentResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    //@GET("/v1/current.json?key=89f6928f1aa24906b8f103949241811&aqi=yes")
    @GET("/v1/current.json?&aqi=yes")
    Call<CurrentResponse> currentResponse(@Query("key") String key, @Query("q") String city);
}
