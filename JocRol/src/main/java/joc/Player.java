package joc;

public abstract class Player {
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;

    //constructors
    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getAttackPoints() {
        return attackPoints;
    }
    public int getDefensePoints() {
        return defensePoints;
    }
    public int getLife() {
        return life;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //metodos
    @Override
    public String toString(){
        return name + " PA:" + attackPoints + " / PD:" + defensePoints + " / PV:" + life;
    }

    public void attack(Player p){
        // en main per a invocar seria this.attack(p);
        System.out.println("Atacant: " + this.toString());
        System.out.println("Atacat: " + p.toString());

        p.hit(this.attackPoints);
        if (p.life > 0){
            this.hit(p.attackPoints);
        }

        System.out.println("Atacant: " + this.toString());
        System.out.println("Atacat: " + p.toString() + "\n");
    }

    protected void hit(int attackPoints){
        int dany = attackPoints - this.defensePoints;
        if (dany < 0) dany = 0;
        int videsAnteriors = this.life - dany;

        if (this.life < 0) this.life = 0;

        int vidaActual = videsAnteriors - this.life;
        if (vidaActual < 0) vidaActual = 0;

        System.out.println(this.name + " es colpejat amb " + attackPoints + " punts i es defen amb " + this.defensePoints + ". Punts de vida: " + life + " - " + videsAnteriors + " = " + vidaActual);

        this.life -= dany;
    }
}
