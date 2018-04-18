/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wangjian
 * Date: 18-4-18
 * Time: 下午4:01
 */
@FeignClient(value = "eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
