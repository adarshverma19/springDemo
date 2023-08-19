package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "singleton")
public class Doctor implements Staff, BeanNameAware {
    public void assist(){
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String name){
        System.out.println("Set Bean Name method called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Called after bean memory is freed");
    }
}
