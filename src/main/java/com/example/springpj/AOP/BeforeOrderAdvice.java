package com.example.springpj.AOP;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeOrderAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (method.getName().equals("getOrder")) {
            System.out.println("Вывод заказа");
        }
    }
}
