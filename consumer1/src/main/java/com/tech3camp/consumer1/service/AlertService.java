package com.tech3camp.consumer1.service;


import com.tech3camp.consumer1.Alert;
import com.tech3camp.consumer1.City;
import com.tech3camp.consumer1.producer.Producer;
import com.tech3camp.consumer1.utils.ByteArraySerializerUtil;
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
            if(Long.parseLong(weatherData.getTemperature()) < 0L) {
                Alert alert = new Alert();
                alert.setMessage("Alert RCB : Załóż czapkę, jest ślisko, nie chódź w sandałach");
                try {
                    this.producer.sendMessage(ByteArraySerializerUtil.serialize(alert));
                    logger.info(String.format("#### -> Produced alert from Consumer 1 -> %s", alert.toString()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
