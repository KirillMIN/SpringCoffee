package com.example.springpj.ApplicationAware;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {
    private String msg;

    public Event(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
