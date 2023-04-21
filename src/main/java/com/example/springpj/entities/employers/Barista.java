package com.example.springpj.entities.employers;

import com.example.springpj.entities.Coffee.Coffee;
import com.example.springpj.entities.Order.Order;

public class Barista implements Employer{

    private String name;
    private String position;
    private Order order;

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void makeCoffee(Coffee coffee) {
        System.out.println("make coffee: " + coffee.getName());

    }

    @Override
    public void createOrder(Order order) {
        for(Coffee coffee : order.getOrder()){
            makeCoffee(coffee);
        }
    }
}
