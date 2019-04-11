package com.hand.eurekafeignclient.config;

import com.hand.eurekafeignclient.feign.HiFeignClient;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/26 23:10
 */
@Component
public class HiFailBack implements HiFeignClient {

    @Override
    public String hi(String name) {
        return "hystrix error";
    }
}
