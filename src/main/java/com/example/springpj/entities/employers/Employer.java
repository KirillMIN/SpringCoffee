package com.example.springpj.entities.employers;

import com.example.springpj.entities.Coffee.Coffee;
import com.example.springpj.entities.Order.Order;

public interface Employer {
    String getPosition();
    void makeCoffee(Coffee coffee);
    void createOrder(Order order);

}
