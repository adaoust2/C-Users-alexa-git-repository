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
        ArrayList<Player> pl = new ArrayList<Player>();
        for (int i=0; i<32; i++){
            HashMap<String, Player> players = new HashMap<String, Player>();
            Club newClub = new Club("","",players);
            newClub.setName(clubNames[i]);

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
