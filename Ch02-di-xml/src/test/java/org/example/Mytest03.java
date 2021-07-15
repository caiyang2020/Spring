package org.example;

import org.example.ba03.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest03 {
    @Test
    public void test01(){
        String config  = "ba03/applicationcontext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        student student = (org.example.ba03.student) applicationContext.getBean("student");
        System.out.println(student.toString());

    }
    @Test
    public void test2(){
        String config  = "ba03/applicationcontext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        student student = (org.example.ba03.student) applicationContext.getBean("student01");
        System.out.println(student.toString());

    }


}
