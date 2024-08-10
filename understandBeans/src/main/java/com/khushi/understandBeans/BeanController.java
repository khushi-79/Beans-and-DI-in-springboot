package com.khushi.understandBeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @Autowired
    private Singleton singletonBean1;

    @Autowired
    private Singleton singletonBean2;

    @Autowired
    private Prototype prototypeBean1;

    @Autowired
    private Prototype prototypeBean2;

    @GetMapping("/beans")
    public String getBeans(){
        return "Check the console for bean instantiation messages";
    }


}
