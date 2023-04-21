package com.example.springpj.AOP;

import com.example.springpj.entities.employers.Employer;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeBaristaAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if(method.getName().equals("getEmployer")) {
            if (method.getReturnType().equals(Employer.class)) {
                System.out.println("Может варить кофе");
            } else {
                System.out.println("Не может варить кофе");
            }
        }
    }
}
