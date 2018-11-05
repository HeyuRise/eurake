package com.heyu.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 孙贺宇
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        Map<String, String> param = new HashMap<>(2);
        param.put("name", name);
        return restTemplate.getForObject("http://SERVICE-HI/hi", String.class, param);
        // restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
