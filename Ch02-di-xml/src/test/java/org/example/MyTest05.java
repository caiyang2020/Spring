package org.example;

import org.example.ba05.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {

    @Test
    public void test01(){
        String config  = "ba05/applicationcontext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        student student = (org.example.ba05.student) applicationContext.getBean("student");
        System.out.println(student.toString());

    }
}
