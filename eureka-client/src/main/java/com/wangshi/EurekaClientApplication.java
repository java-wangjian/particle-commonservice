/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by wangjian
 * Date: 18-4-17
 * Time: 下午5:46
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
