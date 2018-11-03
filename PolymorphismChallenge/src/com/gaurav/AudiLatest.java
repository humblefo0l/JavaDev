package com.gaurav;

public class AudiLatest extends Audi{

    public AudiLatest(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "AudiLatest.startEngine() -> Engine starting.";
    }
}
