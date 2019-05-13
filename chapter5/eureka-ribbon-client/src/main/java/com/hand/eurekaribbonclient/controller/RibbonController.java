package com.hand.eurekaribbonclient.controller;

import com.hand.eurekaribbonclient.service.RibbonService;
import com.hand.eurekaribbonclient.service.RibbonServiceHystrix;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/24 15:47
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;
    @Autowired
    private RibbonServiceHystrix ribbonServiceHystrix;

    @GetMapping("/hi")
    public String hi() {
        return ribbonServiceHystrix.hiFromClient();
        //return ribbonService.hiFromClient();
    }

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/load-balancer")
    public String load() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        return instance.getHost() + ":" + instance.getPort();
    }
}
