package inici;

import joc.Alien;
import joc.Human;
import joc.Team;
import joc.Warrior;

import javax.swing.*;

public class JocDeRol {
    public static void provaFaseV1(){
        /*
        System.out.println("Vaig a crear un Huma");
        Human huma = new Human();

        System.out.println("Vaig a crear un Guerrer");
        Warrior guerrer = new Warrior();

        System.out.println("Vaig a crear un Alien");
        Alien alien = new Alien();

         */
    }

    public static void provaFaseV2(){

        Human huma = new Human("Victor", 12, 7, 34);
        Warrior guerrer = new Warrior("Musashi", 17, 10, 40);
        Alien alien = new Alien("Goku", 13, 13, 25);

        huma.attack(guerrer);
        guerrer.attack(alien);
        alien.attack(guerrer);
    }

    public static void provaFaseV3(){
        Human huma = new Human("Victor", 12, 7, 34);
        Warrior guerrer = new Warrior("Musashi", 17, 10, 40);
        Alien alien = new Alien("Goku", 13, 13, 25);

        huma.toString();
        guerrer.toString();
        alien.toString();

        huma.attack(guerrer);
        guerrer.attack(alien);
        alien.attack(guerrer);

    }

    public static void provaFaseV4(){
        Human huma = new Human("Victor", 12, 7, 34);
        Human huma2 = new Human("Victor", 12, 7, 34);
        Warrior guerrer = new Warrior("Musashi", 17, 10, 40);
        Alien alien = new Alien("Goku", 13, 13, 25);

        Team equip1 = new Team("Equip 1");
        Team equip2 = new Team("Equip 2");

        huma.afegirEquip(equip1);
        guerrer.afegirEquip(equip1);
        alien.afegirEquip(equip2);

        equip1.eliminarJugador(guerrer);
        equip1.afegirJugador(alien);

        System.out.println(equip1);
        System.out.println(equip2);

        System.out.println("\nEquip1 = equip2? " + equip1.equals(equip2));
        System.out.println("huma = alien? " + huma.equals(alien));
        System.out.println("huma = huma2? " + huma.equals(huma2));
    }

}

class main{
    static void main(String[] args) {
        //JocDeRol.provaFaseV1();
        //JocDeRol.provaFaseV2();
        //JocDeRol.provaFaseV3();
        JocDeRol.provaFaseV4();

    }
}
