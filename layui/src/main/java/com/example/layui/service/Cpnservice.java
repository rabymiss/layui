package com.example.layui.service;

import com.example.layui.entity.CpnMsgEntity;
import com.example.layui.entity.OutEntity;
import org.springframework.stereotype.Service;

public interface Cpnservice {

    public OutEntity finddata(Integer page,Integer limit);
    public int save (CpnMsgEntity cpnMsgEntity);
}

