package org.example.ba02;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("=======目标方法doSome=======");

    }

    @Override
    public String doOther(String Name, Integer age) {
        System.out.println("=====doOther()======");
        return "abcd";
    }
}
