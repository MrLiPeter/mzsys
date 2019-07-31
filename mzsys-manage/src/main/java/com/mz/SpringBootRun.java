package com.mz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/7/30
 */
@SpringBootApplication
@MapperScan("com.mz.mapper")
public class SpringBootRun {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRun.class,args);
    }
}
