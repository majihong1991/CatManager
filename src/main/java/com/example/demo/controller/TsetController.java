package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author Majihong
 * @Date 2023-02-03 20:42
 */
@Controller
public class TsetController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, springboot111";
    }
}
