package com.khushi.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //interface choose this first when we call this
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compiling with 404 bug bit faster!!");
    }
}
