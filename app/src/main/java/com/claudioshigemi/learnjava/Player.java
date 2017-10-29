package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 29/10/2017.
 */

public class Player {
    private String handlename;
    private int lives;
    private int level ;
    private int score;

    public Player(){
        this.handlename = "Unknown player";
        this.lives = 3;
        this.level = 1;
        this.score = 0;
    }

    public  Player(String name,int lives, int level, int score){

        this.handlename = name;
        this.lives = lives;
        this.level = level;
        this.score = score;

    }


    public String getHandlename() {
        return handlename;
    }

    public void setHandlename(String handle) {
        if (handle.length() < 3){
            return;
        }
        this.handlename = handlename;
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
}
