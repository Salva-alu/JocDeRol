package joc;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String nom) {
        this.name = nom;
    }

    @Override
    public String toString(){
        String res = "Equip " + this.name + ":";
        for (int i = 0; i < players.size(); i++) {
            res += "\n\t" + players.get(i);
        }
        return res;
    }

    public boolean equals(Team altre){ // compare equips, no objectes
        if (this == altre) return true; //compara referencia
        return this.name.equals(altre.name) && this.players.equals(altre.players);
    }

    public void afegirJugador(Player jugador){
        if (!players.contains(jugador)){
            players.add(jugador);
            jugador.afegirEquip(this);
        }
    }

    public void eliminarJugador(Player jugador){
        if (players.contains(jugador)){
            players.remove(jugador);
            jugador.llevarEquip(this);
        }
    }

}
