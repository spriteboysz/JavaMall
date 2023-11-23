package com.deean.tkmapperdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.deean.tkmapperdemo.mapper")
public class TkMapperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMapperDemoApplication.class, args);
    }

}
