package org.example;

import static org.junit.Assert.assertTrue;

import org.example.ba01.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01()

    {
        String config = "ba01/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        student student = (student) applicationContext.getBean("student");
        System.out.println(student.toString());
    }

}
