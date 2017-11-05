package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 29/10/2017.
 */

public class Demo {

    public static void main(String[] args) {

//        Enemy enemy = new Enemy("test Enemy ", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(10);
//        enemy.showInfo();
        Troll uglyTroll =  new Troll("Ugly troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(8);
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);
        uglyTroll.showInfo();

        Vampyre vlad = new Vampyre("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();

        VampyreKing vampKing = new VampyreKing("Vamp King");
        vampKing.showInfo();
        vampKing.takeDamage(20);
        vampKing.showInfo();


    }





}

































