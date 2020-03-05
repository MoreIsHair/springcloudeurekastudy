package com.yy.consume1.controller;

import com.yy.consume1.api.Product1Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YY
 * @Date: 2019/7/9
 * @Description:
 */
@RestController
@RequestMapping
@Slf4j
public class HelloWordController {

    @Autowired
    public Product1Hello product1Hello;
    @GetMapping("/hello")
    public String hello(){
        log.info("consun1---------调用product1");
        return product1Hello.hello();
    }
}
