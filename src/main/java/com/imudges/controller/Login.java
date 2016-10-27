package com.imudges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cyy on 2016/10/26.
 */
@Controller
public class Login {
    public String Email;
    public String PassWord;
    @RequestMapping(value = "/login.html",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @ResponseBody
    @RequestMapping(value = "/user_login",method = RequestMethod.POST)
    public String Get(String email,String password){
        Email=email;
        PassWord=password;
        return email;
    }
}
