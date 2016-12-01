package com.imudges.controller;

/**
 * Created by Administrator on 2016/11/14.
 */

import com.imudges.model.FoodEntity;
import com.imudges.repository.FoodRepository;
import com.imudges.tool.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shhao.
 * Date: 14-9-1
 * Time:下午4:32
 */
@Controller
public class FileController {
    @Autowired
    FoodRepository foodRepository;
    private FoodEntity foodEntity;
    @RequestMapping("test")
    public String test(){
        return "test";
    }
    @RequestMapping(value = "addFood",method = RequestMethod.POST)
    public void AddFood(String name,String kind,String price,MultipartFile image, HttpServletRequest request, HttpServletResponse response) throws IOException {
        foodEntity=new FoodEntity();
        foodEntity.setName(name);
        foodEntity.setKind(kind);
        foodEntity.setPrice(Integer.valueOf(price));
        foodRepository.saveAndFlush(foodEntity);
        String filePath = FileUpload.uploadFile(image, request);
        System.out.println("filePath："+filePath);
        response.setContentType("text/html;charset=utf8");
        response.getWriter().write("<img src='"+filePath+"'/>");
    }

}