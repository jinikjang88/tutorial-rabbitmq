package com.tutorial.rabbitmq.demo.service;

import com.tutorial.rabbitmq.demo.message.CustomMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

  private static final String topicExchange = "spring-boot-exchange";

  private final RabbitTemplate rabbitTemplate;

  public Runner(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Sending message....");

//    rabbitTemplate.convertAndSend(topicExchange, "foo.bar.baz", "Hello Message!!");

//    CustomMessage message = CustomMessage.builder().ptName("1").pickNo("2").callNo("3").build();
//
//    rabbitTemplate.convertAndSend(topicExchange, "foo.bar.baz", message);

  }
}
