package com.gaurav;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printMegaBytesAndKiloBytes(0);
//        System.out.println(bark(true, -1));
//        System.out.println(isLeapYear(1800));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes>= 0 ){
            int mb = 1024;

            int qut = kiloBytes / mb;
            int reminder = kiloBytes % mb;

            System.out.println(kiloBytes + " KB = "
                    + qut + " MB and " + reminder + " KB");

        } else
            System.out.println("Invalid Value");
    }

    public static boolean bark(boolean barking, int hourOfDay){
        if (barking && hourOfDay > 0){
            if (hourOfDay < 8 && hourOfDay > 22) return true;
            return false;

        }else return false;
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <=9999){
            if (year%400 == 0){
                return true;
            }else if (year %4 == 0 && year%100 != 0){
                return true;
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        one =(int)(one *1000);
        two =(int)(two *1000);

        System.out.println(one);
        System.out.println(two);
        if (one == two){
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int a, int b, int c){
        if ((a+b) == c) {
            return true;
        }

        return false;
    }

    public static boolean hasTeen(int a, int b, int c){
        if (((a >= 13  && ((a||b||c) <= 19){
            return true;
        }

    }
}
