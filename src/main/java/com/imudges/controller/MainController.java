package com.imudges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/10/25.
 */
@Controller
@SessionAttributes("currentUser")
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/index.html",method = RequestMethod.GET)
    public String CYY(){
        return "index";
    }
    @RequestMapping(value = "/menu.html",method = RequestMethod.GET)
    public String Menu(){
        return "menu";
    }



}