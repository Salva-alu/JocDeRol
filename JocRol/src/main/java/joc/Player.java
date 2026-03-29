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

    //metodos
    @Override
    public String toString(){
        return name + " PA:" + attackPoints + " / PD:" + defensePoints + " / PV:" + life;
    }

    public void attack(Player p){
        // en main per a invocar seria this.attack(p);
        p.hit(this.attackPoints);
        if (p.life > 0){
            p.attack(this);
        }
    }

    protected void hit(int attackPoints){


        //abans del atac
        System.out.println("Atacant: " /* + toString()*/);
        System.out.println("Atacat: " + this.toString());

        //atac


        //despres del atac
        System.out.println("Atacant: " /* + .toString() */ );
        System.out.println("Atacat: " + this.toString());


    }



















}
