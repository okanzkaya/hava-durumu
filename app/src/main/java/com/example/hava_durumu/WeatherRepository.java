package com.example.hava_durumu;

import retrofit2.Call;

public class WeatherRepository {

    private final WeatherApiService apiService;

    public WeatherRepository(WeatherApiService apiService) {
        this.apiService = apiService;
    }

    public Call<WeatherResponse> fetchWeather(double lat, double lon) {
        return apiService.getWeather(lat, lon, true);
    }
}
