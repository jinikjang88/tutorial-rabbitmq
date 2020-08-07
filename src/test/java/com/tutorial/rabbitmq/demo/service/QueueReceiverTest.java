package com.tutorial.rabbitmq.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Message;

public class QueueReceiverTest {
  final static String host = "localhost";
  final static String vhost = "";
  final static int port = 5672;
  final static String user = "guest";
  final static String password = "guest";
  final static String queue = "SEND_0";


  @Test
  public void MessageReceiverTest() throws Exception {
    MessageReceiver receiver = new MessageReceiver();
    String url = "amqp://"+user+"@"+host+":"+port+"/"+vhost;
    String msg = receiver.receive(url, queue);
    assertNotNull(msg);

  }

}
