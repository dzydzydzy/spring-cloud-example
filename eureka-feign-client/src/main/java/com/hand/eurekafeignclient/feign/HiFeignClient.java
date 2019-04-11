package com.hand.eurekafeignclient.feign;

import com.hand.eurekafeignclient.config.FeignClientConfig;
import com.hand.eurekafeignclient.config.HiFailBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/24 21:15
 */
@FeignClient(value = "eureka-client", configuration = FeignClientConfig.class,fallback = HiFailBack.class)
public interface HiFeignClient {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);
}
