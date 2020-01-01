package com.wjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 30239
 * @SpringBootApplication 标注 此类是一个  Springboot应用  App
 * @create 2020-01-01-14:35
 */
@SpringBootApplication
public class Starter {
    public static void main(String[] args) {
        // 应用的入口
        SpringApplication.run(Starter.class, args);


    }

}
