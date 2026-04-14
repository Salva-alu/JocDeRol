package joc;

public class Alien extends Player{

    public Alien(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }



    @Override
    public void attack(Player p){
        if (this.getLife() > 20){
            this.setAttackPoints(this.getAttackPoints() + 3);
            this.setDefensePoints(this.getDefensePoints() - 3);
        }

        System.out.println("Atacant: " + this.toString());
        System.out.println("Atacat: " + p.toString());

        p.hit(this.getAttackPoints());
        if (p.getLife() > 0){
            this.hit(p.getAttackPoints());
        }

        System.out.println("Atacant: " + this.toString());
        System.out.println("Atacat: " + p.toString() + "\n");
    }
}
