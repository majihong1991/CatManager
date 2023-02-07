package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试 Swagger")
@RestController
@RequestMapping("/swagger")
@Slf4j
public class SwaggerController {
    @ApiOperation("测试")
    @GetMapping("/test")
    @ResponseBody
    public String test(int numb) {

        log.info("输入的numb是"+numb);
        String aaa="";
        if(numb==1){
            aaa="输入是1";

        }else if(numb==2){
            aaa="输入是2";
        }else{
            aaa="输入是其他";
        }
        return aaa;
    }
}
