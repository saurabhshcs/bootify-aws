package com.techsharezone.bootifyawssqs.controller;

/*
 * @created 03/12/2020 -23:48
 * @project bootify-aws-sqs
 * @author  saurabhshcs
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AwsSQSClientContrller {

    private static final Logger LOG = LoggerFactory.getLogger(AwsSQSClientContrller.class);

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String endpoint;

    @GetMapping("/send/{message}")
    public void sendMessage(@PathVariable String message) {
        queueMessagingTemplate.send(endpoint, MessageBuilder.withPayload(message).build());
    }

    @SqsListener("techsharezoneQueue")
    public void loadMessage(String message) {
        LOG.info("Received message from SQS Queue: ", message);
    }
}
