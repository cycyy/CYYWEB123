package com.imudges.controller;

import com.imudges.model.FoodEntity;
import com.imudges.model.UserEntity;
import com.imudges.repository.FoodRepository;
import com.imudges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by cyy on 2016/11/28.
 */
@Controller
public class Manager {
    @Autowired
    UserRepository userRepository;
    @Autowired
    FoodRepository foodRepository;
    private UserEntity userEntity;
    private FoodEntity foodEntity;
    @RequestMapping(value = "/manager.html",method = RequestMethod.GET)
    public String login(){
        return "manager";
    }
    @RequestMapping(value = "/manager2.html",method = RequestMethod.GET)
    public String login1(){
        return "manager2";
    }
    @RequestMapping(value = "/index_v0.html",method = RequestMethod.GET)
    public String ShowUser(ModelMap modelMap){
        List<UserEntity> userEntityList=userRepository.findAll();
        modelMap.addAttribute("userEntityList",userEntityList);
        return "index_v0";
    }
    @RequestMapping(value = "DeleteUser",method = RequestMethod.GET)
    public String DeleteUser(int id,ModelMap modelMap){
        userRepository.delete(id);
        List<UserEntity> userEntityList=userRepository.findAll();
        modelMap.addAttribute("userEntityList",userEntityList);
        return "index_v0";
    }

    /*@RequestMapping(value = "/index_v0.html",method = RequestMethod.GET)
    public String ShowFood(ModelMap modelMap){
        List<UserEntity> userEntityList=userRepository.findAll();
        modelMap.addAttribute("userEntityList",userEntityList);
        return "index_v1";
    }


    @RequestMapping(value = "",method = RequestMethod.GET)
    public String DeleteFood(int id){
        userEntity=userRepository.findOne(id);
        return "";
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String AddFood(int id){
        return "";
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String ChangeFood(int id){
        return "";
    }*/
}
