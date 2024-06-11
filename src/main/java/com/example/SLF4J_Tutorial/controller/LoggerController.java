package com.example.SLF4J_Tutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoggerController {

//    private static final Logger logger= LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/")
    public String index(){
        // By default, info, warn and error is enabled in spring boot

        int example=34;

        log.trace("this is trace message, we can also provide arguments like this {}",example);
        log.debug("this is debug message");
        log.info("this is info message");
        log.warn("this is warn message");
        log.error("this is error message");
        return "see the logs";
    }
}

/**
  check the logs in the terminal voh is format ke hote hai dateAndTime LoggingLevel ProcessId packageName LoggingMessage
 */

/**
    Hume baar baar har class mai ye likhna padega

    private static final Logger logger= LoggerFactory.getLogger(LoggerController.class);

    Toh isse achha hum lombok ki annotation @Slf4j use kr skte hai but usme loggger.warn() nhi log.warn() chalega, usme LOGGER instance ka naam log hota hai
 */
