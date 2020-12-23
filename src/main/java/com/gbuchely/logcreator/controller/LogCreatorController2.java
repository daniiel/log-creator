package com.gbuchely.logcreator.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class LogCreatorController2 {

    private static final Logger LOGGER = LogManager.getLogger(LogCreatorController2.class.getName());

    private String testMessage = "This is a HttpSession metric";
    private int http_session = 15;

    @RequestMapping(value = "/metric", method = RequestMethod.GET)
    private String start() {
        LOGGER.info("");
        LOGGER.info("{\"http-session\":"+ http_session +",\"time\":3}");
        return testMessage;
    }
}