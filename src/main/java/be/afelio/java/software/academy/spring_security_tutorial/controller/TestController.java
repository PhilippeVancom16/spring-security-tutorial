package be.afelio.java.software.academy.spring_security_tutorial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @PreAuthorize("hasRole('ROLE_ADMIN')")    // Premiere methode
    @RequestMapping("/test")
    public void test() {
        LOGGER.info("test");
    }
}
