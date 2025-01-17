package com.yinrj.dockerspringdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Name: TestController
 * Author: yinrongjie
 * Date: 2025/1/16
 */
@RestController
public class TestController {

    @Value("${util.config.test}")
    private String content;


    @GetMapping("test")
    public String test(@RequestParam("a") String a) {
        return a;
    }


    @GetMapping("test1")
    public String test1(@RequestParam("a") String a) {
        return a + " " + content;
    }

}
