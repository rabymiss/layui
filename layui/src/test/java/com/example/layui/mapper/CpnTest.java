package com.example.layui.mapper;

import com.example.layui.entity.CpnMsgEntity;
import com.example.layui.entity.OutEntity;
import com.example.layui.service.Cpnservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CpnTest {
    @Autowired
    private Cpnservice cpn;
    @Test
void text(){

        for (int i=0;i<50;i++){

            CpnMsgEntity cpnMsgEntity=new CpnMsgEntity();
cpnMsgEntity.setId(100+i);
            cpn.save(cpnMsgEntity);

        }

//
//OutEntity outEntity=cpn.finddata(1,10);
//System.out.println(outEntity);
}
}