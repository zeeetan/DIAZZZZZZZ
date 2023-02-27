package com.example.diazzzzzzz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.diazzzzzzz.service.ServiceForExample;

@RestController
public class ExampleController {
    private final ServiceForExample serviceForExample;

    public ExampleController(ServiceForExample serviceForExample) {
        this.serviceForExample = serviceForExample;
    }

    @GetMapping("/ti-lox")
    public String exampleMethod1() {
        return serviceForExample.exampleMethod1();
    }

    @GetMapping("/mem")
    public String exampleMethod2() {
        return serviceForExample.exampleMethod2();
    }
}
