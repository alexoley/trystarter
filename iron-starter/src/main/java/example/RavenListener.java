package com.example;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.ApplicationListener;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("hiiii wooorld!!");
    }
}