package com.gaurav;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Really not good at it. Can go for swimming instead.");
    }
}
