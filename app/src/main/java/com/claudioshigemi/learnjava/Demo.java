package com.claudioshigemi.learnjava;

/**
 * Created by Claudio on 29/10/2017.
 */

public class Demo {
    public static void main(String[] args) {
        Player dim =  new Player();
        System.out.println(dim.getHandlename());

        dim.setHandlename("dim");
        System.out.println(dim.getHandlename() );

        Player jogador = new Player("Teste",4,2,2);

        System.out.println("Player: "+ jogador.getHandlename()+ ", vidas: "+ jogador.getLives()+
                ", level: "+jogador.getLevel() + ", \n pontuacao: "+jogador.getScore() +
                ", weapon: "+ jogador.getWeapon().getName());

    }
}
