package com.imudges.controller;

import com.imudges.repository.OrderRepository;
import com.imudges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cyy on 2016/10/27.
 */
@Controller
public class Register {
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(value = "/account.html",method = RequestMethod.GET)
    public String login(){
        return "account";
    }
    //@ResponseBody
    @RequestMapping(value = "/user_register",method = RequestMethod.POST)
    public String Get(String first_name,String last_name,String email,String password,String ensure_password ){
        UserEntity userEntity = new UserEntity();
        userEntity.setF_name(first_name);
        userEntity.setL_name(last_name);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        userRepository.saveAndFlush(userEntity);
        return "login";
    }

}
