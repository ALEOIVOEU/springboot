package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/admin")
public class HelloCotroller {

//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ResponseBody
    @PostMapping("/getHello")
    public String getajax(String username,String password){
        System.out.println("账号："+username);
        System.out.println("密码："+password);
        return "12345";
    }
}
