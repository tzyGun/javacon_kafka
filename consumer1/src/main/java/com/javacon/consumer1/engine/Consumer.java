package com.javacon.consumer1.engine;



import com.javacon.consumer1.City;
import com.javacon.consumer1.service.AlertService;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    private AlertService alertService;


    @KafkaListener(topics = "weather", groupId = "consumer-1")
    public void consume(byte[] message) throws IOException {
        final Decoder decoder = DecoderFactory.get().binaryDecoder(new ByteArrayInputStream(message), null);
        DatumReader<City> reader = new SpecificDatumReader<>(City.class);


        City city = reader.read(null, decoder);
        logger.info(String.format("#### -> Consumed message from Topic Weather and  extracted from WeatherData object (AlertWeatherStation) -> %s", city.toString()));
        alertService.sendAlertIfTempBelow(city);
    }
}