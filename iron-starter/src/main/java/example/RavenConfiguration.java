package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RavenConfiguration {

    @Bean
    RavenListener ravenListener(){
        return new RavenListener();
    }
}
