package com.imudges.controller;

import com.imudges.model.OrderEntity;
import com.imudges.model.UserEntity;
import com.imudges.repository.OrderRepository;
import com.imudges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/10/26.
 */
@Controller
@SessionAttributes({"currentUser","currentOrder"})

public class Login {
    @Autowired
    private UserRepository userRepository;
    private OrderRepository orderRepository;
    @RequestMapping(value = "/login.html",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/user_login",method = RequestMethod.POST)
    public String  Verification(String email,String password,ModelMap modelMap){
        UserEntity userEntity=userRepository.findByEmail(email) ;
        int customerId=userEntity.getId();
        OrderEntity orderEntity=orderRepository.findByCustomarID(customerId);
        if(userEntity==null){
            return "login";
        }
        else{
            if(userEntity.getPassword().equals(password)) {
                //<p>${currentUser.name}</p>
                modelMap.addAttribute("currentUser", userEntity);
                //UserEntity userEntity1 = (UserEntity) modelMap.get("currentUser");  判断是否登录了用户
                return "index";
            }
            else
                return "login";
        }
    }
}
