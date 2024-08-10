package com.khushi.understandBeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Singleton {
    public Singleton(){
        System.out.println("Signleton Bean instance created");
    }
}
