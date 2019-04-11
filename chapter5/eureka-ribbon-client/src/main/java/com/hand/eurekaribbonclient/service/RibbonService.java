package com.hand.eurekaribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/24 15:44
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public String hiFromClient() {
        return restTemplate.getForObject("http://eureka-client/hi?name=dzy", String.class);
    }
}
