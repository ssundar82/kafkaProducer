package com.plexus.main.kafkaproducer;

import com.plexus.main.kafkaproducer.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.kafka.support.SendResult;

@Service
public class ServiceProducer {

    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    public KafkaTemplate<String, Order> orderKafkaTemplate;

    @Value("${org.apache.kafka.common.internal.topic}")
    String Topic;

    public void sendMessage(String value) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(Topic, value);
        future.addCallback(new ListenableFutureCallback() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Messages failed to push on topic");
            }

            @Override
            public void onSuccess(Object result) {
                System.out.println("Messages successfully pushed on topic");
            }
        });
    }

    public String sendMessage(Order value) {
        ListenableFuture<SendResult<String, Order>> future = orderKafkaTemplate.send(Topic, value);
        future.addCallback(new ListenableFutureCallback() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Messages failed to push on topic");
            }

            @Override
            public void onSuccess(Object result) {
                System.out.println("Messages successfully pushed on topic");

            }

        });
        return ("Message Published Successfully to topic");
    }
}
