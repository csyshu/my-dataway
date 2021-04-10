package com.csy.dataway;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shuyun.cheng
 */
@EnableHasor
@EnableHasorWeb
@SpringBootApplication
public class DatawayTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatawayTestApplication.class, args);
    }

}
