package com.imudges.controller;

import com.imudges.model.UserEntity;
import com.imudges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/11/18.
 */
@Controller
@SessionAttributes("currentUser")
public class Personal {
    @Autowired
    UserRepository userRepository;
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String ForgetPaswd() {
        return "index";
    }
    @RequestMapping(value = "/change_message",method = RequestMethod.POST)
    public String Get(ModelMap modelMap,String first_name, String last_name, String email, String old_password, String new_password1, String new_password2, String phone_number, String sex){
        UserEntity userEntity1 = (UserEntity) modelMap.get("currentUser");
        if(!userEntity1.getPassword().equals(old_password)) {
            return "personal";
        }
        else {
            if(new_password1.equals(new_password2)) {
                userRepository.findOne(userEntity1.getId());
                if(first_name!="") { userEntity1.setF_name(first_name);}
                if(last_name!="") { userEntity1.setL_name(last_name);}
                if(email!="") { userEntity1.setEmail(email);}
                if(new_password1!="") { userEntity1.setPassword(new_password1);}
                if(phone_number!="") { userEntity1.setPhoneNumber(phone_number);}
                if(sex!="") { userEntity1.setSex(sex);}
                userRepository.saveAndFlush(userEntity1);
                return "index";
            }
            else{
                return  "personal";
            }
        }
    }
}
