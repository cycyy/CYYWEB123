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
        return "index";
    }
}
