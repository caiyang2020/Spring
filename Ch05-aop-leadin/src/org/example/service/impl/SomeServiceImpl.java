package org.example.service.impl;

import org.example.service.SomeService;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome() {
        System.out.println(new Date());
        System.out.println("执行dosome");
    }

    @Override
    public void doother() {
        System.out.println(new Date());
        System.out.println("执行doother");

    }
}
