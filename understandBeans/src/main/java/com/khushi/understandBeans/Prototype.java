package com.khushi.understandBeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Prototype {
    public Prototype(){
        System.out.println("Prototype bean instance created");
    }
}
