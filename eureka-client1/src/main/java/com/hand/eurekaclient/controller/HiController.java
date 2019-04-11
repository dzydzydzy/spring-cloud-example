package com.hand.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/24 15:27
 */
@RestController
public class HiController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hi(String name) {
        return "hi " + name + ",I an from " + port;
    }
}
