package com.khushi.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

    @Autowired //field injection
//    private Laptop laptop;
    // @Qualifier("laptop") //this class will be taken in first priority
    private Computer comp;

//    //Constructor injection // Autowire use is optional
//    public MyClass(Laptop laptop){
//        this.laptop = laptop;
//    }

//    @Autowired // Setter injection
//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }

    public void build(){

        comp.compile();

        System.out.println("Hello, khushi here");
    }
}
