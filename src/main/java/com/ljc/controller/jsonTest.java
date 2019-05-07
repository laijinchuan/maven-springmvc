package com.ljc.controller;

import com.ljc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class jsonTest {
    @RequestMapping("/requestJson")
    public @ResponseBody User requestJson(@RequestBody User user){
        return user;
    }
    @RequestMapping("/responseJson")
    public @ResponseBody User responseJson( User user){
        return user;
    }
}
