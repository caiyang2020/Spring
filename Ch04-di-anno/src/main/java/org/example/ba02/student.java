package org.example.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @componet:创建对象的，等同于<bean>的功能
 * 属性：value就是对象的名称，也就是bean的id值
 * value的值是唯一的，创建的对象在整个spring的容器中就一个
 * 位置：在类的上面
 */
@Component(value = "myStudent")//等同于bean标签
public class student {
    @Value(value = "张三")
    private String name;

    private int age;


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
                '}';
    }
}
