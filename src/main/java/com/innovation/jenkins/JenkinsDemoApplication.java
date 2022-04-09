package com.innovation.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
        logger.info("Hello Main Method");
    }

    @PostConstruct
    public void init(){
        logger.info("Hello Spring boot");
    }
}
