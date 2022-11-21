package com.irun2u;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: haifei
 * @Date: 2022/11/8 16:24
 */
@Slf4j
@SpringBootApplication
public class MQConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MQConsumerApplication.class);
        log.info("消费者启动成功");
    }
}
