package com.nag.reststart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUnderWorld {

    @GetMapping(path="/hello")
    public String sayHello(){
        return "Hello Underworld !!";
    }

    @GetMapping(path="/hello-bean")
    public HelloBean sayHelloBean(){
        return new HelloBean("Hello Underworld !!");
    }
}
