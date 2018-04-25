/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangjian
 * Date: 18-4-24
 * Time: 下午3:32
 */

@SpringBootApplication
@EnableTurbineStream
public class RabbitTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitTurbineApplication.class, args);
    }
}
