package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 05/11/2017.
 */

public class VampyreKing extends  Vampyre {

    public VampyreKing(String name) {
        super(name);
        setHitPoints(40);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = damage/2;
        super.takeDamage(damageDone);
    }
}
