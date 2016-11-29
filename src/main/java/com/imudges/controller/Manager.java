package com.imudges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cyy on 2016/11/28.
 */
@Controller
public class Manager {

    @RequestMapping(value = "/manager.html",method = RequestMethod.GET)
    public String login(){
        return "manager";
    }
}
