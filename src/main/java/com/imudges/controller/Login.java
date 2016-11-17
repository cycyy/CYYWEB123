package com.imudges.controller;

import com.imudges.model.UserEntity;
import com.imudges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cyy on 2016/10/26.
 */
@Controller
public class Login {
    @Autowired
    private UserRepository userRepository;
    public String Email;
    public String PassWord;
    @RequestMapping(value = "/login.html",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    //@ResponseBody
    @RequestMapping(value = "/user_login",method = RequestMethod.POST)
    public String  Verification(String email,String password){
        UserEntity userEntity=userRepository.findByEmail(email) ;
        if(userEntity==null){
            return "login";
        }
        else{
            if(userEntity.getPassword()==password)
                return "index";
            else
                return "login";
        }
    }
}
