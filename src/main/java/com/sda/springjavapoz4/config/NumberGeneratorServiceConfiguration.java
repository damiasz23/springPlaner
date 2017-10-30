package com.sda.springjavapoz4.config;

import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumberGeneratorServiceConfiguration {

    @Bean
    public RandomGeneratorNumberService small(){
        return new RandomGeneratorNumberService(50, 0);
    }

    @Bean
    public RandomGeneratorNumberService big(){
        return new RandomGeneratorNumberService(9000, 1000);
    }
}
