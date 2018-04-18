/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian
 * Date: 18-4-18
 * Time: 下午4:03
 */
@RestController
public class DcController {

    @Autowired
    private DcClient dcClient;

    @GetMapping(value = "/consumer")
    public String consumer(){
        return dcClient.consumer();
    }
}
