package com.yy.product1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YY
 * @Date: 2019/7/9
 * @Description:
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,welcome to product1";
    }
}
