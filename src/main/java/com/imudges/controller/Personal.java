package com.imudges.controller;

import com.imudges.model.UserEntity;
import com.imudges.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/11/18.
 */
@Controller
@SessionAttributes("currentUser")
public class Personal {
    UserRepository userRepository;
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String ForgetPaswd() {
        return "index";
    }
    @RequestMapping(value = "/change_message",method = RequestMethod.POST)
    public String Get(String first_name,String last_name,String email,String password,String phone,String sex){
        UserEntity userEntity = new UserEntity();
        userEntity.setF_name(first_name);
        userEntity.setL_name(last_name);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        userEntity.setPhoneNumber(Integer.parseInt(phone));
        userEntity.setSex(sex);
        userRepository.saveAndFlush(userEntity);
        return "index";
    }
}
