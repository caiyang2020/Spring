package org.example.ba06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Resourse : 来自jdk的注解，Spring支持
 * 默认 byName
 */
@Component(value = "myStudent")//等同于bean标签
public class student {
    @Value(value = "张三")
    private String name;

    private int age;

    @Resource
    private org.example.ba06.school school;


//    public void setName(String name) {
//        this.name = name;
//    }
//
    @Value("28")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
