package org.example.ba03;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("=======目标方法doSome=======");

    }

    @Override
    public Object doFirst(String name, Integer age) {
        System.out.println("=======doFirst=====");
        return null;
    }
}
