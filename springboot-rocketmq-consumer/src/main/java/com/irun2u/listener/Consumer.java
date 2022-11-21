package com.irun2u.listener;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @Author: haifei
 * @Date: 2022/11/8 16:31
 */
@Component
@RocketMQMessageListener(
        topic = "springboot-rocketmq",
        //consumeMode = ConsumeMode.ORDERLY, //广播CONCURRENTLY;负载均衡ORDERLY(默认)
        consumerGroup = "${rocketmq.consumer.group}"
)
public class Consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("接收到消息：" + s);
    }
}
