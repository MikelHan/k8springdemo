package com.example.hellojib.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello, "+ new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(new Date());
    }

}
