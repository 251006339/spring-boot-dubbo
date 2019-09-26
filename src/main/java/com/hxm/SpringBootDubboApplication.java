package com.hxm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//引入依赖  --zkclient 和dubbo 都到引入
//配置dubbo的注册中心地址
//引入服务
//消费者 customer

@SpringBootApplication
public class SpringBootDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboApplication.class, args);
    }

}
