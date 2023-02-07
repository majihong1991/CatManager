package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Majihong
 * @Date 2023-02-03 20:42
 */
@Api(tags = "再遇swagger")
@RestController
@RequestMapping("/swagger")
public class TsetController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, springboot111";
    }
}
