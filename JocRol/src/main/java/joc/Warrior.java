package joc;

public class Warrior extends Human{

    public Warrior(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }

    @Override
    protected void hit(int attackPoints){
        int dany = attackPoints - this.getDefensePoints();
        if (dany < 0) dany = 0;
        if (dany <= 5) dany = 0;

        int videsAnteriors = this.getLife() - dany;

        if (this.getLife() < 0) this.setLife(0);

        int vidaActual = videsAnteriors - this.getLife();
        if (vidaActual < 0) vidaActual = 0;

        System.out.println(this.getName() + " es colpejat amb " + attackPoints + " punts i es defen amb " + this.getDefensePoints() + ". Punts de vida: " + getLife() + " - " + videsAnteriors + " = " + vidaActual);

        this.setLife(this.getLife() - dany);
    }


}
