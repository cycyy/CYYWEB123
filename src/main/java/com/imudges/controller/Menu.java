package com.imudges.controller;

import com.imudges.repository.ShoppingcarRespository;
import com.imudges.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/11/17.
 */
@Controller
@SessionAttributes({"currentUser","currentShoppingcar"})
public class Menu {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ShoppingcarRespository shoppingcarRespository;
    @RequestMapping(value = "/checkout.html",method = RequestMethod.GET)
    public String Menu(){
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
    public void Add_things(int food_id){



    }


}
