package com.kfit.demo.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kfit.demo.bean.Demo;
import com.kfit.demo.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/test1")
    public String test(){
//     for(Demo d:testService.getList()){
//         System.out.println(d);
//     }
        for(Demo d:testService.getListByDs()){
            System.out.println(d);
        }
        for(Demo d:testService.getListByDs1()){
            System.out.println(d);
        }
        for(Demo d:testService.getListByDs2()){
            System.out.println(d);
        }
        for(Demo d:testService.getListByDs3()){
            System.out.println(d);
        }
        return "ok";
    }

}