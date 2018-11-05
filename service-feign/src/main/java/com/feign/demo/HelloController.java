package com.feign.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙贺宇
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private FeignService feignService;

    @GetMapping
    public Object hello(){

        return feignService.hello("5623441");
    }
}
