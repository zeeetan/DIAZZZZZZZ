package com.example.diazzzzzzz.service.impl;

import com.example.diazzzzzzz.service.ServiceForExample;
import org.springframework.stereotype.Service;

@Service
public class ServiceForExampleImpl implements ServiceForExample {
    @Override
    public String exampleMethod1() {
        return "Ti lox)";
    }

    @Override
    public String exampleMethod2() {
        return "brat skolko sm?";
    }
}
