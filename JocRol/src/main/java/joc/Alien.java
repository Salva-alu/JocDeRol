package joc;

public class Alien extends Player{


    public Alien() {
        System.out.println("CONSTRUCTOR -> He creat un Alien");
    }

    public Alien(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }
}
