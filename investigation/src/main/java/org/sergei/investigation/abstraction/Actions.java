package org.sergei.investigation.abstraction;

public abstract class Actions {
    
    private String hello;
    
    public Actions(String hello) {
        this.hello = hello;
    }

    public void metOne() {
        System.out.println("Method one");
    }
    
    public void metTwo() {
        System.out.println("Care");
    }
    
    public void metThree() {
        System.out.println("Love");
    }
    
    public String hello() {
        return hello;
    }
    
    public abstract void metImpl();
}
