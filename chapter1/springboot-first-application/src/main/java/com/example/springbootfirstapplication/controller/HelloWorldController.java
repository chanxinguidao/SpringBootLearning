package com.example.springbootfirstapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //等价于 @Controller + @ResponseBody
public class HelloWorldController {

    @GetMapping("/helloSpringBoot")   //等价于 @RequestMapping(method = {RequestMethod.GET})
    public String helloWorld(){
        return "helloWorld";
    }
}
