package com.atzzuli.traning;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 刘京毫
 */
@SpringBootApplication
public class TraningApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraningApplication.class, args);
    }

}
