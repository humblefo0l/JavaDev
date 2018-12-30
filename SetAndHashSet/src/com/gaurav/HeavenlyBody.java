package com.gaurav;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellite;
    private final BodyTypes bodyType;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTERIOD
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellite = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellite.add(moon);
    }

    public Set<HeavenlyBody> getSatellite() {
        return new HashSet<>(this.satellite);
    }


    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            return true;
        }

//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//        if ((obj == null) || (obj.getClass() != this.getClass())){
//            return false;
//        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
        return false;
    }

    @Override
    public final int hashCode() {
//        System.out.println("name in hascode " + this.name + " : " + this.name.hashCode());
        return this.name.hashCode() + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }
}
