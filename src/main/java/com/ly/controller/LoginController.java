package com.ly.controller;


import com.ly.entity.UserEntity;
import com.ly.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(){

        return "/login";

    }

    @RequestMapping("/judge")
    @ResponseBody
    public String judgeLogin(String username,String password){

        boolean status = loginService.judge(username,password);

        if(status){
            return "success";
        }

        return "fail";

    }

}