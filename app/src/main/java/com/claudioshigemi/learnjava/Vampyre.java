package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 05/11/2017.
 */

public class Vampyre extends Enemy {


    public Vampyre(String name) {
        super(name,20,3);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = (damage/2);
        super.takeDamage(damageDone) ;
    }

    public  boolean runAway(){
        if (getLives() < 2){
            return  true;
        }else {
            return false;
        }

    }


}
















