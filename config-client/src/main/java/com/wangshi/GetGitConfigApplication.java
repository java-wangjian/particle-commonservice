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
 * Date: 18-4-20
 * Time: 上午10:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GetGitConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetGitConfigApplication.class, args);
    }
}
