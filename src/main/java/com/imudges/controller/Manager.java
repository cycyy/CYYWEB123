package com.imudges.controller;

import com.imudges.model.FoodEntity;
import com.imudges.model.ImageEntity;
import com.imudges.model.OrderEntity;
import com.imudges.model.UserEntity;
import com.imudges.repository.FoodRepository;
import com.imudges.repository.ImageRepository;
import com.imudges.repository.OrderRepository;
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
    ImageRepository imageRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    FoodRepository foodRepository;
    private UserEntity userEntity;
    private OrderEntity orderEntity;
    private FoodEntity foodEntity;
    private ImageEntity imageEntity;
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
    @RequestMapping(value = "/index_v1.html",method = RequestMethod.GET)
    public String ShowFood(ModelMap modelMap){
        List<FoodEntity> foodEntityList=foodRepository.findAll();
        modelMap.addAttribute("foodEntityList",foodEntityList);
        return "index_v1";
    }
    @RequestMapping(value = "/index_v2.html",method = RequestMethod.GET)
    public String AddFood(ModelMap modelMap){
        /*List<FoodEntity> foodEntityList=foodRepository.findAll();
        modelMap.addAttribute("foodEntityList",foodEntityList);*/
        return "index_v2";
    }
    @RequestMapping(value = "DeleteUser",method = RequestMethod.GET)
    public String DeleteUser(int id,ModelMap modelMap){
        userRepository.delete(id);
        List<UserEntity> userEntityList=userRepository.findAll();
        modelMap.addAttribute("userEntityList",userEntityList);
        return "index_v0";
    }
    @RequestMapping(value = "DeleteFood",method = RequestMethod.GET)
    public String DeleteFood(int id,ModelMap modelMap){
        List<OrderEntity> orderEntities = orderRepository.findAll();
        for(OrderEntity orderEntity:orderEntities){
            if(orderEntity.getFoodByFoodid().getId()==id){
                orderRepository.delete(orderEntity);
            }
        }
        List<ImageEntity> imageEntities = imageRepository.findAll();
        for(ImageEntity imageEntity:imageEntities){
            if(imageEntity.getFoodByFoodid().getId()==id){
                imageRepository.delete(imageEntity);
            }
        }
        foodRepository.delete(id);
        List<FoodEntity>foodEntityList=foodRepository.findAll();
        modelMap.addAttribute("foodEntityList",foodEntityList);
        return "index_v1";
    }


    /*
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String ChangeFood(int id){
        return "";
    }*/
}
