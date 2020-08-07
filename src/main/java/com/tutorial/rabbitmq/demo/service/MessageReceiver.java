package com.tutorial.rabbitmq.demo.service;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;

import com.rabbitmq.client.Envelope;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageReceiver {

  Logger log = LoggerFactory.getLogger(MessageReceiver.class);

  public String receive(String url, String queue) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setUri(url);
    factory.setPassword("@smartcast00");

    System.out.println("Connet TO ..");
    log.debug("Connect to : " + url);

    Connection conn = factory.newConnection();
    Channel channel = conn.createChannel();
    String msg = "a";

    return msg;
  }


  public String receive(String host, String userName, String password, String virtualHost, String queue) throws Exception {

    return "test";
  }
}
