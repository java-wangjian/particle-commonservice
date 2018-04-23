/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian
 * Date: 18-4-20
 * Time: 下午4:23
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/from")
    public String getFrom(){
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
