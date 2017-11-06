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

        for (int i = 0; i < 10; i++) {
            VampyreKing vampKing = new VampyreKing("Vamp King");
            vampKing.showInfo();
            vampKing.setLives(0);
            vampKing.setLives(vampKing.getLives() + 1);
            do {

                if (vampKing.dodges()) {
                    continue;
                }
                if (vampKing.runAway()) {
                    System.out.println("VampKing ran away.");
                    break;
                } else {
                    vampKing.takeDamage(12);
                    vampKing.showInfo();
                }
            } while (vampKing.getLives() > 0);
            System.out.println("=================================");
        }

        Troll uglyTroll = new Troll("Ugly troll");
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

        while (vampKing.getLives() > 0) {
            if (vampKing.dodges()) {
                continue;
            }
            if (vampKing.runAway()) {
                System.out.println("VampKing ran away.");
                break;
            } else {
                vampKing.takeDamage(12);
                vampKing.showInfo();
            }
        }

        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of Speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();


        System.out.println(conan.score());
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());


    }


}

































