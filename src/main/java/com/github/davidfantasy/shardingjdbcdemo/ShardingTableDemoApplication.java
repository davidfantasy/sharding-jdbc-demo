package com.github.davidfantasy.shardingjdbcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.davidfantasy.shardingjdbcdemo.dao")
public class ShardingTableDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingTableDemoApplication.class, args);
    }

}
