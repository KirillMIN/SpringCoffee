package com.example.springpj.entities.Order;

import com.example.springpj.entities.Coffee.Coffee;
import com.example.springpj.entities.employers.Employer;

import java.util.ArrayList;

public class Order {

    private Long id;
    private ArrayList<Coffee> order;
    private Employer employer;

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Coffee> getOrder() {
        return order;
    }


    public void setOrder(ArrayList<Coffee> order) {
        this.order = order;
    }
}
