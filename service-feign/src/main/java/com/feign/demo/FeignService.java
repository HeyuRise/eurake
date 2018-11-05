package com.feign.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author iunin
 */
@FeignClient(value = "service-hi")
public interface FeignService {

    @GetMapping("/hi")
    String hello(@RequestParam(value = "name") String name);

}
