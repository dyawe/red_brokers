package com.turntabl.redbrokers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.turntabl.marketdata"})
public class RedBrokersApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBrokersApplication.class, args);
    }

}
