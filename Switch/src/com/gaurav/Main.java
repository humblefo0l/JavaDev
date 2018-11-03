package com.gaurav;

public class Main {

    public static void main(String[] args) {

        char var = 'e';
        switch (var){
            case 'a':
                System.out.println("its a");
                break;

            case 'b':
                System.out.println("its b");
                break;

            case 'c': case 'd': case 'e':
                System.out.println("its " +var);
                break;

            default:
                System.out.println("nothing found");
                break;

        }





    }
}
