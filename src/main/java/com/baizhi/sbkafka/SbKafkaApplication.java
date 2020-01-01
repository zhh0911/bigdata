package com.baizhi.sbkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbKafkaApplication.class, args);
    }

}
