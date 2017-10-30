package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 29/10/2017.
 */

public class HellorWorld {
    //psvm
    public static void main(String[] args) {
        //soup
        System.out.println("Hello World.");
        System.out.println("My first Java Program");

        //String nome ;
        String nome = "Claudio";
        int valor = 1000;
        int salario = valor * 4;
        System.out.println(nome);
        System.out.println(salario);

        int apple = 3;
        int orange = 6;
        int result = apple + orange;
        System.out.println(result);
        System.out.println(" Tenho " + result + " de frutas.");

        int semanas = 130;
        double ano = semanas / 52.0;
        System.out.println(ano);
        System.out.println("  ano " + ano + "tem.");


        int lives = 3;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);

        if (isGameOver) {
            System.out.println("Game over!");
        } else {
            System.out.println("You're still alive!");
        }
    }
}


