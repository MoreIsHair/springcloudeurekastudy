package com.yy.consume1.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: YY
 * @Date: 2019/7/9
 * @Description:
 */
@FeignClient(value = "product1")
public interface Product1Hello {
    @RequestMapping(value = "/hello")
     String hello();
}
