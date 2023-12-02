package com.deean.mybatisplusdemo02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.deean.mybatisplusdemo02.mapper")
public class MyBatisPlusDemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusDemo02Application.class, args);
    }

}
