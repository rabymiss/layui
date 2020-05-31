package com.example.layui.entity;

import lombok.Data;

@Data
public class OutEntity<T> {


    private int code;
    private String msg;
   private Long count;
    T Data;

}

