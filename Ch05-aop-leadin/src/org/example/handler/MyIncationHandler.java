package org.example.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncationHandler implements InvocationHandler {
    private Object obj;
    public MyIncationHandler(Object obj) {
        this.obj =obj;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res;
        System.out.println(System.currentTimeMillis());
        res = method.invoke(obj,args);
        return res;
    }
}
