package com.javacon.consumer1.service;


import com.javacon.consumer1.producer.Producer;
import com.javacon.consumer1.utils.ByteArraySerializerUtil;
import com.javacon.consumer1.Alert;
import com.javacon.consumer1.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class AlertService {
    private final Logger logger = LoggerFactory.getLogger(AlertService.class);
    private final Producer producer;

    @Autowired
    public AlertService(final Producer producer) {
        this.producer = producer;

    }

    public void sendAlertIfTempBelow(City city) {
        city.getWeatherDatas().forEach(weatherData-> {
            if(Double.parseDouble(weatherData.getTemperature()) < 0.0d) {
                Alert alert = new Alert();
                alert.setMessage("Alert RCB : Załóż czapkę, jest ślisko, nie chódź w sandałach");
                try {
                    this.producer.sendMessage(ByteArraySerializerUtil.serialize(alert));
                    logger.info(String.format("#### -> Produced alert from Consumer 1 (AlertWeatherStation) -> %s", alert.toString()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
