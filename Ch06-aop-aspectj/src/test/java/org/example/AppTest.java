package org.example;

import static org.junit.Assert.assertTrue;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.example.ba01.SomeService;
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
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) applicationContext.getBean("someService");
        System.out.println(service.getClass().getName());
        service.doSome("wangwu",18);
}
}
