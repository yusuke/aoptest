package com.example.aoptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Web {
    final MyComponent myComponent;

    public Web(@Autowired MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    @GetMapping("/")
    String index() {
        myComponent.hello();
        return "index";
    }
}
