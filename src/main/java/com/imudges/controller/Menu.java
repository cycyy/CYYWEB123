package com.imudges.controller;

import com.imudges.model.FoodEntity;
import com.imudges.model.ShoppingcarEntity;
import com.imudges.model.UserEntity;
import com.imudges.repository.FoodRepository;
import com.imudges.repository.ShoppingcarRespository;
import com.imudges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by cyy on 2016/11/17.
 */
@Controller
@SessionAttributes({"currentUser","currentShoppingcar"})
public class Menu {
    private int things_num=0;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ShoppingcarRespository shoppingcarRespository;
    private UserEntity userEntity;
    private ShoppingcarEntity shoppingcarEntity;
    @RequestMapping(value = "/checkout.html",method = RequestMethod.GET)
    public String Menu(ModelMap modelMap){
        shoppingcarEntity=(ShoppingcarEntity)modelMap.get("currentShoppingcar");
        String[] sourceStrArray = shoppingcarEntity.getFoodid().split(" ");
        modelMap.addAttribute("sourceStrArray",sourceStrArray);

        return "checkout";
    }
    @RequestMapping(value = "/personal.html",method = RequestMethod.GET)
    public String Personal(){
        return "personal";
    }

    @RequestMapping(value = "/add_submit",method = RequestMethod.POST)
    public String Submit(){
        return "index";
    }
    @RequestMapping(value="add_things",method = RequestMethod.GET)
    public String Add_things(ModelMap modelMap,int foodId,int foodPrice){
        userEntity = (UserEntity) modelMap.get("currentUser");
        shoppingcarEntity = shoppingcarRespository.findByCookie(userEntity.getEmail());
        String newfoodId=String.valueOf(foodId);
        String oldFoodId=shoppingcarEntity.getFoodid();
        if(oldFoodId==null){
            oldFoodId="";
        }
        newfoodId=oldFoodId+" "+newfoodId;
        shoppingcarEntity.setFoodid(newfoodId);
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String newtime = df.format(day);
        String oldtime=shoppingcarEntity.getTime();
        if(oldtime==null){
            oldtime="";
        }
        oldtime=oldtime+";"+newtime;
        shoppingcarEntity.setTime(oldtime);
        int newPrice=foodPrice;
        int oldPrice=shoppingcarEntity.getAllprice();
        newPrice=newPrice+oldPrice;
        shoppingcarEntity.setAllprice(newPrice);
        shoppingcarRespository.saveAndFlush(shoppingcarEntity);
        List<FoodEntity> foodEntityList = foodRepository.findAll();
        modelMap.addAttribute("foodEntityList",foodEntityList);
        modelMap.addAttribute("currentShoppingcar",shoppingcarEntity);
        String[] sourceStrArray = newfoodId.split(" ");
        things_num=sourceStrArray.length-1;
        modelMap.addAttribute("number",things_num);
        return "menu";
    }


}
