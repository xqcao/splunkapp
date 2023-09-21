package com.example.livelogdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@RestController
public class OneController {
    private static final Logger testLogger = LoggerFactory.getLogger("testhttp");

    @RequestMapping("/good")
  public String sayNiceDay(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
        String date = df.format(new Date());
      String jsonMsg = String.format("{event:'CancerCenterTest','time':%s}",date);
        testLogger.info(jsonMsg);
System.out.println("sayNiceDay is called, "+ date);
      return String.format("it's a nice day, %s",date);
  }
}
