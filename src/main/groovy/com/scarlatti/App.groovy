package com.scarlatti

import groovy.util.logging.Slf4j

/**
 * Created by pc on 9/8/2017.
 */

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
@Slf4j
class App {

    @Autowired ConfigurableApplicationContext ctxt

    static void main(String[] args) {
        SpringApplication.run(App.class, args)
    }
}