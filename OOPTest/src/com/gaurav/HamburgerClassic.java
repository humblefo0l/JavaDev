package com.gaurav;

public class HamburgerClassic extends Hamburger {
    private boolean isCucumber;
    private boolean isMixVeggie;

    public HamburgerClassic(String breadRollType, boolean meat, boolean isLettuce, boolean isTomoto,
                            boolean isCarrot, boolean isCucumber, boolean isMixVeggie) {
        super(breadRollType, meat, isLettuce, isTomoto, isCarrot);
        this.isCucumber = isCucumber;
        if (isCarrot) {
            this.setPrice(10);
        }
        this.isMixVeggie = isMixVeggie;
        if (isMixVeggie) {
            this.setPrice(10);
        }
    }


}
