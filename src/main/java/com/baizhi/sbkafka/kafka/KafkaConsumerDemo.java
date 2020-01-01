package com.baizhi.sbkafka.kafka;

import com.baizhi.sbkafka.entity.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerDemo {
    @KafkaListener(topics = "t7")
    public void receive(ConsumerRecord<String, User> record) {
        System.out.println(record.key() + "\t" + record.value());
    }
}
