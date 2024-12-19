package com.ametov.weather_rest.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherApiService {
    private static WeatherApi api;
    private static final String baseUrl = "https://api.weatherapi.com";

    private static WeatherApi init(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(WeatherApi.class);
    }

    public static WeatherApi instance() {
        if (api == null) {
            api = init();
        }
        return api;
    }
}
