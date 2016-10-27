package com.imudges.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cyy on 2016/10/26.
 */
public class Login {
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Get(String email,String password){
        return email;
    }
}
