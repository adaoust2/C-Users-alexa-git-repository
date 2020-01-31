package generator;

import data.Club;
import data.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ClubGenerator {

    private static String[] clubNames = { "Celics", "Nuggets", "Lakers",
            "Spurs", "Thunder", "Jazz", "Rockets",
            "Pelicans", "Raptors", "Bucks", "Pacers", "Cavaliers",
            "Heat", "Hornets", "Bulls", "Nets", "Grizzlies", "Mavericks", "Warriors","Clippers",
            "Timberwolves","Pistons", "Magic", "Wizards","Hawks", "Knicks", "Suns", "Kings", "Blazers", "Thunder", "Bouncers", "Winners"
    };

    private static String[] postes = {"meneur","arriere","ailier","ailier_fort","pivot","meneur","arriere","ailier","ailier_fort",
            "pivot", "meneur", "ailier"};

    public ClubGenerator(){

    }

    public ArrayList<Club> generateClubs(){
        ArrayList<Club> clubs = new ArrayList<Club>();
        for (int i=0; i<32; i++){
            Club newClub = new Club();
            newClub.setName(clubNames[i]);
            HashMap<String, Player> players = new HashMap<String, Player>();
            for (int j=0; j<12; j++){
                PlayerGenerator generator = new PlayerGenerator(newClub, postes[j]);
                Player newPlayer = generator.generatePlayer();
                players.put(newPlayer.getName(), newPlayer);
            }
            newClub.setPlayers(players);
            clubs.add(newClub);
        }

        return clubs;

    }

}
