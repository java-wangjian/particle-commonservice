/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.controller;

import com.wangshi.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian
 * Date: 18-4-23
 * Time: 上午11:29
 */

@RestController
public class DcController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/consumer")
    public String consumer(){
        return consumerService.consumer();
    }
}
