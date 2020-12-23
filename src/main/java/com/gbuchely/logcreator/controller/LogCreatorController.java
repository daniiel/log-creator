package com.gbuchely.logcreator.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class LogCreatorController {

    private static final Logger LOGGER = LogManager.getLogger(LogCreatorController.class.getName());

    private String testMessage = "This is a test message";
    private int http_session = 15;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    private String start() {
        LOGGER.info("{\"timestamp\":\"04-Sep-2019 17:16:24,260\", \"level\":\"INFO \", \"thread\":\"[crew-interface-service-cloud-akka.actor.default-dispatcher-14]\", \"logger\":\"com.swacorp.interfaceservice.akka.workers.FlightUpdateConsumerActor\", \"message\":\"{\"CISMessageStatus\" : \"RECEIVED\", \"workType\" : \"FLIGHT_UPDATE\", \"workID\" : \"c948df6e-5ad1-4e16-b4dd-c32538a76742\", \"cis-messagetimestamp\" : 0}\"}");
        LOGGER.debug("This is a DEBUG message");
        LOGGER.error("This is a ERROR message");
        LOGGER.warn("This is a WARN message");

        try {
            String a = null;
            a.equals("b");
        } catch (Exception e){
            LOGGER.error(e);
            LOGGER.error(e.getMessage(),e);
        }

        return testMessage;
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    private String message(@RequestBody Map request) {
        String message = request.get("message").toString();
        LOGGER.info(message);
        return message;
    }
}