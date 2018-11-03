package com.gaurav;

public class HamburgerDelux extends Hamburger {
    private boolean chips;
    private boolean drinks;

    public HamburgerDelux(String breadRollType, boolean meat, boolean isLettuce, boolean isTomoto, boolean isCarrot) {
        super(breadRollType, meat, isLettuce, isTomoto, isCarrot);
        this.chips = true;
        this.drinks = true;
        this.setPrice(20);  //10 each for drinks and chips.
    }



}
