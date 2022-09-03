package com.fxh.austin.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/hello")
    private String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        logger.error("error logback for austin");
        logger.info("info logback for austin");
        return String.format("Hello %s", name);
    }
}
