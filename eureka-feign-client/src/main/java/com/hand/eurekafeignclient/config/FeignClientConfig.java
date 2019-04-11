package com.hand.eurekafeignclient.config;

import feign.Retryer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/24 21:15
 */
@Configuration
public class FeignClientConfig {
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
