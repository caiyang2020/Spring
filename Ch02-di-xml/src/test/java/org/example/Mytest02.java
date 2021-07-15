package org.example;

import org.example.ba02.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest02 {
    @Test
    public void test01(){
        String config  = "ba02/applicationcontext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        student student = (org.example.ba02.student) applicationContext.getBean("student");
        System.out.println(student.toString());

    }
}
