package com.example.layui.Controller;

import com.example.layui.entity.OutEntity;
import com.example.layui.service.Cpnservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cpncontroller {
   @Autowired
    private Cpnservice cpnservice;
    @RequestMapping("list")
    public OutEntity finddata(Integer page,Integer limit){

        OutEntity outEntity=cpnservice.finddata(page,limit);


        return outEntity;
    }

}
