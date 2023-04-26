package com.example.demo;

public class Person {
    String name;
    final Long id;


    
    public Person(String name, Long id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    
    
}
