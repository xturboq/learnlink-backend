package com.zecola.learnlink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.zecola.learnlink.mapper")
@EnableScheduling
public class LearnLinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnLinkApplication.class, args);
    }

}
