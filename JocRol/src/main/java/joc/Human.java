package joc;

public class Human extends Player{


    public Human() {
        System.out.println("CONSTRUCTOR -> He creat un Humà");
    }

    public Human(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }
}
