package com.innovation.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

    @Test
    void contextLoads() {
        int total = 10 + 10;
        logger.info("Test is running");
        Assertions.assertEquals(20, total);
        logger.info("Test is finished");
    }
}
