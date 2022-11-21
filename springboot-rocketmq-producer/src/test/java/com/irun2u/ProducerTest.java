package com.irun2u;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: haifei
 * @Date: 2022/11/8 14:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MQProducerApplication.class})
@Slf4j
public class ProducerTest {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    public void testSendMsg(){
        rocketMQTemplate.convertAndSend("springboot-rocketmq", "hello springboot and rocketmq");
        //主题、消息
        log.info("消息发送成功");
    }
}
