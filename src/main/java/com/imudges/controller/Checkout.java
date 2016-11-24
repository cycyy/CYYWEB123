package com.imudges.controller;

import com.imudges.model.ShoppingcarEntity;
import com.imudges.repository.ShoppingcarRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by cyy on 2016/11/17.
 */
@Controller
@SessionAttributes({"currentUser","currentShoppingcar"})
public class Checkout {
    @Autowired
    private ShoppingcarRespository shoppingcarRespository;
    private ShoppingcarEntity shoppingcarEntity;
    public void Show(ModelMap modelMap){

    }
}
