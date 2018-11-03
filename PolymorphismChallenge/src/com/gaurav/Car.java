package com.gaurav;

public class Car {
    private String name;
    private boolean engine = true;
    private int wheel = 4;
    private int cylinder;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
    }


    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine(){
        return "Car.startEngine() -> Engine starting.";
    }

    public String  accelerate(){
        return ("Car.accelerate() -> Accelerating the vehicle.");
    }

    public String  stop(){
        return ("Car.stop() -> Stoping the vehicle");
    }


}
