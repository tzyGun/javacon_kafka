package com.javacon.producer.service;


import com.javacon.producer.City;
import com.javacon.producer.WeatherData;
import com.javacon.producer.dto.CityDTO;
import com.javacon.producer.dto.WeatherDataDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class WeatherService {


    public WeatherService() {

    }

    public City getWeatherDataForCity(CityDTO cityDTO) {

        City city = new City();

        city.setCityname(cityDTO.getCityName());
        city.setVoivodeship(cityDTO.getVoivodeship());
        List<WeatherDataDTO> weatherDataDTOS = cityDTO.getWeatherData();
        List<WeatherData> weatherDatas = mapWeatherDataDTOtoWeatherData(weatherDataDTOS);
        city.setWeatherDatas(weatherDatas);

        return city;
    }

    private List<WeatherData> mapWeatherDataDTOtoWeatherData(List<WeatherDataDTO> weatherDataDTOS) {
        return weatherDataDTOS.stream().map((weatherDataDTO -> {
            WeatherData weatherData = new WeatherData();
            weatherData.setTemperature(weatherDataDTO.getTemperature());
            weatherData.setPressure(weatherDataDTO.getPressure());
            weatherData.setMessage(weatherDataDTO.getMessage());
            return weatherData;
        })).collect(Collectors.toList());
    }
}
