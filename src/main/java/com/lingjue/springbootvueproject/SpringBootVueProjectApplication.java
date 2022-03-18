package com.lingjue.springbootvueproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KamenRider
 */
@SpringBootApplication
@MapperScan("com.lingjue.springbootvueproject.dao")
public class SpringBootVueProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVueProjectApplication.class, args);
    }

}
