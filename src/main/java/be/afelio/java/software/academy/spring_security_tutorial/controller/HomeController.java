package be.afelio.java.software.academy.spring_security_tutorial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")     // Premiere methode
    @RequestMapping("/home")
    public void hello() {
        LOGGER.info("hello");
    }


    @RequestMapping("/securityNone")
    public void none() {
        LOGGER.info("none");
    }
}
