package com.gaurav;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static double calcFeetAndInchesToCentimeters(double feet,
                                                     double inches){
        if ((feet >=0) && (inches >=0 && inches <=12)){
            double cm = feet*12*2.54 + inches*2.54;
            return cm;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if ((feet >=0)){
            double cm =  inches*2.54;
            return cm;
        }
        return -1;
    }

}
