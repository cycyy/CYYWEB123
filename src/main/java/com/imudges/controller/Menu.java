package com.imudges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cyy on 2016/11/17.
 */
@Controller
public class Menu {
    @RequestMapping(value = "/checkout.html",method = RequestMethod.GET)
    public String Menu(){
        return "checkout";
    }


}
