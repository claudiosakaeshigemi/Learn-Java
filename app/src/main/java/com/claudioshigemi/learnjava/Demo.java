package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 29/10/2017.
 */

public class Demo {

    public static void main(String[] args) {
        Player dim = new Player("Tom Smith", 8);
//        System.out.println(dim.getHandleName());
//        System.out.println("Level: " + dim.getLevel());
//        System.out.println("Lives: " + dim.getLives());
//        System.out.println(dim.getWeapon().getName());
//        Weapon timsWeapon = dim.getWeapon();
//        System.out.println(timsWeapon.getName());
//        System.out.println(dim.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        dim.setWeapon(myAxe);
//        System.out.println(dim.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        dim.pickUpLoot(redPotion);

        dim.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        dim.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        dim.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));

        dim.showInventory();

//        Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 6);
        boolean wasDeleted = dim.dropLoot(redPotion);
        System.out.println(wasDeleted);
        dim.showInventory();
    }
}

































