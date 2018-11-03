package com.gaurav;

public class Audi extends Car{
    private int bag;
    private boolean isManual;

    public Audi(String name, int cylinder) {
        super(name, cylinder);

    }

    @Override
    public int getCylinder() {
        return super.getCylinder();
    }

    public String startEngine(){
        return "Audi.startEngine() -> Engine starting.";
    }

    @Override
    public String getName() {
        return "Audi.getName() -> " + super.getName();
    }


}
