package com.example.springpj.entities.employers;

import com.example.springpj.entities.Coffee.Coffee;
import com.example.springpj.entities.Order.Order;

public class Cashier implements Employer{

    private String name;
    private String position;

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void makeCoffee(Coffee coffee) {
        System.out.println("make Coffee");
    }

    @Override
    public void createOrder(Order order) {

    }

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
    public String toString() {
        return "Cashier - " + "name: '" + name + ", position: '" + position;
    }
}
