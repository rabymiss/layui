package com.example.layui.service.Iml;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.layui.entity.CpnMsgEntity;
import com.example.layui.entity.OutEntity;
import com.example.layui.mapper.Cpn;
import com.example.layui.service.Cpnservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CpnsIml implements Cpnservice {
    @Autowired
    private Cpn cpn;
    @Override
    public OutEntity finddata(Integer page,Integer limit) {
        OutEntity outEntity=new OutEntity();
        outEntity.setCode(0);
        outEntity.setMsg(null);

        IPage<CpnMsgEntity>page1= new Page<>(page,limit);
        IPage<CpnMsgEntity>result=cpn.selectPage(page1,null);
        outEntity.setCount(result.getTotal());
        List<CpnMsgEntity>list =result.getRecords();
        outEntity.setData(list);
        return outEntity;
    }

    @Override
    public int save(CpnMsgEntity cpnMsgEntity) {
        cpn.insert(cpnMsgEntity);
        return 0;
    }
}
