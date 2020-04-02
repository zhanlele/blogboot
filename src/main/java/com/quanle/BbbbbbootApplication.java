package com.quanle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan("com.quanle.mapper")
public class BbbbbbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbbbbbootApplication.class, args);
    }

}
