package com.xiaozl.springbootintegrationmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaozl.springbootintegrationmybatis.dao") // 这个注解不加，无法创建CityDao这个bean，也就是没法创建mapper
public class SpringbootintegrationmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootintegrationmybatisApplication.class, args);
    }

}
