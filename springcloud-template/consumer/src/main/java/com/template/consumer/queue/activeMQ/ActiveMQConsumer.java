package com.template.consumer.queue.activeMQ;


import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ActiveMQConsumer {



    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息

    @JmsListener(destination = "seckill")
    public void receiveQueue(String message) {
        //收到通道的消息之后执行秒杀操作(超卖)“““  pid  uid
        String[] array = message.split("@");



        //todo 发送邮件/短信

    }
}
