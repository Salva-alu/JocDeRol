package inici;

import joc.Alien;
import joc.Human;
import joc.Warrior;

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
        Human huma = new Human("Victor", 5, 7, 11);
        Warrior guerrer = new Warrior("Musashi", 9, 10, 15);
        Alien alien = new Alien("Goku", 12, 13, 20);

        huma.attack(guerrer);
        guerrer.attack(alien);
        alien.attack(guerrer);

    }

    public static void provaFaseV3(){

    }



}

class main{
    static void main(String[] args) {
        //JocDeRol.provaFaseV1();
        JocDeRol.provaFaseV2();
    }
}
