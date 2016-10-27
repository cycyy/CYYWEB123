package com.imudges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cyy on 2016/10/25.
 */
@Controller
public class MainController {
    Login login;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "index";
    }
   @RequestMapping(value = "/login.html",method = RequestMethod.GET)
   public String login(){
       return "login";
   }


}