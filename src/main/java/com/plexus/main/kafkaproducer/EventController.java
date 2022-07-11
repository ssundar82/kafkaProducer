package com.plexus.main.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.plexus.main.kafkaproducer.model.Order;

@RestController
@RequestMapping("order")
public class EventController {

    @Autowired
    ServiceProducer serviceProducer;

    @PostMapping("/push")
    public String send(@RequestBody String message) {
        serviceProducer.sendMessage(message);
        return ("Message Published Successfully to topic");
    }

    @PostMapping("/publish")
    public String send(@RequestBody Order order) {
        serviceProducer.sendMessage((order));
        return ("Message Published Successfully to topic");
    }
}
