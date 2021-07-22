package org.example.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Aspect aspectj框架中的注解
 * 作用 表示当前类的切面类
 * 位置，在类定义的上面
 */
@Aspect
public class MyAspect {
    /**
     * 定义实现切面功能的方法
     * 1 公共方法
     * 2。没用返回值
     * 3 名称自定义
     * 4 可以有参数
     * 5 参数不能是自定义的
     * 6
     */


    /**
     * @Before 前置通知注解
     *  属性：value
     *  位置在方法上边
     *
     *  特点：
     *      在目标方法之前执行
     *      不会改变方法执行结果
     *      不会影响方法的执行
     */
    @Before(value = "execution(public void org.example.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println("前置通知，在目标方法之前执行输出时间"+new Date());
    }
}
