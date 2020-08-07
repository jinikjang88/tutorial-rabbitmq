package com.tutorial.rabbitmq.demo.service;

import com.tutorial.rabbitmq.demo.message.CustomMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CustomMessageListener {

  @RabbitListener(queues = "DID_SEND_0")
  public void receiveMessage(final CustomMessage message) {
    System.out.println(message);
  }

}
