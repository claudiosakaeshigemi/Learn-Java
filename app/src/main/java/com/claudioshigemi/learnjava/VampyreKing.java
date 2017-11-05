package com.claudioshigemi.learnjava;

import java.util.Random;

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

    public  boolean dodges(){
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if (chance > 3){
            System.out.println("King dodges");
            return  true;
        }
        return  false;
    }
}
