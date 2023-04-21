package com.example.springpj;

import com.example.springpj.AOP.AfterCoffeeAdvice;
import com.example.springpj.entities.Order.Order;
import com.example.springpj.entities.employers.Barista;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringPjApplication {

    public static void main(String[] args) {

        //Поиск зависимостей(извлечение зависимостей)
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");


        Order order = (Order) ctx.getBean("Order");
        Barista barista = (Barista) ctx.getBean("Barista");

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(barista);
        pf.addAdvice(new AfterCoffeeAdvice());


       Barista proxy = (Barista) pf.getProxy();
       proxy.makeCoffee(order.getOrder().get(0));





    }

}
