package com.hand.eurekafeignclient.controller;

import com.hand.eurekafeignclient.feign.HiFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/24 21:25
 */
@RestController
public class FeignController {
    @Autowired
    private HiFeignClient feignClient;

    @GetMapping("/feign-test")
    public String hi(@RequestParam String name) {
        return feignClient.hi(name);
    }
}
