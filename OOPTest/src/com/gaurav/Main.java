package com.gaurav;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("normal", true, true, true, true);
        Hamburger delux = new HamburgerDelux("Delux", true, true, true, true);


        System.out.println(hamburger.getPrice());
        System.out.println(delux.getPrice());
    }
}
