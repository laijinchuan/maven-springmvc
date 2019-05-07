package com.ljc.demo;


import org.springframework.boot.SpringApplication;

import java.util.Date;

public class test {
    public static void  main(String[] args){
StringBuffer  a=new StringBuffer();
if(true){
    a.append("你好\r\n不好");
}

if(a.length()!=0){
    System.out.print("可以"+a.toString()+"asda");
}else{
    System.out.print("不可以"+a);
}
    }
}
