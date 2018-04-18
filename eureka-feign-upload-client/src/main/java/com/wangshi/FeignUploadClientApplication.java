/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by wangjian
 * Date: 18-4-17
 * Time: 下午5:46
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignUploadClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignUploadClientApplication.class, args);
    }
}
