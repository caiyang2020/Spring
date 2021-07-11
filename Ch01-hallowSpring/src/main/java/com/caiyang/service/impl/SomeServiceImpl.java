package com.caiyang.service.impl;

import com.caiyang.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public void dosome() {
        System.out.println("执行了SomeService的Dosome方法");
    }

    public SomeServiceImpl() {
        System.out.println("无参构造方法");
    }
}
