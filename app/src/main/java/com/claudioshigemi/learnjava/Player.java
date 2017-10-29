package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 29/10/2017.
 */

public class Player {
    private String handlename;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;

    public Player() {
        this.handlename = "Unknown player";
        this.lives = 3;
        this.level = 1;
        this.score = 0;
    }

    public Player(String name, int lives, int level, int score) {

        this.setHandlename(name);
        this.setLives(lives);
        this.setLevel(level);
        this.setScore(score);
        this.setDefaultWeapon();

    }

    public String getHandlename() {
        return handlename;
    }

    public void setHandlename(String handle) {
        if (handle.length() < 3) {
            System.out.println(" Nome tem que ter 3 caracterees ou mais.");
            return;
        }
        this.handlename = handlename;

    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("sword", 10, 20);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
