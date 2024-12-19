package com.ametov.weather_rest.controller;

import com.ametov.weather_rest.dto.CurrentResponse;
import com.ametov.weather_rest.service.WeatherService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WeatherController {
    @GetMapping("/api/v1/weather")
    public CurrentResponse byIp(HttpServletRequest request) throws IOException {
        return WeatherService.get(request.getRemoteAddr()).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/api/v1/weather/{city}")
    public CurrentResponse byCity(@PathVariable String city) throws IOException {
        return  WeatherService.get(city).orElseThrow(RuntimeException::new);
    }
}
