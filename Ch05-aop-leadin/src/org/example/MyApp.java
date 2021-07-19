package org.example;

import org.example.handler.MyIncationHandler;
import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
//        SomeService service = new SomeServiceImpl();
//        service.dosome();
//        service.doother();
//        使用jdk的proxy创建代理
        SomeService service = new SomeServiceImpl();
        InvocationHandler invocationHandler = new MyIncationHandler(service);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(service.getClass().getClassLoader(),service.getClass().getInterfaces(),invocationHandler);
        proxy.doother();
    }
}
