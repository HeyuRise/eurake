package com.heyu.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iunin
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public Object hello(){
        return helloService.hiService("你好");

    }
}
