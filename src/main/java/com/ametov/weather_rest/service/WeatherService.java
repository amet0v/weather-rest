package com.ametov.weather_rest.service;

import com.ametov.weather_rest.dto.CurrentResponse;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import java.io.IOException;
import java.util.Optional;

@Service
public class WeatherService {
    private static final String key = "89f6928f1aa24906b8f103949241811";

    public static Optional<CurrentResponse> get(String city) throws IOException {
        Response<CurrentResponse> response = WeatherApiService.instance().currentResponse(key, city).execute();
        if (response.isSuccessful()){
            return Optional.ofNullable(response.body());
        }
        return Optional.empty();
    }
}
