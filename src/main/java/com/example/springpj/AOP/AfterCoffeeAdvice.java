package com.example.springpj.AOP;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterCoffeeAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        if(method.getName().equals("makeCoffee")){
            System.out.println("кофе готово");
        }
    }
}
