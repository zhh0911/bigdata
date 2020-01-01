package com.baizhi.sbkafka.kafka;

import com.baizhi.sbkafka.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class KafkaProducerDemo {
    @Autowired
    private KafkaTemplate<String,User> template;

    // 计划任务，定时发送数据
    // cron 秒 分 时 日 月 周 年(省略)
    @Scheduled(cron = "0/10 * * * * ?")
    public void send(){
        User user = new User(1, "zhangsan", new Date());
        template.send("t7", UUID.randomUUID().toString(),user);

        System.out.println(new Date());
    }
}
