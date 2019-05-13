package com.hand.eurekaribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/05/12 8:59
 */
@Service
public class RibbonServiceHystrix {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiFromClient() {
        return restTemplate.getForObject("http://eureka-client/hi?name=dzy", String.class);
    }

    public String hiError() {
        return "error";
    }
}
