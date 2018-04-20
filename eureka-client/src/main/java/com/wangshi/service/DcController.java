/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian
 * Date: 18-4-18
 * Time: 上午10:05
 */
@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/dc")
    public String dc(){
        String services = "Service: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
