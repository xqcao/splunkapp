package com.example.livelogdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.splunk.logging.*;

import java.util.Date;

@RestController
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);
    private static final Logger liveLogger = LoggerFactory.getLogger("systemout");
    private static final Logger secondLogger = LoggerFactory.getLogger("http");
    @RequestMapping("/ping")
    public String ping(){
        logger.info("This is an example log message.");
        liveLogger.info("This is an example log message.----live log to splunk");
        System.out.println("ping is called........");
        return "Pong";
    }
    @RequestMapping("/hi")
    public String sayHi(){
        System.out.println("sayHi is called........");
        Date date = new Date();
        String jsonMsg = String.format("{event:'CancerCenterTest'}");
        secondLogger.info("CancerCenterTest1");
        secondLogger.info(jsonMsg);
        liveLogger.info("CancerCenterTest");
        liveLogger.info(jsonMsg);
        liveLogger.info(jsonMsg);
        liveLogger.info(jsonMsg);
        String ss ="{\"event\":\"Hello, World!\"}";
        secondLogger.info("CancerCenterTest2");
        secondLogger.info(ss);
        liveLogger.info(ss);
        System.out.println("sayHi is called........"+jsonMsg);
        secondLogger.info("This is a test event for Logback test");
        liveLogger.error("This is a test error for Logback test");

        return "hi, nice to meet you";
    }
}
