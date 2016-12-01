package com.imudges.controller;

import com.imudges.model.FoodEntity;
import com.imudges.model.OrderEntity;
import com.imudges.model.ShoppingcarEntity;
import com.imudges.model.UserEntity;
import com.imudges.repository.FoodRepository;
import com.imudges.repository.OrderRepository;
import com.imudges.repository.ShoppingcarRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/11/17.
 */
@Controller
@SessionAttributes({"currentUser","currentShoppingcar"})
public class Order {
    @Autowired
    private ShoppingcarRespository shoppingcarRespository;
    private ShoppingcarEntity shoppingcarEntity;
    private UserEntity userEntity;
    private FoodEntity foodEntity;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private OrderRepository orderRepository;
    @RequestMapping(value = "/ok",method = RequestMethod.POST)
    public String Show(ModelMap modelMap){
        shoppingcarEntity=(ShoppingcarEntity) modelMap.get("currentShoppingcar");
        userEntity=(UserEntity) modelMap.get("currentUser");
        String[] sourceStrArray = shoppingcarEntity.getFoodid().split(" ");
        String[] timeStrArray=shoppingcarEntity.getTime().split(";");
        for(int i=0;i<sourceStrArray.length;i++){
            foodEntity=foodRepository.findOne(Integer.valueOf(sourceStrArray[i]));
            OrderEntity orderEntity=new OrderEntity();
            orderEntity.setTime(timeStrArray[i]);
            orderEntity.setUserByCustomarid(userEntity);
            orderEntity.setPrice(foodEntity.getPrice());
            orderEntity.setFoodByFoodid(foodEntity);
            orderRepository.saveAndFlush(orderEntity);
        }
        shoppingcarRespository.delete(shoppingcarEntity);
        modelMap.addAttribute("currentShoppingcar",new ShoppingcarEntity());
        return "index";
    }


    @RequestMapping(value="deleteFood",method = RequestMethod.GET)
    public String Delete(ModelMap modelMap,int status){
        shoppingcarEntity=(ShoppingcarEntity) modelMap.get("currentShoppingcar");
        userEntity=(UserEntity) modelMap.get("currentUser");
        String[] sourceStrArray = shoppingcarEntity.getFoodid().split(" ");
        String[] timeStrArray=shoppingcarEntity.getTime().split(";");
        foodEntity=foodRepository.findOne(Integer.valueOf(sourceStrArray[status]));
        for(int i=status;i<sourceStrArray.length-1;i++){
            sourceStrArray[i]=sourceStrArray[i+1];
            timeStrArray[i]=timeStrArray[i+1];
        }
        String foodId="",times="";
        for(int i=1;i<sourceStrArray.length-1;i++){
            foodId=foodId+sourceStrArray[i];
            times=times+timeStrArray[i];
        }
        shoppingcarEntity.setAllprice(shoppingcarEntity.getAllprice()-foodEntity.getPrice());
        shoppingcarEntity.setTime(times);
        shoppingcarEntity.setFoodid(foodId);
        shoppingcarRespository.saveAndFlush(shoppingcarEntity);
        return "checkout";
    }
}
