package com.hand.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/30 18:57
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${name}")
    private String name;

    @GetMapping("/name")
    public String config() {
        return "I am " + name;
    }
}
