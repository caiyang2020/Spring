package org.example;

import org.example.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest3
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) applicationContext.getBean("someService");
        System.out.println(service.getClass().getName());
        Object res=service.doFirst("wangwu",18);
        System.out.println(res);
}
}
