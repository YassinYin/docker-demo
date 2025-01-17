package com.yinrj.dockerspringdemo.controller;

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


    @GetMapping("test")
    public String test(@RequestParam("a") String a) {
        return a;
    }

}
