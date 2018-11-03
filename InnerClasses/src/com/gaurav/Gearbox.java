package com.gaurav;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear;
    private boolean clutchIn;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i=0; i<maxGear; i++){
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIn = in;
    }

    public void addGear(int number, double ratio){
        if ((number>0) && (number <= maxGear)){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear >= 0) && (newGear < this.gears.size()) && clutchIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }else{
            System.out.println("Grind !!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIn){
            System.out.println("Screem!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }


    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }
    }




}
