package com.caiyang;

import com.caiyang.service.SomeService;
import com.caiyang.service.impl.SomeServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.util.Date;

public class test {

    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.dosome();
    }

    /**
     * 创建Spring容器时，spring会创建文件中的所有对象
     */
    @Test
    public void test02() {
        //使用Spring容器创建对象
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象

//       SomeService service = (SomeService) applicationContext.getBean("someService");

        //使用Spring创建好的对象
//        service.dosome();

    }
    /**
     * 获取容器中Java对象的信息
     */
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        int nums = applicationContext.getBeanDefinitionCount();
        System.out.println("容器中对象数量"+nums);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String strings:
             names) {
            System.out.println(strings);

        }
    }

    /**
     * 获取一个非自定义的类的对象
     */
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Date date=(Date) applicationContext.getBean("mydate");
        System.out.println(date);

        }
    }
