package com.gaurav;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("defaultCar", 4);
        Audi audi = new Audi("Audi", 8);
        Audi lambo = new AudiLatest("Lamborgini", 8);



        System.out.println(car1.startEngine());
        System.out.println(audi.startEngine());
        System.out.println(lambo.startEngine());
    }
}
