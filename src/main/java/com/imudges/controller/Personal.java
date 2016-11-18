package com.imudges.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/11/18.
 */
@Controller
@SessionAttributes("currentUser")
public class Personal {
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String ForgetPaswd() {
        return "index";
    }
}
