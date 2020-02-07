package generator;

import data.Club;
import data.Player;
import data.PlayerStats;

import java.util.HashMap;
import java.util.Map;

public class MoyenneGenrator {

    private Club club;

    public MoyenneGenrator(){

    }

    public MoyenneGenrator(Club club){
        this.club = club;
    }

    public float calculMoyenne(){
        float moyenne = 0;
        float somme = 0;
        HashMap<String, Player> players = this.club.getPlayers();

        for (Map.Entry me : players.entrySet()) {
            Player currentPlayer = (Player) me.getValue();
            PlayerStats stats = currentPlayer.getpStats();
            somme = somme + stats.getMoyenne();
        }
        return somme/12;
    }

}
