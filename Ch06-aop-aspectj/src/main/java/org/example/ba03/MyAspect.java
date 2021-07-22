package org.example.ba03;

import jdk.nashorn.internal.codegen.ObjectClassGenerator;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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

    /**
     * @around
     * 功能最强的通知
     * 在方法前后都能增强功能
     * 控制目标方法是否能调用执行
     * 修改目标方法的执行结果 影响最后的调用结果
     *
     * 参数
     *
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(new Date());
        Object obj =  pjp.proceed();
        System.out.println("方法之后");
        return "obj";
    }
}
