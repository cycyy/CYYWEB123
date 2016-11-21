package com.imudges.controller;

import com.imudges.repository.FoodRepository;
import com.imudges.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyy on 2016/10/25.
 */
@Controller
public class MainController {
    @Autowired
    FoodRepository foodRepository;
    @Autowired
    ImageRepository imageRepository;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
   /* @RequestMapping(value = "/personal.html",method = RequestMethod.GET)
    public String Personal(){
        return "personal";
    }*/
    @RequestMapping(value = "/menu.html",method = RequestMethod.GET)
    public String Menu(ModelMap modelMap){
        List<FoodEntity> foodEntityList = foodRepository.findAll();
        List<ImageEntity> imageEntityList=new ArrayList<ImageEntity>();
        for(FoodEntity foodEntity:foodEntityList){

        }

        return "menu";
    }




}