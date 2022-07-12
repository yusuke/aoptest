package com.example.aoptest;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    void hello(){
        System.out.println("Hello");
    }
}
