package com.example.springpj.ApplicationAware;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EventShower implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("event: " + event.toString());
    }
}
