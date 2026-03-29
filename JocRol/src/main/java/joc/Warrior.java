package joc;

public class Warrior extends Human{


    public Warrior() {
        System.out.println("CONSTRUCTOR -> He creat un Guerrer");
    }

    public Warrior(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }
}
