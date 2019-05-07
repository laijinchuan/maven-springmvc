package com.ljc.controller;

import com.ljc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/jsp")
public class loginCon {
    @RequestMapping("/login")
    public ModelAndView login(User user) {
        ModelAndView modelAndView = new ModelAndView();
        if (user.getUsername() != null) {
            modelAndView.setViewName("jsp/loginSuccess");
            modelAndView.addObject("user", "赖金川");
        }else{
            modelAndView.setViewName("jsp/login");
        }
       return modelAndView;
    }
    @RequestMapping("/loginIndex")
    public String loginIndex(){

        return "jsp/login";
    }
    @RequestMapping("/upload")
    public ModelAndView  upload( MultipartFile userHead)throws  Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jsp/upload");
        if(userHead!=null){
            String filePath="D:\\IEDA\\image\\";
            String fileName = userHead.getOriginalFilename();
            String newFileName= UUID.randomUUID()+fileName.substring(fileName.lastIndexOf("."));
            File file = new File(filePath + newFileName);
            userHead.transferTo(file);
            modelAndView.addObject("userHead",newFileName);

            return  modelAndView;
        }
        return  modelAndView;
    }
}
