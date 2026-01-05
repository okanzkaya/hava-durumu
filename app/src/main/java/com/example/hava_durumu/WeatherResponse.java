package com.example.hava_durumu;

import com.google.gson.annotations.SerializedName;

public class WeatherResponse {

    @SerializedName("current_weather")
    public CurrentWeather currentWeather;

    public static class CurrentWeather {
        @SerializedName("temperature")
        public double temperature;

        @SerializedName("windspeed")
        public double windspeed;

        @SerializedName("weathercode")
        public int weathercode;
    }

    // UI için basit açıklama (risksiz)
    public String getDescriptionTr() {
        if (currentWeather == null) return "-";
        int code = currentWeather.weathercode;

        // Çok temel eşleme (yeterli)
        if (code == 0) return "Açık";
        if (code == 1 || code == 2) return "Parçalı Bulutlu";
        if (code == 3) return "Bulutlu";
        if (code == 45 || code == 48) return "Sisli";
        if (code >= 51 && code <= 67) return "Çiseleme / Yağmur";
        if (code >= 71 && code <= 77) return "Kar";
        if (code >= 80 && code <= 82) return "Sağanak";
        if (code >= 95) return "Fırtına";
        return "Bilinmiyor";
    }
}
