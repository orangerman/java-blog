package com.javafan.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author javafan
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }


    /**
     * 查出一些数据 在页面展示
     *
     * @return SUCCESS页面
     */
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "success";
    }


}
