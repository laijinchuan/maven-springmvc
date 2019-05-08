package com.ljc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
@Controller
public class loginController {
    @RequestMapping("/login")
    public  String  login(HttpSession session,String username, String password){
            //验证身份信息
            //把信息保存在session中
        session.setAttribute("username",username);
        return "redirect:/loginSuccess";
    }
    @RequestMapping("/logout")
    public  String logout(HttpSession session){
        session.invalidate();
        //
        return "redirect:/loginSuccess";
    }
    @RequestMapping("/loginSuccess")
    public String loginSuccess(){
        return "jsp/loginSuccess";
    }
}
