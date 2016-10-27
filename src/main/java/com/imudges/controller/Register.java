package com.imudges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cyy on 2016/10/27.
 */
@Controller
public class Register {
    public String F_name;
    public String L_name;
    public String Email;
    public String Password;
    @RequestMapping(value = "/account.html",method = RequestMethod.GET)
    public String login(){
        return "account";
    }
    @ResponseBody
    @RequestMapping(value = "/user_register",method = RequestMethod.POST)
    public boolean Get(String first_name,String last_name,String email,String password1,String password2 ){
        F_name=first_name;
        L_name=last_name;
        Email=email;
        if(password1!=password2){
            return false;
        }
        else Password=password1;
        ToDatebase(F_name,L_name,Email,Password);
        return true;
    }
    public void ToDatebase(String name1,String name2,String email,String password){

    }
}
